import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gato extends Animal {

    //ATRIBUTOS
    private RazaGato raza;
    private String microchip;

    //CONSTRUCTOR

    public Gato(String nombre, LocalDate fechaNacimiento, double peso, RazaGato raza, String microchip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
    }
    //PROPIEDADES

    public RazaGato getRaza() {
        return raza;
    }

    public String getMicrochip() {
        return microchip;
    }

    //METODOS
    public String toString() {
        return "Ficha de Gato:\n"+
                "Nombre: "+ this.nombre + "\n" +
                "Raza: "+ this.raza + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Peso: "+ this.peso + "\n" +
                "Microchip: "+ this.microchip + "\n" +
                "Comentarios: "+ this.comentarios;
    }
}
