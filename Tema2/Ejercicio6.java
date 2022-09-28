/* Ejercicio 6
    Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). 
    La base imponible estará almacenada en una variable.
*/
public class Ejercicio6 {
  public static void main (String[] args) {
    double baseImponible  = 945.5;
    
    
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("IVA: \t\t" + (baseImponible * 0.21));
    System.out.println("--------------------------------");
    System.out.println("Total: \t\t" + (baseImponible * 1.21));
  }
}
