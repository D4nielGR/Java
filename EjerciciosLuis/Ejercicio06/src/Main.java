import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double peso;
        String microchip;
        LocalDate fecha;
        EspeciePajaro ep;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Fecha: (dd/mm/aaaa)");
        String miFecha = sc.nextLine();
        fecha = LocalDate.parse(miFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Peso: ");
        peso = sc.nextDouble();
        //----------------------------------------
        int i;
        for (i = 0; i < RazaPerro.values().length; i++) {
            System.out.println(i+" - "+RazaPerro.values()[i]);
        }

        int opcion = sc.nextInt();
        sc.nextLine();
        ep = EspeciePajaro.values()[opcion-1];

        //----------------------------------------

        System.out.print("Microchip: ");
        microchip = sc.nextLine();

        Pajaro p = new Pajaro(nombre,fecha,peso,ep,true);
        System.out.println(p);

    }
}