import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce el %dº número: ", i+1);
            int n = s.nextInt();
            numeros.add(n);
        }

        System.out.println("\nLista de números: ");
        for (Integer i: numeros) {System.out.println(i + " ");}

        Collections.sort(numeros);

        System.out.println("\nLista de números ordenados: ");
        for (Integer i: numeros) {System.out.println(i + " ");}
    }
}