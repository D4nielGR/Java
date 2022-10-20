/* Ejercicio 3
	Realiza un conversor de pesetas a euros. 
	La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.
   1€ = 166.386 pesetas
*/
public class Ejercicio03 {
  public static void main (String[] args) {
    double pesetas;
	
    System.out.println("Dime la cantidad en pesetas");
    pesetas = Double.parseDouble(System.console().readLine());
    
    System.out.println(pesetas + " pesetas son " + (pesetas / 166.386) + " euros");
  }
}
