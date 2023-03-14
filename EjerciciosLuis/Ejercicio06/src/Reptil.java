import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reptil extends Animal{

    // ATRIBUTOS
    private EspecieReptil especie;
    private boolean venenoso;

    // CONSTRUCTOR

    public Reptil(String nombre, LocalDate fechaNacimiento, double peso, EspecieReptil especie, boolean venenoso) {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    //PROPIEDADES

    public EspecieReptil getEspecie() {
        return especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    //METODOS
    public String toString() {
        return "Ficha de Reptil:\n"+
                "Nombre: "+ this.nombre + "\n" +
                "Especie: "+ this.especie + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Peso: "+ this.peso + "\n" +
                "Venenoso: "+ siNoBool(this.venenoso) + "\n" +
                "Comentarios: "+ this.comentarios;
    }
}
