/* Ejercicio 11
    Realiza un conversor de Kb a Mb.
    1 Mb = 1000 Kb
*/
public class Ejercicio11 {
  public static void main (String[] args) {
    System.out.print("Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    
    double mb_dec = kb / 1000;
    double mb_bin = kb / 1024;
    
    System.out.println(kb + " Kb son: ");
    System.out.println(mb_dec + " Mb decimales");
    System.out.println(mb_bin + " Mb binarios");
  }
}
