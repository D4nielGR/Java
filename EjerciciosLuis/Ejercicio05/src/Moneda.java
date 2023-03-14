public class Moneda {
    // ATRIBUTOS
    private TipoMoneda tMoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;

    //CONSTRUCTOR

    public Moneda(TipoMoneda tMoneda, int decimales, String simbolo, double cambioEuro) {

        this.tMoneda = tMoneda;

        if(decimales >= 0 && decimales <= 4) {
            this.decimales = decimales;
        }else{
            throw new IllegalArgumentException("Los decimales tienen que estar entre 0 y 4");
        }

        if(!simbolo.equals("")) {
            this.simbolo = simbolo;
        } else {
            throw new IllegalArgumentException("El simbolo no puede estar vacio");
        }

        setCambioEuro(cambioEuro);
    }

    //PROPIEDADES

    public TipoMoneda gettMoneda() {
        return tMoneda;
    }

    public int getDecimales() {
        return decimales;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getCambioEuro() {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro) {
        if(cambioEuro > 0 ) {
            this.cambioEuro = cambioEuro;
        } else {
            throw new IllegalArgumentException("El cambio tiene que ser mayor que cero");
        }
    }
}
