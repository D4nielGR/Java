import java.util.Arrays; 
import java.util.Random;
import java.util.Collections;

public class Baraja {

    private Carta[] listaCartas;   
    private int top; 

    public Baraja() {
        this.listaCartas = new Carta[40];
        for(int i=0; i<40; i++) {
            this.listaCartas[i] = new Carta(i);
        }
        this.top = 40;
    }
    
    public Baraja(int tipoBaraja, boolean barajar) {
        if (tipoBaraja == 1) {
            this.listaCartas = new Carta[80];
        }
        else {
            this.listaCartas = new Carta[40];     
        }
        if (barajar) 
            this.barajar();
    }

    public void barajar() {

        // Desordeno el indice de 0..40
        Integer[] indicesAux = new Integer[40];
        for(int i=0; i<40; i++) {
            indicesAux[i] = i;
        }
        Collections.shuffle(Arrays.asList(indicesAux));

        // Creo un array de cartas desordenadas
        Carta[] cartasAux = new Carta[40];
        for(int i=0; i<40; i++) {
            cartasAux[i] = this.listaCartas[indicesAux[i]];
        }

        // lo paso al array original
        for(int i=0; i<40; i++) {
            this.listaCartas[i] = cartasAux[i];
        }
    }

    public boolean vacia() {
        return (this.top == 0);
    }

    public Carta robar() {
        return this.listaCartas[--this.top];
    }

}