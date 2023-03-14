import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final char JUGADOR_1 = 'X';
    private static final char JUGADOR_2 = 'O';
    private static Scanner scanner = new Scanner(System.in);
    private static char[][] tablero;

    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de 3 en raya!");

        // Inicializar el tablero
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Seleccionar el modo de juego
        System.out.println("Seleccione el modo de juego:");
        System.out.println("1 - Contra otro jugador");
        System.out.println("2 - Contra la computadora");
        int modoJuego = scanner.nextInt();

        // Jugar el juego
        boolean finDelJuego = false;
        char jugadorActual = JUGADOR_1;
        while (!finDelJuego) {
            mostrarTablero();
            boolean jugadaValida = false;
            if (modoJuego == 1 || jugadorActual == JUGADOR_1) {
                while (!jugadaValida) {
                    jugadaValida = jugarTurno(jugadorActual);
                }
            } else {
                jugarTurnoOrdenador(jugadorActual);
            }
            finDelJuego = verificarFinDelJuego(jugadorActual);
            if (!finDelJuego) {
                jugadorActual = obtenerSiguienteJugador(jugadorActual);
            }
        }

        mostrarTablero();

        // Mostrar el resultado final
        if (verificarFinDelJuego(JUGADOR_1)) {
            System.out.println("¡Jugador 1 ha ganado!");
        } else if (verificarFinDelJuego(JUGADOR_2)) {
            System.out.println("¡Jugador 2 ha ganado!");
        } else {
            System.out.println("El juego ha terminado en empate.");
        }

    }

    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean jugarTurno(char jugador) {
        System.out.println("Jugador " + jugador + ", es tu turno.");
        System.out.print("Ingresa la fila (1-3): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Ingresa la columna (1-3): ");
        int columna = scanner.nextInt() - 1;
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            System.out.println("Movimiento inválido. Las filas y columnas van del 1 al 3.");
            return false;
        } else if (tablero[fila][columna] != ' ') {
            System.out.println("Movimiento inválido. Esa celda ya está ocupada.");
            return false;
        } else {
            tablero[fila][columna] = jugador;
            return true;
        }
    }

    private static void jugarTurnoOrdenador(char jugador) {
        System.out.println("Es el turno de la computadora.");
        Random random = new Random();
        int fila;
        int columna;
        do {
            fila = random.nextInt(3);
            columna = random.nextInt(3);
        } while (tablero[fila][columna] != ' ');
        System.out.println("La computadora ha elegido la fila " + (fila + 1) + " y la columna " + (columna + 1) + ".");
        tablero[fila][columna] = jugador;
    }

    private static boolean verificarFinDelJuego(char jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        // Verificar empate
        boolean hayCeldasVacias = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    hayCeldasVacias = true;
                }
            }
        }
        return !hayCeldasVacias;
    }

    private static char obtenerSiguienteJugador(char jugadorActual) {
        if (jugadorActual == JUGADOR_1) {
            return JUGADOR_2;
        } else {
            return JUGADOR_1;
        }
    }

}