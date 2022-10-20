import java.util.Scanner;
public class Tema04Ej {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
	  System.out.print("Elije un ejercicio(1-22): ");
	  int ejercicio = s.nextInt();
	  System.out.println();
	  //20-22
	  while (ejercicio < 1 || 22 < ejercicio) { 
		  System.out.print("Introduce un ejercicio del 1 al 22, ¿no sabes leer?: ");
		  ejercicio = Integer.parseInt(System.console().readLine());
	  }
	  
	  System.out.println();
	  
	  switch (ejercicio) {
		  case 1:
/* Ejercicio 1
 Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
*/
			System.out.println("Introduce un dia de la semana para indicar la primera asignatura del dia");
			String dia = System.console().readLine();
			
			System.out.println();
			
			switch (dia) {
				case "Lunes":
				System.out.println("La primera hora del lunes es base de datos");
				break;
				
				case "Martes":
				System.out.println("La primera hora del martes es entorno y desarrollo");
				break;
				
				case "Miercoles":
				System.out.println("La primera hora del miercoles es programacion");
				break;
				
				case "Jueves":
				System.out.println("La primera hora del jueves es fol");
				break;
				
				case "Viernes":
				System.out.println("La primera hora del viernes es lenguaje y marcas");
				break;
				
				case "Sabado":
				System.out.println("Los sabados no hay colegio, ¿porque pones sabado?");
				break;
				
				case "Domingo":
				System.out.println("Los domingos no hay colegio, ¿porque pones domingo?");
				break;
				
				default:
				System.out.println("Debes introducir un dia de la semana con la primera letra en mayusculas");
			}
		  break;
		  
		  
		  case 2:
/* Ejercicio 2
 Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora. 
 Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
 Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
*/
			System.out.println("¿Qué hora es?");
			int hora = Integer.parseInt(System.console().readLine());
			
			if (00 <= hora && hora <= 24) {
				if (6 <= hora && hora <= 12) {
					System.out.println("Buenos días");
				}
				if (13 <= hora && hora <= 20) {
					System.out.println("Buenas tardes");
				}
				if ((21 <= hora && hora <= 24) || (00 <= hora && hora <= 5)) {
					System.out.println("Buenas noches");
				}
			}	
			else {
				System.out.print("La hora introducida está mal");
			}
			
		  break;
		  
		  case 3:
/* Ejercicio 3
 Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*/
			System.out.println("Introduce un número de la semana");
			int NumeroDia = Integer.parseInt(System.console().readLine());
			String DiaSemana = "";
			
			switch(NumeroDia) {
				case 1:
					DiaSemana = "Lunes";
				break;
				case 2:
					DiaSemana = "Martes";
				break;
				case 3:
					DiaSemana = "Miercoles";
				break;
				case 4:
					DiaSemana = "Jueves";
				break;
				case 5:
					DiaSemana = "Viernes";
				break;
				case 6:
					DiaSemana = "Sabado";
				break;
				case 7:
					DiaSemana = "Domingo";
				break;
				
			default:
				System.out.print("Tiene que ser un numero del 1 al 7");
			}
			
			if (DiaSemana != "") {
				System.out.print("Estamos a " + DiaSemana);
			}
		  break;
		  
		  case 4:
/* Ejercicio 4
 Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. 
 Escribe un programa que calcule el salario semanal de un trabajador,
 teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
 A partir de la hora 41, se pagan a 16 euros la hora.
*/
			System.out.println("¿Cuantas horas ha trabajado?");
			int horasTrabajadas = Integer.parseInt(System.console().readLine());
			int SalarioTrabajador = 1;
			
			if (0 <= horasTrabajadas) {
				
				if (horasTrabajadas <= 40) {
					SalarioTrabajador = horasTrabajadas * 12; 
				}
				if (horasTrabajadas > 40) {
					SalarioTrabajador = horasTrabajadas * 16; 
				}
				System.out.print("El salario del trabajador es de " + SalarioTrabajador + " euros");
			}
			else {
				System.out.println("Pon bien las horas");
			}
		  break;
		  
		  case 5:
/* Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
*/
			System.out.println("Introduce el valor de 'a'");
			int a = Integer.parseInt(System.console().readLine());
			
			System.out.println("Introduce el valor de 'b'");
			int b = Integer.parseInt(System.console().readLine());
			
			double x = (float)-b / a;
			System.out.println("x = " + x);
		  break;
		  
		  case 6:
/* Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
Aplica la fórmula t = √(2*h)/g  siendo g = 9.81m/s^2
*/
			System.out.println("Introduce la altura (h)");
			int h = Integer.parseInt(System.console().readLine());
			
			double t = Math.sqrt((2*h)/9.81);
			System.out.println("t = " + t);
		  break;
		  
		  case 7:
/* Ejercicio 7
Realiza un programa que calcule la media de tres notas.
*/
			System.out.print("Nota 1: ");
			int nota1Ej7 = Integer.parseInt(System.console().readLine());
			System.out.print("Nota 2: ");
			int nota2Ej7 = Integer.parseInt(System.console().readLine());
			System.out.print("Nota 3: ");
			int nota3Ej7 = Integer.parseInt(System.console().readLine());
			
			if (0 <= nota1Ej7 && nota1Ej7 <= 10) {
				if (0 <= nota2Ej7 && nota2Ej7 <= 10) {
					if (0 <= nota3Ej7 && nota3Ej7 <= 10) {
						double NotaMedia = (float)(nota1Ej7 + nota2Ej7 + nota3Ej7) / 3;
						System.out.printf("La nota media es: %2.2f", NotaMedia);
					}
					else {
						System.out.println("Has introducido mal la nota 3, tiene que ser un número entre 0 y 10");
					}
				}
				else {
					System.out.println("Has introducido mal la nota 2, tiene que ser un número entre 0 y 10");
				}
			}
			else {
				System.out.println("Has introducido mal la nota 1, tiene que ser un número entre 0 y 10");
			}
		  break;
		  
		  case 8:
/* Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
*/
			System.out.print("Nota 1: ");
			int nota1Ej8 = Integer.parseInt(System.console().readLine());
			System.out.print("Nota 2: ");
			int nota2Ej8 = Integer.parseInt(System.console().readLine());
			System.out.print("Nota 3: ");
			int nota3Ej8 = Integer.parseInt(System.console().readLine());
			//Preguntar por el redondeo de la nopta del boletín
			if (0 <= nota1Ej8 && nota1Ej8 <= 10) {
				if (0 <= nota2Ej8 && nota2Ej8 <= 10) {
					if (0 <= nota3Ej8 && nota3Ej8 <= 10) {
						double NotaMedia = (float)(nota1Ej8 + nota2Ej8 + nota3Ej8) / 3;
						
						String NotaCalificacion = "";
						if (NotaMedia < 5) {
							NotaCalificacion = "Insuficiente";
						}
						if (5 <= NotaMedia && NotaMedia < 6) {
							NotaCalificacion = "Suficiente";
						}
						if (6 <= NotaMedia && NotaMedia < 7) {
							NotaCalificacion = "Bien";
						}
						if (7 <= NotaMedia && NotaMedia < 9) {
							NotaCalificacion = "Notable";
						}
						if (9 <= NotaMedia && NotaMedia <= 10) {
							NotaCalificacion = "Sobresaliente";
						}
						System.out.printf("La nota media es:%2.0f q2%s", NotaMedia, NotaCalificacion);
					}
					else {
						System.out.println("Has introducido mal la nota 3, tiene que ser un número entre 0 y 10");
					}
				}
				else {
					System.out.println("Has introducido mal la nota 2, tiene que ser un número entre 0 y 10");
				}
			}
			else {
				System.out.println("Has introducido mal la nota 1, tiene que ser un número entre 0 y 10");
			}
		  break;
		  
		  case 9:
/* Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
*/
			System.out.println("Introduce el valor de 'a'");
			double aEj9 = Double.parseDouble(System.console().readLine());
			
			System.out.println("Introduce el valor de 'b'");
			double bEj9 = Double.parseDouble(System.console().readLine());
			
			System.out.println("Introduce el valor de 'c'");
			double cEj9 = Double.parseDouble(System.console().readLine());
			
			// 0x^2 + 0x + 0 = 0
        if ( (aEj9==0) && (bEj9==0) && (cEj9==0)) {
            System.out.println("Infinitas soluciones");
        }

        // 0x^2 + 0x + c = 0 c distinto de 0
        if ( (aEj9==0) && (bEj9==0) && (cEj9!=0)) {
            System.out.println("No tiene solucion");
        }

        // ax^2 + bx + 0 = x * (ax + b) = 0 con a y b distinto de 0
        if ( (aEj9!=0) && (bEj9!=0) && (cEj9==0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-bEj9/aEj9));
        }

