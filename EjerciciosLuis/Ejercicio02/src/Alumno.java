class Alumno {
    private String nombre;
    private int edad;
    private double calificacion;

    public Alumno(String nombre, int edad, double calificacion) {
        setNombre(nombre);
        setEdad(edad);
        setCalificacion(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 17 && edad <= 100) {
            this.edad = edad;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Calificacion: " + calificacion;
    }
}
