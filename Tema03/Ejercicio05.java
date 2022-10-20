/* Ejercicio 5
    Escribe un programa que calcule el área de un rectángulo.
*/
public class Ejercicio05 {
  public static void main (String[] args) {
    double b, h;
	
    System.out.println("Dime la base");
    b = Double.parseDouble(System.console().readLine());
    
    System.out.println("Dime la altura");
    h = Double.parseDouble(System.console().readLine());
    
    System.out.println("A = b * h");
    System.out.println("A = " + (b * h));
  }
}
