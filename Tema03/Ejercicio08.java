/* Ejercicio 8
    Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
*/
public class Ejercicio08 {
  public static void main (String[] args) {
    System.out.println("Dime las horas trabajadas");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Salario base: " + (horas * 12));
  }
}
