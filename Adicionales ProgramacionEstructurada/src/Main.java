import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un ejericio(35-42): ");
        int seleccionEj = s.nextInt();
        System.out.println();

        /// Debido a que los ejercicios están comprendidos entre el 35 y el 42 no se debe introducir un número fuera de este rango
        while (seleccionEj < 35 || 42 < seleccionEj) {
            System.out.print("Introduce un numero entre el 35 y el 42: ");
            seleccionEj = s.nextInt();
            System.out.println();
        }

        switch (seleccionEj) {
            case 35:
                System.out.print("Dime la nota que has sacado \nNota: ");
                double nota = s.nextDouble();
                System.out.println();

                /// Por si la nota que se introduce no está en el rango de 1-10, pedir nota correcta de nuevo
                while (nota < 0 || 10 < nota) {
                    System.out.print("Introduce una nota entre 0 y el 10: ");
                    nota = s.nextDouble();
                    System.out.println();
                }


                /// 0 - 4.99 "Suspenso"
                if (nota < 5) {
                    System.out.print("Con esa nota estas 'suspenso'");
                }

                /// 5 - 5.99 "Suficiente"
                if (5 <= nota && nota < 6) {
                    System.out.print("Con esa nota tendrías un 'suficiente'");
                }

                /// 6 - 6.99 "Bien"
                if (6 <= nota && nota < 7) {
                    System.out.print("Con esa nota tendrías un 'bien'");
                }

                /// 7 - 8.99 "Notable"
                if (7 <= nota && nota < 9) {
                    System.out.print("Con esa nota tendrías un 'notable'");
                }

                /// 9 - 10   "Sobresaliente"
                if (9 <= nota && nota <= 10) {
                    System.out.print("Con esa nota tendrías un 'sobresaliente'");
                }

            break;

            case 36:
                int numerosEj36 = 0;
                int numeroescritosEj36 = 0;

                while(numeroescritosEj36 != 10){
                    numerosEj36++;

                    if(numerosEj36 % 2 != 0 && numerosEj36 % 3 != 0){
                        numeroescritosEj36++;
                        System.out.println(numerosEj36);
                    }
                }

                break;

            case 37:
                System.out.println ("¿Qué opción eliges?");
                System.out.println ("a) Escribe todos los múltiplos de 11 comprendidos entre 1 y 100");
                System.out.println ("b) Escribe todos los múltiplos de 17 comprendidos entre 1 y 100");
                System.out.println ("c) Escribe todos los múltiplos de 23 comprendidos entre 1 y 100");
                String opcion = s.next();

                switch (opcion) {

                    case "a":
                        int a = 11;
                        while (a <= 100) {
                            System.out.println(a);
                            a = a + 11;
                        }

                        break;
                    case "b":
                        int b = 17;
                        while (b <= 100) {
                            System.out.println(b);
                            b = b + 17;
                        }

                        break;
                    case "c":
                        int c = 23;
                        while (c <= 100) {
                            System.out.println(c);
                            c = c + 23;
                        }

                        break;
                }

                break;

            case 38:
                System.out.print("Dima A: ");
                int aMCD = s.nextInt();
                System.out.print("Dima B: ");
                int bMCD = s.nextInt();

                int temporal;//Para no perder b
                while (bMCD != 0) {
                    temporal = bMCD;
                    bMCD = aMCD % bMCD;
                    aMCD = temporal;
                }
                System.out.print("El MCD es: " + aMCD);

                break;

            case 39:
                System.out.print("Dima A: ");
                int amcm = s.nextInt();
                System.out.print("Dima B: ");
                int bmcm = s.nextInt();

                int temporal2;//Para no perder b
                while (bmcm != 0) {
                    temporal2 = bmcm;
                    bmcm = amcm % bmcm;
                    amcm = temporal2;
                }
                System.out.print("El mcm es: " + ((amcm*bmcm) / amcm));

                break;

            case 40:
                System.out.print("un número, te dire sie s primo o no: ");
                int nEj40 = s.nextInt();

                boolean primo = true;

                for(int i = 2; i < nEj40; i++) {
                    if (nEj40 % i == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo)
                    System.out.print("The number is prime.");
                else
                    System.out.print("The number isn't prime.");

                break;

            case 41:
                int saltolinea = 0;
                for (int i = 2; i <= 1000; i++) {
                    boolean prime = true;

                    for(int divisible = 2; divisible < i; divisible++) {
                        if (i % divisible == 0) {
                            prime = false;
                            break;
                        }
                    }

                    if (prime) {
                        System.out.print(i + " ");
                        saltolinea++;
                    }
                    if (saltolinea == 50) {
                        System.out.println();
                        saltolinea = 0;
                    }
                }

                break;

            case 42:
                int numranEj42 = (int) (Math.random()*100+1);
                boolean stop = false;
                int intentos = 0;

                while (!stop) {
                    System.out.print("Introduce un número del 1 al 100: ");
                    int numEj42 = s.nextInt();

                    if (numEj42 < numranEj42) {
                        System.out.println("Mi número es mayor que " + numEj42);
                    }
                    if (numEj42 > numranEj42) {
                        System.out.println("Mi número es menor que " + numEj42);
                    }
                    intentos++;

                    if (numEj42 == numranEj42) {
                        System.out.printf("\nFelicidades, has acertado el número %d despues de %d intentos", numranEj42, intentos);
                        stop = true;
                    }
                }

                break;

            default:
                System.out.print("ERROR");
        }
    }
}