        // a, b, c distinto de 0
        if ( (aEj9!=0) && (bEj9!=0) && (cEj9!=0)) {
            double discriminante = bEj9*bEj9 - (4 * aEj9 * cEj9);
            if (discriminante < 0)
                System.out.println("La solucion no es real");
            else {
                System.out.println("x1 = " + (-bEj9 + Math.sqrt(discriminante)) / (2 *aEj9));
                System.out.println("x2 = " + (-bEj9 - Math.sqrt(discriminante)) / (2 *aEj9));
            }
         }
		  break;
		  
		  case 10:
/* Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
*/
			System.out.println("Introduce el dia");
			int diaEj10 = Integer.parseInt(System.console().readLine());
			System.out.println("Introduce el mes");
			int mesEj10 = Integer.parseInt(System.console().readLine());

			String horoscopo = "";
			switch(mesEj10) {
				case 1:
					if (1  <= diaEj10 && diaEj10 <= 19) { horoscopo = "Capricornio"; }
					if (20 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Acuario"; }
				break;
				case 2:
					if (1  <= diaEj10 && diaEj10 <= 18) { horoscopo = "Acuario"; }
					if (19 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Piscis"; }
				break;
				case 3:
					if (1  <= diaEj10 && diaEj10 <= 20) { horoscopo = "Piscis"; }
					if (21 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Aries"; }
				break;
				case 4:
					if (1  <= diaEj10 && diaEj10 <= 19) { horoscopo = "Aries"; }
					if (20 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Tauro"; }
				break;
				case 5:
					if (1  <= diaEj10 && diaEj10 <= 20) { horoscopo = "Tauro"; }
					if (21 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Géminis"; }
				break;
				case 6:
					if (1  <= diaEj10 && diaEj10 <= 20) { horoscopo = "Géminis"; }
					if (21 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Cáncer"; }
				break;
				case 7:
					if (1  <= diaEj10 && diaEj10 <= 22) { horoscopo = "Cáncer"; }
					if (23 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Leo"; }
				break;
				case 8:
					if (1  <= diaEj10 && diaEj10 <= 22) { horoscopo = "Leo"; }
					if (23 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Virgo"; }
				break;
				case 9:
					if (1  <= diaEj10 && diaEj10 <= 22) { horoscopo = "Virgo"; }
					if (23 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Libra"; }
				break;
				case 10:
					if (1  <= diaEj10 && diaEj10 <= 22) { horoscopo = "Libra"; }
					if (23 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Escorpio"; }
				break;
				case 11:
					if (1  <= diaEj10 && diaEj10 <= 21) { horoscopo = "Escorpio"; }
					if (22 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Sagitario"; }
				break;
				case 12:
					if (1  <= diaEj10 && diaEj10 <= 21) { horoscopo = "Sagitario"; }
					if (22 <= diaEj10 && diaEj10 <= 31) { horoscopo = "Capricornio"; }
				break;
			
			default:
			System.out. print("Datos mal introducidos");
			}
		
			System.out.print("Según la fecha, el horoscopo es: " + horoscopo);
		  break;
		  
		  case 11:
/* Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
*/
			System.out.println("Introduce la hora");
			int horaEj11 = Integer.parseInt(System.console().readLine());
			System.out.println("Introduce el minuto");
			int minEj11 = Integer.parseInt(System.console().readLine());
			
			int horaMedianoche = 24;
			int minMedianoche = 60;
			int segMedianoche = 0;
			
			if (0 <= horaEj11 && horaEj11 <= 23) {
				if (0 <= minEj11 && minEj11 <= 59) {
					if (minEj11 == 0) {
						horaMedianoche -= horaEj11;
							if (horaMedianoche==24) { horaMedianoche = 0; }
						minMedianoche = 00;
						segMedianoche = horaMedianoche * 360;
					}
					else {
						horaMedianoche = horaMedianoche - 1 - horaEj11;
						minMedianoche -= minEj11;
						segMedianoche = (horaMedianoche * 360) + (minMedianoche * 60);
					}
					
					System.out.printf("Quedan %d horas y %d minutos para la media noche \n", horaMedianoche, minMedianoche);
					System.out.printf("Eso equivale a %d segundos para la medianoche", segMedianoche);
				}
				else { System.out.printf("Minutos mal introducidos, debe ser de 00 a 59"); }
			}
			else { System.out.printf("Hora mal introducida, debe ser de 00 a 23"); }
		  break;
		  
		  case 12:
/* Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. 
Cada pregunta acertada sumará un punto. 
El programa mostrará al final la calificación obtenida. 
Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
*/
    System.out.println("CUESTIONARIO");
    
    int puntosEj12 = 0;
    String resEj12;
    
    System.out.println("\n1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("Respuesta:");
    resEj12 = System.console().readLine();
    if (resEj12.equals("b")) {puntosEj12++;} 
    
    System.out.println("\n2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("Respuesta:");
    resEj12 = System.console().readLine();  
    if (resEj12.equals("c")) {puntosEj12++;} 

    System.out.println("\n3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("Respuesta:");
    resEj12 = System.console().readLine();
    if (resEj12.equals("b")) {puntosEj12++;}
    
    System.out.println("\n4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("Respuesta:");
    resEj12 = System.console().readLine();
    if (resEj12.equals("a")) {puntosEj12++;}
    
    System.out.println("\n5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("Respuesta:");
    resEj12 = System.console().readLine();
    if (resEj12.equals("a")) {puntosEj12++;} 

    System.out.println("\nNOTA:" + puntosEj12 + " / 5");
		  break;
		  
		  case 13:
/* Ejercicio 13
Escribe un programa que ordene tres números enteros introducidos por teclado.
*/
			System.out.println("Introduce el valor de 'a'");
			int aEj13 = Integer.parseInt(System.console().readLine());
			System.out.println("Introduce el valor de 'b'");
			int bEj13 = Integer.parseInt(System.console().readLine());
			System.out.println("Introduce el valor de 'c'");
			int cEj13 = Integer.parseInt(System.console().readLine());
			
			if (cEj13 < aEj13 && bEj13 < aEj13){
				if (cEj13 < bEj13){
					System.out.print(aEj13 + " > " + bEj13 + " > " + cEj13);
				}
				else {
					System.out.print(aEj13 + " > " + cEj13 + " > " + bEj13);
				}
			}
			if (cEj13 < bEj13 && aEj13 < bEj13){
				if (cEj13 < aEj13){
					System.out.print(bEj13 + " > " + aEj13 + " > " + cEj13);
				}
				else {
					System.out.print(bEj13 + " > " + cEj13 + " > " + aEj13);
				}
			}
			if (bEj13 < cEj13 && aEj13 < cEj13){
				if (bEj13 < aEj13){
					System.out.print(cEj13 + " > " + aEj13 + " > " + bEj13);
				}
				else {
					System.out.print(cEj13 + " > " + bEj13 + " > " + aEj13);
				}
			}
      
		  break;
		  
    
		  case 14:
/* Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
*/
			System.out.println("Introduce un numero");
			int xEj14 = Integer.parseInt(System.console().readLine());
			boolean par = false; 
			boolean divisible5 = false;
			
			if (xEj14 % 2 == 0) {
				par = true;
			}
			if (xEj14 % 5 == 0) {
				divisible5 = true;
			}
			System.out.printf("Par:%b \t Divisor de 5:%b", par, divisible5);
		  break;
		  
		  case 15:
/* Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. 
El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
*/
			System.out.println("Introduce algún simbolo");
			String p = System.console().readLine(); 
      
      System.out.println("¿Hacia donde quieres que apunte el vertice de la piramide; arriba, derecha, abajo o izquierda?");
      String posicionvertice = System.console().readLine(); 
      
      System.out.println();
      switch (posicionvertice) {
        case "arriba":
          System.out.println("  " +    p    + "  ");
          System.out.println(" " + p + p + p + " ");
          System.out.println(  p + p + p + p + p  );
        break;
        
        case "derecha":
          System.out.println(p);
          System.out.println(p + p);
          System.out.println(p + p + p);
          System.out.println(p + p);
          System.out.println(p);
        break;
        
        case "abajo":
          System.out.println(  p + p + p + p + p  );
          System.out.println(" " + p + p + p + " ");
          System.out.println("  " +    p    + "  ");
        break;
        
        case "izquierda":
          System.out.println("  " + p);
          System.out.println(" " + p + p);
          System.out.println(p + p + p);
          System.out.println(" " + p + p);
          System.out.println("  " + p);
        break;
        
      default:
      System.out.println("Posicion del vetice mal introducida");
      }
		  break;
		  
		  case 16:
/* Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. 
El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. 
Cada pregunta contestada como verdadero sumará 3 puntos. 
Las preguntas contestadas con falso no suman puntos. 
Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones del programa.
*/
			System.out.println("Para este test será necesario contestar 'V' si se quiere indicar verdadero y 'F' si se quiere indicar falso");
			System.out.print("Esta su pareja saliendo mucho?: ");
			String res1 = System.console().readLine();
			System.out.print("Esta su pareja comportandose de manera extraña?: ");
			String res2 = System.console().readLine();
			System.out.print("Trata su pareja de ocultarle algo?: ");
			String res3 = System.console().readLine();
			
			int puntos = 0;
			
			if (res1.equals("V")) { puntos += 3; }
			if (res2.equals("V")) { puntos += 3; }
			if (res3.equals("V")) { puntos += 3; }
			
			if (puntos == 0) { System.out.print("Muy probable que sea fiel");   }
			if (puntos == 3) { System.out.print("Probable que sea fiel");       }
			if (puntos == 6) { System.out.print("Probable que sea infiel");     }
			if (puntos == 9) { System.out.print("Muy probable que sea infiel"); }
		  break;
		  
		  case 17:
/* Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
*/
      System.out.print("Introduce un numero: ");
      int nEj17 = Integer.parseInt(System.console().readLine());
      System.out.println("La última cifra del número es " + (nEj17 % 10));
		  break;
		  
		  case 18:
/* Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. 
Se permiten números de hasta 5 cifras.
*/
    
      System.out.print("Introduce numero: ");
      int nEj18 = Integer.parseInt(System.console().readLine());
    
      if (nEj18 < 10) {System.out.print("La primera cifra del número es " + nEj18);}
      if (nEj18 >= 10 && nEj18 < 100) {System.out.print("La primera cifra del número es " + nEj18/10);}
      if (nEj18 >= 100 && nEj18 < 1000) {System.out.print("La primera cifra del número es " + nEj18/100);}
      if (nEj18 >= 1000 && nEj18 < 10000) {System.out.print("La primera cifra del número es " + nEj18/1000);}
      if (nEj18 >= 10000 && nEj18 < 100000) {System.out.print("La primera cifra del número es " + nEj18/10000);}
		  break;
		  
		  case 19:
/* Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. 
Se permiten números de hasta 5 dígitos.
*/
      System.out.print("Introduce un numero: ");
      int numEj19 = Integer.parseInt(System.console().readLine());
      
      if (-100000 < numEj19 && numEj19 < 100000) {
        if (-10000 < numEj19 && numEj19 < 10000) {
          if (-1000 < numEj19 && numEj19 < 1000) {
            if (-100 < numEj19 && numEj19 < 100) {
              if (-10 < numEj19 && numEj19 < 10) {
                System.out.print("Tiene 1 cifras");
              }else{System.out.print("Tiene 2 cifras");}
            }else{System.out.print("Tiene 3 cifras");}
          }else{System.out.print("Tiene 4 cifras");}
        }else{System.out.print("Tiene 5 cifras");}
      }else{System.out.print("Tiene más de 5 cifras");}
		  break;
		  
		  case 20:
/* Ejercicio 20
Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. 
Se permiten números de hasta 5 cifras.
*/
      System.out.print("Introduzca un numero : ");
      int nEj20 = Integer.parseInt(System.console().readLine());
    
      boolean capicua = false;
    
      if (nEj20 < 10) {
        capicua = true;
      }
   
      if ((nEj20 >= 10) && (nEj20 < 100)) {
        if ((nEj20 / 10) == (nEj20 % 10)) {
          capicua = true;
        }
      }
      
      if ((nEj20 >= 100) && (nEj20 < 1000)) {
        if ((nEj20 / 100) == (nEj20 % 10)) {
          capicua = true;
        }
      }

      if ((nEj20 >= 1000) && (nEj20 < 10000)) {
        if (((nEj20 / 1000) == (nEj20 % 10)) && ((( nEj20 / 100 ) % 10)== (( nEj20 / 10) % 10))) {
          capicua = true;
        }
      }
      
      if (nEj20 >= 10000) {
        if (((nEj20 / 10000) == (nEj20 % 10) ) && ((((nEj20 / 1000) % 10)) == ((nEj20 / 10) % 10))) {
          capicua = true;
        }
      }
    
      if (capicua) {
        System.out.println("El número es capicúa.");
      } else {
        System.out.println("El número no es capicúa.");
      }
		  break;
		  
		  case 21:
/* Ejercicio 21
Calcula la nota de un trimestre de la asignatura Programación. 
El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. 
En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, 
por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). 
Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.
 Ejemplo 1:
  Nota del primer control: 7
  Nota del segundo control: 10
  Tu nota de Programación es 8.5
 Ejemplo 2:
  Nota del primer control: 6
  Nota del segundo control: 3
  ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
  Tu nota de Programación es 5
 Ejemplo 3:
  Nota del primer control: 6
  Nota del segundo control: 3
  ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
  Tu nota de Programación es 4.5
*/
      System.out.print("Nota 1: ");
      double not1 = Double.parseDouble(System.console().readLine());
      System.out.print("Nota 2: ");
      double not2 = Double.parseDouble(System.console().readLine());
      
      double mediaEj21 = (not1+not2) / 2;
      System.out.printf("\nNota media: %2.2f", mediaEj21);
      
      if (5 <= mediaEj21) {
        System.out.println("\nSegún la nota media, estas aprobado");
      }
      else {
        System.out.println("\n¿Cuanto sacaste en la recuperacion?");
        double rec = Double.parseDouble(System.console().readLine());
        
        if (5 <= rec) {
          System.out.print("La nota trimestral es 5");
        }
        else {
          System.out.print("La nota trimestral es " + mediaEj21);
        }
      }
		  break;
		  
		  case 22:
/*	 Ejercicio 22
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. 
Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
*/
      System.out.print("Introduce un día");
      String diaEj22 = s.next();
      System.out.print("Introduce una hora");
      int horaEj22 = s.nextInt();
      System.out.print("Introduce un min");
      int minEj22 = s.nextInt();
      int dEj22 = 0;
      
      switch (diaEj22) {
        case "Lunes":
          dEj22 = 1;
        break;
        case "Martes":
          dEj22 = 2;
        break;
        case "Miercoles":
          dEj22 = 3;
        break;
        case "Jueves":
          dEj22 = 4;
        break;
        case "Viernes":
          dEj22 = 5;
        break;
        default:
          System.out.println("Dia mal introducido");
      }
      
      System.out.printf("Quedan %d minutos para el finde", (((5*24*60)+(15*60))- ((dEj22*24*60)+(horaEj22*60)+(minEj22))));
      
      
		  break;
	  
		  default:
      System.out.println("Ejercicio mal introducido");
		  
	  }
  }
}
