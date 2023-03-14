import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {

    // ATRIBUTOS
    private List<Animal> listaAnimales;

    //CONSTRUCTOR
    public ClinicaVeterinaria() {
        listaAnimales = new ArrayList<>();
    }

    // METODOS
    public void insertaAnimal(Animal a){
        listaAnimales.add(a);
    }

    public Animal buscaAnimal(String nombre){

        int i;
        for (i = 0; i < listaAnimales.size(); i++) {
            if(listaAnimales.get(i).getNombre().equals(nombre)) {
                return listaAnimales.get(i);
            }
        }
        return null;
    }

    public void modificaComentarioAnimal(String nombre, String nuevoComentario){
        Animal a = buscaAnimal(nombre);

        if(a == null){
            throw new IllegalArgumentException("El animal no existe");
        } else {
            a.setComentarios(nuevoComentario);
        }
    }

    @Override
    public String toString() {
       int i;
       String texto = "----------------------------------------------\n";
        for (i = 0; i < listaAnimales.size(); i++) {
            texto = texto + listaAnimales.get(i).toString();
            texto = texto + "\n----------------------------------------------\n";
        }
        return texto;
    }
}
