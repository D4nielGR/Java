public class Main {
    public static void main(String[] args) {
        Dinero d = new Dinero(4.379876,TipoMoneda.Euro);
        System.out.println(d);
        Dinero d2 = new Dinero(876.786, TipoMoneda.Yen);
        System.out.println(d2);
        Dinero d3 = new Dinero(3.8,TipoMoneda.Dolar);
        System.out.println(d3);

        System.out.println(d2+" equivalen a "+ d2.valorEn(TipoMoneda.Dolar) + " dolares");
        Dinero d2dolar = d2.convierteEn(TipoMoneda.Dolar);
        System.out.println(d2dolar);
        System.out.println(d2.toString(TipoMoneda.Euro));

    }
}