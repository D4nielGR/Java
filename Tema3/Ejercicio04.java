/* Ejercicio 4
    Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
*/
public class Ejercicio04 {
  public static void main (String[] args) {
    double x, y;
	
    System.out.println("Dime un numero");
    x = Double.parseDouble(System.console().readLine());
    
    System.out.println("Dime otro numero");
    y = Double.parseDouble(System.console().readLine());
    
    double suma = x + y;
    double resta = x - y;
    double multiplicacion = x * y;
    double division = x / y;
    
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicacion: " + multiplicacion);
    System.out.println("Division: " + division);
  }
}
