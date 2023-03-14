public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this(numerador, 1);
    }

    public Fraccion(double numero) {
        int potencia = 1;
        while ((numero * potencia) % 1 != 0) {
            potencia *= 10;
        }
        this.numerador = (int) (numero * potencia);
        this.denominador = potencia;
        this.simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
    }

    private int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public Fraccion negate() {
        return new Fraccion(-numerador, denominador);
    }

    public Fraccion add(Fraccion f) {
        int mcm = mcm(denominador, f.denominador);
        int nuevoNumerador = (numerador * (mcm / denominador)) + (f.numerador * (mcm / f.denominador));
        return new Fraccion(nuevoNumerador, mcm);
    }

    public Fraccion subtract(Fraccion f) {
        return add(f.negate());
    }

    public Fraccion multiply(Fraccion f) {
        int nuevoNumerador = numerador * f.numerador;
        int nuevoDenominador = denominador * f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion divide(Fraccion f) {
        int nuevoNumerador = numerador * f.denominador;
        int nuevoDenominador = denominador * f.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
}