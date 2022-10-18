/* Ejercicio 2
    Realiza un conversor de euros a pesetas. 
    La cantidad de euros que se quiere convertir debe ser introducida por teclado.
     1€ = 166.386 pesetas
*/
public class Ejercicio2 {
  public static void main (String[] args) {
    double euros, pesetas;
	
    System.out.println("Dime la cantidad en euros");
    euros = Double.parseDouble(System.console().readLine());
    
	  pesetas = 166.386;
	
    System.out.println(euros + " euros son " + (euros * pesetas) + " pesetas");
  }
}
