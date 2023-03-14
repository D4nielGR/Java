import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Perro extends Animal{

    //ATRIBUTOS
    private RazaPerro raza;
    private String microchip;
    //CONSTRUCTOR

    public Perro(String nombre, LocalDate fechaNacimiento, double peso, RazaPerro raza, String microchip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
    }

    //PROPIEDADES

    public RazaPerro getRaza() {
        return raza;
    }

    public String getMicrochip() {
        return microchip;
    }

    //METODOS
    @Override
    public String toString() {
        return "Ficha de Perro:\n"+
                "Nombre: "+ this.nombre + "\n" +
                "Raza: "+ this.raza + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Peso: "+ this.peso + "\n" +
                "Microchip: "+ this.microchip + "\n" +
                "Comentarios: "+ this.comentarios;


    }
}
