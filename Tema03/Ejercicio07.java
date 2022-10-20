/* Ejercicio 7
    Escribe un programa que calcule el total de una factura a partir de la base imponible.
*/
public class Ejercicio07 {
  public static void main (String[] args) {
    double baseImponible;
	
    System.out.println("Dime la base imponible");
    baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("IVA: \t\t" + (baseImponible * 0.21));
    System.out.println("--------------------------------");
    System.out.println("Total: \t\t" + (baseImponible * 1.21));
  }
}
