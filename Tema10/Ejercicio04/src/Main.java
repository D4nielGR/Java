import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce la %dº palabra: ", i+1);
            String n = s.next();
            words.add(n);
        }

        System.out.println("\nLista de palbaras: ");
        for (String i: words) {System.out.println(i + " ");}

        Collections.sort(words);

        System.out.println("\nLista de palabras ordenadas: ");
        for (String i: words) {System.out.println(i + " ");}
    }
}