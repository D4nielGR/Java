import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Grupo g = new Grupo();
        g.insertaAlumnoLista(new Alumno("Juan", 20, 7.5));
        g.insertaAlumnoLista(new Alumno("Ana", 19, 8.0));
        g.insertaAlumnoLista("Pedro", 21, 6.5);
        System.out.println(g);
        g.escribeFicheroBinario("alumnos.bin");
        g.leeFicheroBinario("alumnos.bin");
        System.out.println(g);

        g.escribeFicheroTexto("alumnos.txt");
        g.leeFicheroTexto("alumnos.txt");
        System.out.println(g);

        g.escribeFicheroCSV("alumnos.csv");
        g.leeFicheroCSV("alumnos.csv");
        System.out.println(g);

        // Prueba de las propiedades de acceso
        Alumno a = new Alumno("Luis", 16, 9.0);
        System.out.println(a);
        a.setNombre("");
        a.setEdad(101);
        a.setCalificacion(11);
        System.out.println(a);
    }
}