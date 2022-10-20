/* Ejercicio 1
    Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.
*/
public class Ejercicio01 {
  public static void main (String[] args) {
    int x, y;
	
    System.out.println("Dime un numero");
    x = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime otro numero");
    y = Integer.parseInt(System.console().readLine());
    
    System.out.println("Multiplicacion: " + (x*y));
  }
}
