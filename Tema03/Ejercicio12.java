/* Ejercicio 12
    Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), 
    el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. 
    Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. 
    Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, 
    el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. 
    El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.
*/
public class Ejercicio12 {
  public static void main (String[] args) {
    
	  System.out.print("Introduzca la base imponible: ");
	  double baseImponible = Double.parseDouble(System.console().readLine());
	  
    
	  System.out.print("Introduzca el tipo de IVA(general, reducido, superreducido): ");
	  String tipoIVA = System.console().readLine();
    
    double IVA = 0;           // 0.21; // 0.1 // 0.04
    String ivaPorcentaje = ""; //  21%  // 10% //  4%
    
    switch(tipoIVA) {
      case "general":
        IVA = 0.21;
        ivaPorcentaje = "21%";
        break;
        
      case "reducido":
        IVA = 0.1;
        ivaPorcentaje = "10%";
        break;
        
      case "superreducido":
        IVA = 0.04;
        ivaPorcentaje = "4%";
        break;
        
      default:
        System.out.println("Asegurate deponer bien el IVA");
      }
      
	  
	  double baseconIVA = baseImponible * (1+IVA);
	  
    
	  System.out.print("Introduzca el código promocional(nopro, mitad, meno5 o 5porc): ");
	  String tipocodigo = System.console().readLine();
	  
	  double codigo = 0; //0 //-baseconIVA*0.5 // -5 // -baseconIVA*0.05
    
    switch(tipocodigo) {
      case "nopro":
        codigo = 0;
        break;
        
      case "mitad":
        codigo = -baseconIVA * 0.5;
        break;
        
      case "meno5":
        codigo = -5;
        break;
        
      case "5porc":
        codigo = -baseconIVA * 0.05;
        break;
        
      default:
        System.out.println("Asegurate deponer bien el codigo");
      }
      
	  
    
	  System.out.printf("Base imponible: \t%f\n", baseImponible);
	  System.out.printf("IVA (%s):       \t%f\n", ivaPorcentaje, (baseImponible*IVA));   
	  System.out.printf("Precio con IVA: \t%f\n", baseconIVA);
	  System.out.printf("Cód.promo.(%s): \t%f\n", tipocodigo, codigo);                  
	  System.out.printf("TOTAL           \t%f\n", (baseconIVA + codigo));
  }
}
