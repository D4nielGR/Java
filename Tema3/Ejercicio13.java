/* Ejercicio 13
    Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. 
    Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
*/
public class Ejercicio13 {
  public static void main (String[] args) {
    System.out.println("¿Que nota te gustaria sacar?");
    double notaDeseada = Double.parseDouble(System.console().readLine()); 
    
    System.out.println("¿Que nota has sacado en el primer examen?");
    double nota1 = Double.parseDouble(System.console().readLine()); 
    
    double nota2 = (notaDeseada - (nota1 * 0.4)) / 0.6;
    
    System.out.println("Para sacar un " + notaDeseada + " necesitaras sacar en el segundo examen un " + nota2);
  }
}
