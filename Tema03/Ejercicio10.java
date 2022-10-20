/* Ejercicio 10
    Realiza un conversor de Mb a Kb.
     1 Mb = 1000 Kb
*/
public class Ejercicio10 {
  public static void main (String[] args) {
    System.out.print("Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    
    double kb_dec = mb * 1000;
    double kb_bin = mb * 1024;
    
    System.out.println(mb + " Mb son: ");
    System.out.println(kb_dec + " Kb decimales");
    System.out.println(kb_bin + " Kb binarios");
  }
}
