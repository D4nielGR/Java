import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Disco> disc = new ArrayList<Disco>();

        disc.add(new Disco("C1", "BadBunny", "Amorfoda", "Amor", 200));
        disc.add(new Disco("C2", "Pitbull", "Misewowa", "Trap", 154));


        int option = 0;
        while(option != 5) {

            System.out.print("COLECCIÓN DE DISCOS" +
                    "\n===================" +
                    "\n1.Listado" +
                    "\n2.Nuevo disco" +
                    "\n3.Modificar" +
                    "\n4.Borrar" +
                    "\n5.Salir");
            System.out.print("\nIntroduce una opción: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    int optionSub = 0;
                    while(optionSub != 5) {
                        System.out.println("\nLISTADO" +
                                "=======");

                        System.out.println("1.Listado completo" +
                                "\n2.Listado por autor" +
                                "\n3.Listado por género" +
                                "\n4.Listado de discos" +
                                "\n5.Salir");
                        optionSub = s.nextInt();
                        switch (optionSub) {
                            case 1:
                                for (Disco d : disc) {
                                    if (!d.getCode().equals("LIBRE")) {
                                        System.out.println(d);
                                    }
                                }
                                break;


                            case 2:
                                System.out.print("Introduce el autor que quieres que liste: ");
                                s.nextLine();
                                String authorList = s.nextLine();

                                for (Disco d : disc) {
                                    if (!d.getCode().equals("LIBRE")) {
                                        if (d.getAuthor().equals(authorList)) {
                                            System.out.println(d);
                                        }
                                    }
                                }
                                break;


                            case 3:
                                System.out.print("Introduce el género que quieres que liste: ");
                                s.nextLine();
                                String genreList = s.nextLine();
                                for (Disco d : disc) {
                                    if (!d.getCode().equals("LIBRE")) {
                                        if (d.getGenre().equals(genreList)) {
                                            System.out.println(d);
                                        }
                                    }
                                }
                                break;


                            case 4:
                                System.out.print("Introduce el rango de duración minimo que quieres que liste: ");
                                int minDurList = s.nextInt();
                                System.out.print("Introduce el rango de duración minimo que quieres que liste: ");
                                int maxDurList = s.nextInt();

                                for (Disco d : disc) {
                                    if (!d.getCode().equals("LIBRE")) {
                                        if (d.getDuration() > minDurList && d.getDuration() < maxDurList) {
                                            System.out.println(d);
                                        }
                                    }
                                }
                                break;

                            case 5:
                                break;


                            default:
                                System.out.println("Un número del 1 al 4");
                        }
                    }



                break;

                case 2:
                    System.out.println("\nNUEVO DISCO\n===========");
                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    String codigoIntroducido = s.nextLine();
                    while (disc.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigoIntroducido = s.nextLine();
                    }
                    System.out.print("Autor: ");
                    String autorIntroducido = s.nextLine();
                    System.out.print("Título: ");
                    String tituloIntroducido = s.nextLine();
                    System.out.print("Género: ");
                    String generoIntroducido = s.nextLine();
                    System.out.print("Duración: ");
                    int duracionIntroducida = Integer.parseInt(s.nextLine());
                    disc.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
                        /*System.out.println("\nNUEVO DISCO" +
                                "===========");

                        System.out.println("Por favor, introduzca los datos del disco.");

                        boolean code = true;
                        while (code) {

                            System.out.print("Código: ");
                            String codigoIntroducido = s.next();
                            code = false;
                            if (disc.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
                                code = true;
                                System.out.println("El código introducido debe ser único, no repitas");
                            }

                            if(!code) {
                                System.out.print("Autor: ");
                                String autorIntroducido = s.next();

                                System.out.print("Título: ");
                                String tituloIntroducido = s.next();

                                System.out.print("Género: ");
                                String generoIntroducido = s.next();

                                System.out.print("Duración: ");
                                int duracionIntroducida = s.nextInt();
                                disc.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
                            }

                        }*/


                    break;


                case 3:
                    /*System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    String codigoIntroducido = s.next();

                    if (disc.contains(codigoIntroducido) == true) {}

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + disc[i].getCode());
                    System.out.print("Nuevo código: ");
                    codigoIntroducido = s.next();
                    boolean code = true;
                    while (code) {
                        System.out.println("Código: " + disc[i].getCode());
                        System.out.print("Nuevo código: ");
                        codigoIntroducido = s.next();
                        code = false;
                        for (Disco d : disc) {
                            if (d.getCode().equals(codigoIntroducido)) {
                                code = true;
                                System.out.println("El código introducido debe ser único, no repitas");
                            }
                        }
                    }
                    if (!codigoIntroducido.equals("")) {
                        disc[i].setCode(codigoIntroducido);
                    }

                    System.out.println("Autor: " + disc[i].getAuthor());
                    System.out.print("Nuevo autor: ");
                    String autorIntroducido = s.next();
                    if (!autorIntroducido.equals("")) {
                        disc[i].setAuthor(autorIntroducido);
                    }

                    System.out.println("Título: " + disc[i].getTitle());
                    System.out.print("Nuevo título: ");
                    String tituloIntroducido = s.next();
                    if (!tituloIntroducido.equals("")) {
                        disc[i].setTitle(tituloIntroducido);
                    }

                    System.out.println("Género: " + disc[i].getGenre());
                    System.out.print("Nuevo género: ");
                    String generoIntroducido = s.next();
                    if (!generoIntroducido.equals("")) {
                        disc[i].setGenre(generoIntroducido);
                    }

                    System.out.println("Duración: " + disc[i].getDuration());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.next();
                    if (!duracionIntroducidaString.equals("")) {
                        disc[i].setDuration(Integer.parseInt(duracionIntroducidaString));
                    }*/
                    break;


                case 4:
                    System.out.println("\nBORRAR" +
                            "======");

                    boolean codeSame = false;
                    while (!codeSame) {

                        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                        codigoIntroducido = s.next();

                        if (!disc.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
                            System.out.println("No existe el codigo introducido");
                        }
                        else{
                            disc.remove(disc.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
                            codeSame = true;
                        }
                    }

                    System.out.println("Album borrado.");


                    break;


                case 5:
                    break;


                default:
                    System.out.println("Introduce un número del 1 al 5");
            }
        }
    }
}