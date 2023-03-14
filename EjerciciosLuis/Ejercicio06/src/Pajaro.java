import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pajaro extends Animal{

    //ATRIBUTOS

    private EspeciePajaro especie;
    private boolean cantor;

    //CONSTRUCTOR


    public Pajaro(String nombre, LocalDate fechaNacimiento, double peso, EspeciePajaro especie, boolean cantor) {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.cantor = cantor;
    }

    //PROPIEDADES


    public EspeciePajaro getEspecie() {
        return especie;
    }

    public boolean isCantor() {
        return cantor;
    }

    public String toString() {
        return "Ficha de Pajaro:\n"+
                "Nombre: "+ this.nombre + "\n" +
                "Especie: "+ this.especie + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Peso: "+ this.peso + "\n" +
                "Cantor: "+ siNoBool(this.cantor) + "\n" +
                "Comentarios: "+ this.comentarios;
    }
}
