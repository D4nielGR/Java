import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un ejericio: ");
        int seleccionEj = s.nextInt();
        while (seleccionEj < 1 || 16 < seleccionEj) {
            System.out.print("\nIntroduce un numero entre el 1 y el 16:");
            seleccionEj = s.nextInt();
        }

        switch (seleccionEj) {
            case 1:
                /* EJERCICIO 1
                Escribe un programa que muestre la tirada de tres dados.
                Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
                */
                int sumaDadosEj1 = 0;
                for (int i = 1; i <= 3; i++) {
                    int dadoEj1 = (int) (Math.random()*7+1);
                    System.out.println(i + "º tirada ->" + dadoEj1);
                    sumaDadosEj1 += dadoEj1;
                }
                System.out.printf("Total de las 3 tiradas: %d", sumaDadosEj1);
                break;//FIN Ej1

            case 2:
                /* EJERCICIO 2
                Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
                Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
                Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales:
                2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
                Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
                */
                int randomcartaPaloEj2 = (int) (Math.random()*4);
                int randomcartaNumEj2 = (int) (Math.random()*13+1);
                String cartaPaloEj2 = "";
                String cartaNumEj2 = "";

                switch (randomcartaPaloEj2) {
                    case 0:
                        cartaPaloEj2 = "picas";
                        break;
                    case 1:
                        cartaPaloEj2 = "corazones";
                        break;
                    case 2:
                        cartaPaloEj2 = "diamantes";
                        break;
                    case 3:
                        cartaPaloEj2 = "tréboles";
                        break;
                }

                switch (randomcartaNumEj2) {
                    case 1:
                        cartaNumEj2 = "A";
                        break;
                    case 11:
                        cartaNumEj2 = "J";
                        break;
                    case 12:
                        cartaNumEj2 = "Q";
                        break;
                    case 13:
                        cartaNumEj2 = "K";
                        break;
                    default:
                        cartaNumEj2 = String.valueOf(randomcartaNumEj2);
                }

                System.out.print("Tu carta es... ");
                Thread.sleep (2000);
                System.out.print("el " + cartaNumEj2 + " de " + cartaPaloEj2);
                break;//FIN Ej2

            case 3:
                /* EJERCICIO 3
                Igual que el ejercicio anterior pero con la baraja española.
                Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
                */
                int randomcartaPaloEj3 = (int) (Math.random()*4);
                int randomcartaNumEj3 = (int) (Math.random()*10+1);
                String cartaPaloEj3 = "";
                String cartaNumEj3 = "";

                switch (randomcartaPaloEj3) {
                    case 0:
                        cartaPaloEj3 = "oro";
                        break;
                    case 1:
                        cartaPaloEj3 = "copa";
                        break;
                    case 2:
                        cartaPaloEj3 = "espada";
                        break;
                    case 3:
                        cartaPaloEj3 = "basto";
                        break;
                }

                switch (randomcartaNumEj3) {
                    case 1:
                        cartaNumEj3 = "as";
                        break;
                    case 8:
                        cartaNumEj3 = "sota";
                        break;
                    case 9:
                        cartaNumEj3 = "caballo";
                        break;
                    case 10:
                        cartaNumEj3 = "rey";
                        break;
                    default:
                        cartaNumEj3 = String.valueOf(randomcartaNumEj3);
                }

                System.out.print("Tu carta es... ");
                Thread.sleep (2000);
                System.out.print("el " + cartaNumEj3 + " de " + cartaPaloEj3);
                break;//FIN Ej3


            case 4:
                /* EJERCICIO 4
                Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
                */
                for (int i = 1; i <= 20; i++) {
                    System.out.print((int)(Math.random()*11) + " ");
                }
                break;//FIN Ej4

            case 5:
                /* EJERCICIO 5
                Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
                Muestra también el máximo, el mínimo y la media de esos números.
                 */
                int maxEj5 = 100;
                int minEj5 = 199;
                for (int i = 1; i <= 50; i++) {
                    int numranEj5 = (int)(Math.random()*100+100);
                    System.out.print(numranEj5 + " ");
                    if (numranEj5 > maxEj5) {
                        maxEj5 = numranEj5;
                    }
                    if (numranEj5 < minEj5) {
                        minEj5 = numranEj5;
                    }
                }
                System.out.printf("\nMáximo: %d \nMínimo: %d \nMedia: %3.2f", maxEj5, minEj5, (float)(maxEj5+minEj5)/2);
                break;//FIN Ej5

            case 6:
                /* EJERCICIO 6
                Escribe un programa que piense un número al azar entre 0 y 100.
                El usuario debe adivinarlo y tiene para ello 5 oportunidades.
                Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y
                si el número introducido es menor o mayor que el número secreto.
                 */
                int numranEj6 = (int)(Math.random()*101);
                int intentos = 5;
                boolean win = false;

                System.out.println("Adivina un número entre el 0 y el 100, incluyendo ambos");

                while (intentos != 0 && !win) {
                    System.out.print("Adivina el numero: ");
                    int numEj6 = s.nextInt();
                    if (numranEj6 == numEj6) {
                        System.out.print("Enhorabuena, lo has adivinado :)");
                        win = true;
                    }

                    intentos--;
                    if (!win && intentos != 0) {
                        System.out.printf("MEEEEE fallaste, te quedan %d intentos\n", intentos);
                    }
                }
                if (!win) {
                    System.out.println("Lo siento, te quedaste sin intentos. Otro dia será :(");
                    System.out.println("El número era: " + numranEj6);
                }
                break;//FIN Ej6

            case 7:
                /* EJERCICIO 7
                Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
                 */
                for (int partido = 1; partido <= 14; partido++) {
                    System.out.printf("%2d.- |", partido);
                    for (int apuesta = 1; apuesta <= 3; apuesta++) {
                        int res= (int)(Math.random() * 3) ;
                        switch(res) {
                            case 0:
                                System.out.print(" X |");
                                break;
                            case 1:
                                System.out.print(" 1 |");
                                break;
                            case 2:
                                System.out.print(" 2 |");
                                break;
                            default:
                                System.out.println("ERROR");
                        }
                    }
                    System.out.println();
                }
                break;//FIN Ej7

            case 8:
                /* EJERCICIO 8
                Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2,
                la probabilidad de que salga x sea de 1/3
                y la probabilidad de que salga 2 sea de 1/6.
                Pista: 1/2 = 3/6 y 1/3 = 2/6.
                 */
                for (int partido = 1; partido <= 14; partido++) {
                    System.out.printf("%2d.- |", partido);
                    for (int apuesta = 1; apuesta <= 3; apuesta++) {
                        int numranEj8 = (int)(Math.random() * 6 + 1) ;
                        int res = 0;
                        if (numranEj8 <= 3) { res = 1;}
                        if (numranEj8 == 4 || numranEj8 == 5) { res = 0;}
                        if (numranEj8 == 6) { res = 2;}
                        switch(res) {
                            case 0:
                                System.out.print(" X |");
                                break;
                            case 1:
                                System.out.print(" 1 |");
                                break;
                            case 2:
                                System.out.print(" 2 |");
                                break;
                            default:
                                System.out.println("ERROR");
                        }
                    }
                    System.out.println();
                }
                break;//FIN Ej8

            case 9:
                /* EJERCICIO 9
                Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
                y que no termine de generar números hasta que no saque el 24.
                El programa deberá decir al final cuántos números se han generado.
                 */
                int totalNum = 0;
                boolean n24 = false;
                do {
                    int numranEj9 = (int) (Math.random()*101);
                    if (numranEj9 % 2 == 0) {
                        System.out.print(numranEj9 + " ");
                        if (numranEj9 == 24) {
                            n24 = true;
                        }
                        totalNum++;
                    }
                } while (!n24);

                System.out.printf("\nSe han generado %d números", totalNum);
                break;//FIN Ej9

            case 10:
                /* EJERCICIO 10
                Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
                El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes:
                *, -, =, ., |, @.
                Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
                 */
                String carEj10 = "";
                for (int i = 1; i <= 10; i++) {
                    int numranEj10 = (int) (Math.random()*6);
                    switch (numranEj10) {
                        case 0:
                            carEj10 = "*";
                            break;
                        case 1:
                            carEj10 = "-";
                            break;
                        case 2:
                            carEj10 = "=";
                            break;
                        case 3:
                            carEj10 = ".";
                            break;
                        case 4:
                            carEj10 = "|";
                            break;
                        case 5:
                            carEj10 = "@";
                            break;
                    }
                    for (int j = 1; j <= Math.random()*40 + 1; j++) {
                        System.out.print(carEj10);
                    }
                    System.out.println();
                }
                break;

            case 11:
                /* EJERCICIO 11
                Escribe un programa que muestre 20 notas generadas al azar.
                Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
                Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.
                 */
                for (int i = 1; i <= 20; i++) {
                    int numranEj11 = (int) (Math.random()*11);
                    String nota = "";
                    if (numranEj11 < 5) {
                        nota = "suspenso";
                    }
                    if (numranEj11 == 5) {
                        nota = "suficiente";
                    }
                    if (numranEj11 == 6) {
                        nota = "bien";
                    }
                    if (numranEj11 == 7 || numranEj11 == 8) {
                        nota = "notable";
                    }
                    if (numranEj11 == 9 || numranEj11 == 10) {
                        nota = "sobresaliente";
                    }

                    System.out.println(numranEj11 + "-->" + nota);
                }
                break;

            case 12:
                /* EJERCICIO 12
                Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
                con el código ascii entre el 32 y el 126.
                Puedes hacer casting con (char) para convertir un entero en un carácter.
                 */
                int x = 0;
                while (x == 0) {
                    char numranEj12 = (char) (Math.random()*95+32);
                    System.out.print(numranEj12 + "  ");
                }
                break;
            case 13:
                /* EJERCICIO 13
                Escribe un programa que simule la tirada de dos dados.
                El programa deberá continuar tirando los dados una y otra vez
                hasta que en alguna tirada los dos dados tengan el mismo valor.
                 */
                int dado1Ej13 = 0;
                int dado2Ej13 = 0;
                do {
                    System.out.println("\nPulse 'T' para tirar los dados");
                    String tirar = s.next();
                    if (tirar.equals("T")) {
                        System.out.print("Dado 1:");
                        dado1Ej13 = (int) (Math.random()*6+1);
                        System.out.println(dado1Ej13);
                        System.out.print("Dado 2:");
                        dado2Ej13 = (int) (Math.random()*6+1);
                        System.out.println(dado2Ej13);
                    }
                } while (dado1Ej13 != dado2Ej13);
                break;

            case 14:
                /* EJERCICIO 14
                Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
                El programa intentará adivinar el número que estás pensando
                - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
                En cada intento fallido, el programa debe preguntar si el número que estás pensando
                es mayor o menor que el que te acaba de decir.
                 */
                System.out.println("Piensa un número del 0 al 100, tratare de adivinarlo");
                int mayorEj14 = 101;
                int menorEj14 = 0;
                int intentosEj14 = 5;
                boolean winEj14 = false;

                while (intentosEj14 !=0 && !winEj14) {
                    int numranEj14 = (int)(Math.random()*(mayorEj14-menorEj14) + menorEj14);
                    System.out.printf("¿Es %d tu número?(Y/N)", numranEj14);

                    String numEj14 = s.next();
                        if (numEj14.equals("Y")||numEj14.equals("y")||numEj14.equals("Yes")||numEj14.equals("yes")) {
                            System.out.println("Oleeee acerté");
                            winEj14 = true;
                        }
                        else {
                            System.out.printf("¿Tu número es mayor o menor que %d? ", numranEj14);
                            String size = s.next();
                            switch (size) {
                                case "mayor":
                                    menorEj14 = numranEj14 + 1;
                                    break;
                                case "menor":
                                    mayorEj14 = numranEj14;
                                    break;
                            }
                        }
                        intentosEj14--;
                        if (!winEj14 && intentosEj14 != 0) {
                            System.out.printf("Quedan: %d intentos\n", intentosEj14);
                        }
                }
                if (intentosEj14 ==0 && !winEj14) {
                    System.out.print("Te quedaste sin intentos, lo siento");
                }
                break;

            case 15:
                /* EJERCICIO 15
                Realiza un generador de melodía con las siguientes condiciones:
                    a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
                    b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4,
                       menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
                    c) Cada grupo de 4 notas será un compás y estará separado del siguiente
                       compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
                    d) La última nota de la melodía debe coincidir con la primera.
                        Ejemplo 1:
                          do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
                        Ejemplo 2:
                          la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
                 */
                boolean melodia = false;
                int compas = 0;
                String primeranota = "";
                do {
                    int numnotas = (int) (Math.random()*25+4);
                    if (numnotas % 4 == 0) {
                        compas = numnotas / 4;
                        melodia = true;
                    }
                } while (!melodia);

                for (int i = 1; i <= compas; i++) {
                    for (int j = 1; j <= 4; j++) {
                        int numranEj15 = (int) (Math.random() * 7);
                        String nota = "";
                        switch (numranEj15) {
                            case 0:
                                nota = "do";
                                break;
                            case 1:
                                nota = "re";
                                break;
                            case 2:
                                nota = "mi";
                                break;
                            case 3:
                                nota = "fa";
                                break;
                            case 4:
                                nota = "sol";
                                break;
                            case 5:
                                nota = "la";
                                break;
                            case 6:
                                nota = "si";
                                break;
                            default:

                        }
                        if (i == 1 && j == 1) {
                            primeranota = nota;
                        }
                        if (i == compas && j == 4) {
                            nota = primeranota;
                        }
                        System.out.print(" " + nota);
                    }

                    System.out.print(" |");
                }
                System.out.print("|");
                break;

            case 16:
                /* EJERCICIO 16
                Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
                    a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras.
                       Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
                    b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
                    c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
                    d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
                        Ejemplo 1:
                          diamante diamante limón
                          Bien, ha recuperado su moneda
                        Ejemplo 2:
                          herradura campana diamante
                          Lo siento, ha perdido
                        Ejemplo 3:
                          corazón corazón corazón
                          Enhorabuena, ha ganado 10 monedas
                 */
                String figura = "";
                int corazon = 0; int diamante = 0; int herradura = 0; int campana = 0; int limon = 0;
                int winEj16 = 0;
                System.out.print("||");
                for (int i = 1; i <= 3; i++) {
                    int numranEj16 = (int) (Math.random()*5);
                    switch (numranEj16) {
                        case 0:
                            figura = "❤";
                            corazon++;
                            break;
                        case 1:
                            figura = "💎";
                            diamante++;
                            break;
                        case 2:
                            figura = "\uD83E\uDDF2";
                            herradura++;
                            break;
                        case 3:
                            figura = "🔔";
                            campana++;
                            break;
                        case 4:
                            figura = "🍋";
                            limon++;
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                    System.out.print(" " + figura + " ||");
                }
                if (corazon == 2 || diamante == 2 || herradura == 2 || campana == 2 || limon == 2) {
                    winEj16 = 2;
                    System.out.print("Bien, ha recuperado su moneda");
                }
                else {
                    if (corazon == 3 || diamante == 3 || herradura == 3 || campana == 3 || limon == 3) {
                        winEj16 = 3;
                        System.out.print("Enhorabuena, ha ganado 10 monedas");
                    } else {System.out.print("Lo siento, ha perdido");}
                }
                break;
        }
    }//FINAL STATIC
}//FINAL CLASS