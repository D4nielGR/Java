/* Ejercicio 5
    Modifica el programa anterior añadiendo colores. 
    Puedes mostrar cada asignatura de un color diferente.
*/
public class Ejercicio5 {
  public static void main (String[] args) {
    //COLORES
    String blackGrey  = "\033[30m";
    String red        = "\033[31m";
    String green      = "\033[32m";
    String brown      = "\033[33m";
    String blue       = "\033[34m";
    String purple     = "\033[35m";
    String cyan       = "\033[36m";
    String whiteGrey  = "\033[37m";
    String black2     = "\033[38m";
    String white      = "\033[39m";
    
    //https://gist.github.com/vratiu/9780109
    //enlace sobre los diferentes usos con los colores, backgrounds,...
    
    System.out.println("Lunes \t Martes \t Miércoles \t Jueves \t Viernes");
    System.out.println("\033[32m  BD   \t \033[31m  EN   \t \033[34m   PR     \t \033[31m  EN   \t \033[32m  BD   ");
    System.out.println("\033[32m  BD   \t \033[31m  EN   \t \033[34m   PR     \t \033[34m  PR   \t \033[32m  BD   ");
    System.out.println("\033[35m  IN   \t \033[34m  PR   \t \033[34m   PR     \t \033[34m  PR   \t \033[39m  SI   ");
    System.out.println("\033[33m  FO   \t \033[34m  PR   \t \033[35m   IN     \t \033[34m  PR   \t \033[39m  SI   ");
    System.out.println("\033[33m  FO   \t \033[36m  LM   \t \033[39m   SI     \t \033[39m  SI   \t \033[36m  LM   ");
    System.out.println("\033[33m  FO   \t \033[36m  LM   \t \033[39m   SI     \t \033[39m  SI   \t \033[36m  LM   ");
    
    System.out.println("\033[39m"); //Con esto se sigue en blanco debajo del horario, sino acaba en otro color del horario
  }
}
