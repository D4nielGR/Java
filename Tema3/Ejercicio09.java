/* Ejercicio 9
    Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3) * π * r^2 * h
*/
public class Ejercicio09 {
  public static void main (String[] args) {
    double r, h;
	
    System.out.println("Dime el radio");
    r = Double.parseDouble(System.console().readLine());
    
    System.out.println("Dime la altura");
    h = Double.parseDouble(System.console().readLine());
    
    System.out.println("V = (1/3) * π * r^2 * h");
    System.out.println("V = " + (((double)1/3) * Math.PI * (r * r) * h));  //Math.Pi 
  }
}
