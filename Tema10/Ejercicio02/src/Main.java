import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();


        int nElementos = (int) (Math.random()*11 +10);
        for (int i = 0; i < nElementos; i++) {
            numeros.add((int) (Math.random()*100 +0));
        }

        System.out.println("Lista de números: ");
        for (Integer i: numeros) {
            System.out.print(i + " ");
        }

        int suma = 0, max = 0, min = 100;
        for (Integer i: numeros) {
            int n = i;
            suma += n;
            if(max < n) {max = n;}
            if(min > n) {min = n;}
        }
        double media = suma / numeros.size();

        System.out.printf("\nSuma: %d" +
                "\nMedia: %.2f" +
                "\nMáximo: %d" +
                "\nMínimo: %d", suma, media, max, min);
    }
}