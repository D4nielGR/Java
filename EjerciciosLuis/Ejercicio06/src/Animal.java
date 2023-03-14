import java.time.LocalDate;

public abstract class Animal {
    //ATRIBUTOS
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String comentarios;

    //CONSTRUCTOR
    public Animal(String nombre, LocalDate fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.comentarios = "";
    }

    //PROPIEDADES

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    //METODOS
    @Override
    public abstract String toString();

    protected static String siNoBool (boolean b){
        if(b){
            return "Si";
        } else{
            return "No";
        }

    }
}
