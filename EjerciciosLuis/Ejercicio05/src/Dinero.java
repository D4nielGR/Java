import java.util.ArrayList;
import java.util.List;

public class Dinero {
    //PARTE STATIC
    //ATRIBUTOS
    private static List<Moneda> listaMonedas;


    //CONSTRUCTOR == BLOQUE ESTATICO
    static {
        listaMonedas = new ArrayList<>();
        Moneda m1 = new Moneda(TipoMoneda.Euro, 2, "€", 1);
        listaMonedas.add(m1);
        listaMonedas.add(new Moneda(TipoMoneda.Dolar, 2, "$", 1.2051005));
        listaMonedas.add(new Moneda(TipoMoneda.Yen, 0, "¥", 130.61883));
    }

    //METODOS
    private static Moneda buscaMoneda(TipoMoneda tMoneda) {
        int i;
        for (i = 0; i < listaMonedas.size(); i++) {
            if (listaMonedas.get(i).gettMoneda() == tMoneda) {
                return listaMonedas.get(i);
            }
        }
        throw new IllegalArgumentException("El tipoMoneda no se encuentra en la lista");
    }

    private static void actualizaCambio(TipoMoneda tMoneda, double nuevoCambio) {
        Moneda m = buscaMoneda(tMoneda);
        m.setCambioEuro(nuevoCambio);
    }

    //PARTE NORMAL
    //ATRIBUTOS
    private double cantidad;
    private TipoMoneda tMoneda;

    //CONSTRUCTOR

    public Dinero(double cantidad, TipoMoneda tMoneda) {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, TipoMoneda tMoneda) {
        this.cantidad = (double) cantidad;
        this.tMoneda = tMoneda;
    }

    //PROPIEDADES

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMoneda gettMoneda() {
        return tMoneda;
    }

    public void settMoneda(TipoMoneda tMoneda) {
        this.tMoneda = tMoneda;
    }

    //METODOS

    @Override
    public String toString() {
        String cadena = "";
        Moneda m = buscaMoneda(this.tMoneda);
        if (m.getDecimales() > 0) {
            double valor;

            switch (m.getDecimales()) {
                case 1:
                    valor = Math.round(this.cantidad * 10.0) / 10.0;
                    cadena = String.format("%.1f",valor ) + m.getSimbolo();
                    break;
                case 2:
                    valor = Math.round(this.cantidad * 100.0) / 100.0;
                    cadena = String.format("%.2f",valor ) + m.getSimbolo();
                break;
                case 3:
                    valor = Math.round(this.cantidad * 1000.0) / 1000.0;
                    cadena = String.format("%.3f",valor ) + m.getSimbolo();
                    break;
                case 4:
                    valor = Math.round(this.cantidad * 10000.0) / 10000.0;
                    cadena = String.format("%.4f",valor ) + m.getSimbolo();
                    break;
            }
        } else {
            cadena = Math.round(this.cantidad) + m.getSimbolo();
        }
        return cadena;




    }
    public double valorEn(TipoMoneda tMoneda2){
        Moneda m1 = buscaMoneda(this.tMoneda);
        double valorEuros = this.cantidad / m1.getCambioEuro();

        Moneda m2 = buscaMoneda(tMoneda2);
        double valorFinal = valorEuros * m2.getCambioEuro();

        return valorFinal;
    }

    public Dinero convierteEn(TipoMoneda tMoneda2) {
        double valor = this.valorEn(tMoneda2);
        Dinero d = new Dinero(valor, tMoneda2);
        return d;
    }

    public String toString(TipoMoneda tMoneda) {
        return convierteEn(tMoneda).toString();
    }

    //METODOS(Operaciones)
    public Dinero negate(){
        return new Dinero(-this.cantidad, this.tMoneda);
    }

    public Dinero add(Dinero d2 ){
        if(this.tMoneda == d2.tMoneda){
            return new Dinero(this.cantidad + d2.cantidad,this.tMoneda);
        } else{
            return new Dinero(this.cantidad + d2.valorEn(this.tMoneda), this.tMoneda);
        }
    }

    public Dinero substract(Dinero d2){
        return this.add(d2.negate());
    }

    public Dinero multiply(double d){
        return new Dinero(this.cantidad * d , this.tMoneda);
    }

    public Dinero divide(double d){
        return new Dinero(this.cantidad / d , this.tMoneda);
    }

    public boolean equals(Dinero d2){
        if(this.tMoneda == d2.tMoneda){
            if(this.cantidad == d2.cantidad){
                return true;
            } else{
                return false;
            }
        } else{
            return (this.cantidad == d2.valorEn(this.tMoneda));
        }
    }

    public int compareTo(Dinero d2){
        Dinero d3 = this.substract(d2);
        if(d3.cantidad == 0){
            return 0;
        } else{
            if(d3.cantidad > 0){
                return 1;
            } else{
                return -1;
            }
        }
    }
}