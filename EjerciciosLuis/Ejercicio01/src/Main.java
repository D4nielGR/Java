import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Carta miCarta = new Carta(3, 2);
        // System.out.println(">> " + miCarta.toString());
        Scanner sc = new Scanner(System.in);
        Baraja miBaraja = new Baraja();
        miBaraja.barajar();

        boolean stop = false;
        double suma = 0;
        while (!miBaraja.vacia() && !stop) {
            Carta scray1 = miBaraja.robar();
            suma += scray1.valor7ymedia();
            System.out.println(">> " + scray1.toString());
            System.out.print("Quiere otra carta (Y/n)? ");
            stop = sc.next().equals("n");
            if (suma == 7.5) {
                System.out.println ("Has ganado! ");
                stop = true;
            }
            else
                System.out.println ("Hasta ahora tu valor es: " + suma);
        }
        System.out.println ("Te has plantado con: " + suma);
    }
}