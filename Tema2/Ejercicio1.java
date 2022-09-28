/* Ejercicio 1
    Escribe un programa en el que se declaren las variables enteras x e y. 
    Asignales los valores 144 y 999 respectivamente. 
    A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.
*/
public class Ejercicio1 {
  public static void main (String[] args) {
    double x,y;
    
    x=2;
    y=4;
    
    System.out.println("x=" + x + "  y=" + y);
    System.out.println("Suma: " + (x + y));
    System.out.println("Resta: " + (x - y));
    System.out.println("División: " + (x / y)); //es necesario poner el float para que los decimales estén
    System.out.println("Multiplicación: " + (x * y));
  }
}
