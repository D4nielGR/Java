import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Juan");
        alumnos.add("Paco");
        alumnos.add("Pepe");
        alumnos.add("Alicia");
        alumnos.add("Ana");
        alumnos.add("Dani");

        System.out.println("Alumnos: ");
        for (String a: alumnos) {
            System.out.println(a);
        }

        Collections.sort(alumnos);

        System.out.println("\nAlumnos ordenados alfabéticamente: ");
        for (String a: alumnos) {
            System.out.println(a);
        }
    }
}