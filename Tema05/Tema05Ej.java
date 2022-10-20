import java.util.Scanner;

public class Tema05Ej{
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un ejercicio(1-34): ");
    int ejercicio = s.nextInt();
    
      while (ejercicio < 1 || 34 < ejercicio) {
        System.out.print("Introduce un ejercicio del 1 al 34, ¿no sabes los numeros?");
        ejercicio = s.nextInt();
      }
    
    switch (ejercicio) {
      case 1:
        Ejercicio1();
      break;
      case 2:
		Ejercicio2();
      break;
      case 3:
		Ejercicio3();
      break;
      case 4:
		Ejercicio4();
      break;
      case 5:
		Ejercicio5();
      break;
      case 6:
		Ejercicio6();
      break;
      case 7:
		System.out.print("Introduce la contraseña: ");
		int contraIntro = s.nextInt();
		Ejercicio7(contraIntro);
      break;
      case 8:
		System.out.print("Introduce un numero: ");
		int xEj8 = s.nextInt();
		Ejercicio8(xEj8);
      break;
      case 9:
		System.out.print("Introduce un numero: ");
		int xEj9 = s.nextInt();
		System.out.printf("El numero introducido tiene %d digitos", Ejercicio9(xEj9));
      break;
      case 10:
        System.out.println("A continuación podras escribir una serie de numeros para calcular su media.");
        System.out.println("Para dejar de introducir numeros, introduce un numero negativo.");
		
    
        int sumatotal = 0;
        int numerostotal = 0;
        int xEj10 = 1;
        while (xEj10 > 0) {
          System.out.print("Introduce un numero: ");
          xEj10 = s.nextInt();
          if (xEj10 > 0) {
            sumatotal +=  xEj10;
            numerostotal++;
          }
        }
        double media10 = (float) sumatotal / numerostotal;
      System.out.printf("Media: %4.2f", media10);
      break;
      case 11:
		System.out.print("Introduce un numero: ");
		int xEj11 = s.nextInt();
		Ejercicio11(xEj11);
      break;
      case 12:
		System.out.print("Introduce un numero: ");
		int xEj12 = s.nextInt();
		Ejercicio12(xEj12);
      break;
      case 13:
        int positivos = 0;
        int negativos = 0;
        for (int i = 1;i <= 10; i++) {
        System.out.print("Introduce un numero negativo o positivo: ");
        int xEj13 = s.nextInt();
			
			
        if (xEj13 >= 0) {
          positivos++;
        }
        else {
          negativos++;
        }
      }
      System.out.printf("\nPositivos: %d \nNegativos: %d", positivos, negativos);
      break;
      case 14:
		System.out.print("Introduce la base: ");
		int baseEj14 = s.nextInt();
		System.out.print("Introduce el exponente: ");
		int exponenteEj14 = s.nextInt();
		while (exponenteEj14 < 0) {
			System.out.print("El exponente tiene que ser positivo:");
			exponenteEj14 = s.nextInt();
		}
		
		int potenciaEj14 = Ejercicio14(baseEj14, exponenteEj14);
		System.out.printf("%d^%d = %d",baseEj14, exponenteEj14, potenciaEj14);
      break;
      case 15:
		System.out.print("Introduce la base: ");
		int baseEj15 = s.nextInt();
		System.out.print("Introduce el exponente: ");
		int exponenteEj15 = s.nextInt();
		while (exponenteEj15 < 0) {
			System.out.print("El exponente tiene que ser positivo:");
			exponenteEj15 = s.nextInt();
		}
		
		for (int i = 1; i <= exponenteEj15; i++) {
			Ejercicio14(baseEj15, i);
			System.out.printf("%d^%d = %d\n",baseEj15, i, Ejercicio14(baseEj15, i));
		}
      break;
      case 16:
		System.out.print("Introduce un numero: ");
		int xEj16 = s.nextInt();
		System.out.printf("%d es primo: %b", xEj16, Ejercicio16(xEj16));
      break;
      case 17:
		System.out.print("Introduce un numero: ");
		int xEj17 = s.nextInt();
		
		while (xEj17 < 0) {
			System.out.print("El numero tiene que ser positivo:");
			xEj17 = s.nextInt();
		}
		
		System.out.printf("La suma de los 100 numeros siguientes de %d es: %d", xEj17, Ejercicio17(xEj17));
      break;
      case 18:
		System.out.print("Introduce un numero: ");
		int xEj18 = s.nextInt();
		System.out.print("Introduce otro numero: ");
		int yEj18 = s.nextInt();
		while (xEj18 == yEj18) {
			System.out.print("Los numeros no deben ser iguales, introduce de nuevo 'y': ");
			yEj18 = s.nextInt();
		}
		
		Ejercicio18(xEj18, yEj18);
      break;
      case 19:
		System.out.print("Introduce la altura: ");
		int xEj19 = s.nextInt();
		System.out.print("Introduce un caracter: ");
		String charEj19 = s.next();
		Ejercicio19(xEj19, charEj19);
      break;
      case 20:
		System.out.print("Introduce la altura: ");
		int xEj20 = s.nextInt();
		System.out.print("Introduce un caracter: ");
		String charEj20 = s.next();
		Ejercicio20(xEj20, charEj20);
      break;
      case 21:
		System.out.print("Al introducir un numero negativo se cortara el proceso\n");
		int xEj21 = 0;
		int sumaTotalImPares = 0;
		int media = 0;
		
		int mayorPares = 0;
		
		do {
			System.out.print("Introduce un numero: ");
			xEj21 = s.nextInt();
			
			if (xEj21 % 2 != 0) {
				sumaTotalImPares += xEj21;
				media++;
			}
			if (xEj21 % 2 == 0) {
				if (xEj21 > mayorPares) {
					mayorPares = xEj21;
				}
			} 					
		} while(xEj21 < 0);
      break;
      case 22:
		for (int n = 2; n <= 100; n++) {
			Ejercicio16(n);
			if (Ejercicio16(n) == true){
				System.out.println(n);
			}
		}
      break;
      case 23:
		int total = 0;
		int contador = 0;
		double mediaEj23 = 0;
			while (total <= 10000) {
				System.out.print("Introduzca un numero: ");
				int xEj23 = s.nextInt();
				total += xEj23;
				contador++;
				mediaEj23++;
			}
			mediaEj23 = total / mediaEj23;
			System.out.printf("Suma total: %d\n", total);
			System.out.printf("Numeros introducidos: %d\n", contador);
			System.out.printf("Media: %5.2f\n", mediaEj23);
      break;
      case 24:
        System.out.print("Introduzca un numero: ");
        int xEj24 = s.nextInt();
        Ejercicio24(xEj24);
      break;
      case 25:
        System.out.print("Introduzca un numero: ");
        int xEj25 = s.nextInt();
        System.out.printf("%d al reves seria: %d", xEj25, Ejercicio25(xEj25));
      break;
      case 26:
        System.out.print("Introduce un numero entero: ");
		long numeroIntroducido = s.nextInt();

		System.out.print("Introduce un digito: ");
		int digito = s.nextInt();

		System.out.printf("%d se encuentra en la posicion/es: ", digito);
    
		long numero = numeroIntroducido;
    
		numero = numero * 10 + 1;
 
		long volteado = 0;
		int posicion = 1;
		//int longitud = 0;
    
		//if (numero == 0) {
		//longitud = 1;
		//}
		
		while (numero > 0) {
		volteado = (volteado * 10) + (numero % 10);
		numero /= 10;
		//longitud++;
		} 
        
		while (volteado != 1) {
		if ((volteado % 10) == digito) {
			System.out.print(posicion + " ");
		}
		volteado /= 10;
		posicion++;
		} 
      break;
      case 27:
        System.out.print("Introduce un numero: ");
        int n27 = s.nextInt();

        int cuenta = 0;
        int suma = 0;
    
        for (int i = 1; i <= n27; i++) {
          if ((i % 3) == 0) {
            System.out.print(i + " ");
            cuenta++;
            suma += i;
          }
        }
        
        System.out.printf("\nHay %d multiplos de 3", cuenta);
        System.out.printf("\nSuma total de ellos: %d", suma);
      break;
      case 28:
        int n28;
        do {
          System.out.print("Por favor, introduzca un número entero: ");
          n28 = s.nextInt();
      
          if (n28 < 0) {
            System.out.println("Introduce un numero entero positivo");
          }
        } while (n28 < 0);

        int factorial = n28;
    
        if (n28 == 0) {
          System.out.println("0! = 1");
        } 
        else {
          for (int i = 1; i < n28; i++) {
            factorial *= i;
          }
		System.out.println(n28 + "! = " + factorial);
        }
      break;
      case 29:
        System.out.print("Introduce un numero grande: ");
        int nmayor = s.nextInt();

        System.out.print("Introduce un numero menor al anterior: ");
        int ndivisible = s.nextInt();

        System.out.println("Numeros menores que " + nmayor + ", no divisibles entre " + ndivisible + ":");

        for (int i = 1; i < nmayor; i++) {
          if ((i % ndivisible) != 0) {
            System.out.print(i + " ");
          }
        }
      break;
      case 30:
      int primerDia = 0;
    int segundoDia = 0;
    int primeraHora = 0;
    int segundaHora = 0;
    String primerDiaString;
    String segundoDiaString;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    boolean datosCorrectos = true;

    do {
      System.out.println("\nPor favor, introduzca la primera hora.");

      boolean diaCorrecto;

      // Primer día
      do {

        diaCorrecto = true;

        System.out.print("Día: ");
        primerDiaString = System.console().readLine();

        switch (primerDiaString) {
          case "lunes":
          case "1":
            primerDia = 1;
            nombrePrimerDia = "lunes";
            break;
          case "martes":
          case "2":
            primerDia = 2;
            nombrePrimerDia = "martes";
            break;
          case "miércoles":
          case "3":
            primerDia = 3;
            nombrePrimerDia = "miercoles";
            break;
          case "jueves":
          case "4":
            primerDia = 4;
            nombrePrimerDia = "jueves";
            break;
          case "viernes":
          case "5":
            primerDia = 5;
            nombrePrimerDia = "viernes";
            break;
          case "sábado":
          case "6":
            primerDia = 6;
            nombrePrimerDia = "sábado";
            break;
          case "domingo":
          case "7":
            primerDia = 7;
            nombrePrimerDia = "domingo";
            break;
          default:
            diaCorrecto = false;
        }

        if (!diaCorrecto) {
          System.out.println("No se ha introducido correctamente el día de la semana.");
          System.out.println("Los días válidos son: lunes, martes, miércoles, jueves, viernes, sábado y domingo.");
        }

      } while (!diaCorrecto);

      // Primera hora 

      boolean horaCorrecta;

      do {
        horaCorrecta = true;
        System.out.print("Hora: ");
        primeraHora = Integer.parseInt(System.console().readLine());
        if ((primeraHora < 0) || (primeraHora > 23)) {
          System.out.println("No se ha introducido correctamente la hora del día.");
          System.out.println("Las horas válidas están entre 0 y 23.");
          horaCorrecta = false;
        }
      } while (!horaCorrecta);

      System.out.println("Por favor, introduzca la segunda hora.");

      // Segundo día
      do {

        datosCorrectos = true;

        diaCorrecto = true;

        System.out.print("Día: ");
        segundoDiaString = System.console().readLine();

        switch (segundoDiaString) {
          case "lunes":
          case "1":
            segundoDia = 1;
            nombreSegundoDia = "lunes";
            break;
          case "martes":
          case "2":
            segundoDia = 2;
            nombreSegundoDia = "martes";
            break;
          case "miércoles":
          case "3":
            segundoDia = 3;
            nombreSegundoDia = "miércoles";
            break;
          case "jueves":
          case "4":
            segundoDia = 4;
            nombreSegundoDia = "jueves";
            break;
          case "viernes":
          case "5":
            segundoDia = 5;
            nombreSegundoDia = "viernes";
            break;
          case "sábado":
          case "6":
            segundoDia = 6;
            nombreSegundoDia = "sábado";
            break;
          case "domingo":
          case "7":
            segundoDia = 7;
            nombreSegundoDia = "domingo";
            break;
          default:
            segundoDia = 0;
        }

        if (!diaCorrecto) {
          System.out.println("No se ha introducido correctamente el día de la semana.");
          System.out.print("Los días válidos son: lunes, martes, miércoles, ");
          System.out.println("jueves, viernes, sábado y domingo.");
        }

      } while (!diaCorrecto);

      // Comprueba que el segundo día sea posterior al primero 
      if (segundoDia <= primerDia) {
        System.out.println("El segundo día debe ser posterior al primero.");
        datosCorrectos = false;
      }

      // Segunda hora 
      if (datosCorrectos) {
        do {
          horaCorrecta = true;
          System.out.print("Hora: ");
          segundaHora = Integer.parseInt(System.console().readLine());
          if ((segundaHora < 0) || (segundaHora > 23)) {
            System.out.println("No se ha introducido correctamente la hora del día.");
            System.out.println("Las horas válidas están entre 0 y 23.");
            horaCorrecta = false;
          }
        } while (!horaCorrecta);

      }

    } while (!datosCorrectos);
    // Fin de la recogida de datos 

    System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
    System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
    System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s.");
      break;
      case 31:
        System.out.print("Introduce la altura: ");
        int h = s.nextInt();

        for (int i = 1; i < h; i++) {
          System.out.println("*");
        }

        for  (int i = 0; i < h / 2 + 1; i++) {
          System.out.print("* ");
        }
      break;
      case 32:
      System.out.print("Por favor, introduzca un número entero positivo: ");
    long n32 = Long.parseLong(System.console().readLine());

    long volteado32 = 0;
    int longitud32 = 0;
    
    if (n32 == 0) {
      longitud32 = 1;
    }
    
    while (n32 > 0) {
      volteado32 = (volteado32 * 10) + (n32 % 10);
      n32 /= 10;
      longitud32++;
    } 

    System.out.print("Dígitos pares: ");

    int digito32;
    int sumaPares = 0;
    
    for (int i = 1; i <= longitud32; i++) {

      digito32 = (int)(volteado32 % 10);

      if ((digito32  % 2) == 0) {
        System.out.print(digito32 + " ");
        sumaPares += digito32;
      }

      volteado32 /= 10;
    }
    
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
      break;
      case 33:
        System.out.print("Introduce la altura: ");
        int h33 = s.nextInt();

        for (int i = 1; i < h33; i++) {
          System.out.print("* ");
          for (int j = 2; j < h33; j++) {
            System.out.print("  ");
          }
          System.out.println("*");
        }
    
        System.out.print(" ");
        for (int i = 2; i <= h33; i++) {
          System.out.print("* ");
        }
      break;
      case 34:
		System.out.print("Por favor, introduzca un número: ");
		long n341 = Long.parseLong(System.console().readLine());
		System.out.print("Introduzca otro número: ");
		long n342 = Long.parseLong(System.console().readLine());

		int longitud = 0;
    
		if (n341 == 0) {
		longitud = 1;
		}
		
		long volteado1 = 0;
		while (n341 > 0) {
		volteado1 = (volteado1 * 10) + (n341 % 10);
		n341 /= 10;
		longitud++;
		} 

		long volteado2 = 0;
		while (n342 > 0) {
		volteado2 = (volteado2 * 10) + (n342 % 10);
		n342 /= 10;
		} 

		long resultadoPares = 0;
		long resultadoImpares = 0;
		int digito34;
    
    for (int i = 1; i <= longitud; i++) {

      digito34 = (int)(volteado1 % 10);

      if ((digito34 % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito34;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito34;
      }

      digito34 = (int)(volteado2 % 10);

      if ((digito34 % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito34;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito34;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }

    System.out.println("El numero formado por los digitos pares es: " + resultadoPares);
    System.out.println("El numero formado por los digitos impares es: " + resultadoImpares);
      break;
    }//FINAL SWITCH
  }//FINAL MAIN
  
  
  
  
  
/* Ejercicio 1
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for. 
*/
    public static void Ejercicio1() {
		int x = 0;
		int i = 0;
		
		for (i = 0; i <= 20; i++) {
			System.out.printf("5 * %d = %d \n", i, x);
			x += 5;
		}
	}
	
	
/* Ejercicio 2
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while. 
*/
    public static void Ejercicio2() {
		int x = 0;
		int i = 0;
		
		while (x <= 100) {
			System.out.printf("5 * %d = %d \n", i, x);
			x += 5;
			i++;
		}
	}
	
	
/* Ejercicio 3
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while. 
*/
    public static void Ejercicio3() {
		int x = 0;
		int i = 0;
		
		do {
			System.out.printf("5 * %d = %d \n", i, x);
			x += 5;
			i++;
		} while (x <= 100);
	}
	
	
/* Ejercicio 4
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
*/
    public static void Ejercicio4() {
		int i = 0;
		
		for (i = 320; i >= 160; i -= 20) {
			System.out.println(i);
		}
	}
	
	
/* Ejercicio 5
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
*/
    public static void Ejercicio5() {
		int x = 320;
		
		while (x >= 160) {
			System.out.println(x);
			x -= 20;
		}
	}	
	
	
/* Ejercicio 6
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
*/
    public static void Ejercicio6() {
		int x = 320;
		
		do {
			System.out.println(x);
			x -= 20;
		} while (x >= 160);
	}	
	
	
/* Ejercicio 7
Realiza el control de acceso a una caja fuerte. 
La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. 
Si no acertamos, se nos mostrará el mensaje 'Lo siento, esa no es la combinación'
y si acertamos se nos dirá 'La caja fuerte se ha abierto satisfactoriamente'.
Tendremos cuatro oportunidades para abrir la caja fuerte.
*/
    public static void Ejercicio7(int contraIntro) {
		int combinacion = 1611;
		int intentos = 4;
		
		do {
			if (combinacion == contraIntro) {
				System.out.print("\nLa caja fuerte se ha abierto satisfactoriamente");
				intentos = 0; 
				break;
			}
			else {
				System.out.print("\nLo siento, esa no es la combinación. ");
				intentos--;
				System.out.printf("Te quedan %d intentos \n", intentos);
				
				System.out.print("Introduce de nuevo la contraseña: ");
				contraIntro = Integer.parseInt(System.console().readLine());
			}
		} while (1 < intentos || combinacion == contraIntro);
		
		if (intentos == 1) {System.out.print("\nTe quedaste sin intentos");}
		
		
	}
/*	
	public static void Ejercicio7(int contraIntro) {
		int combinacion = 4554;
		int intentos = 4;
		
		do {
			if (combinacion == contraIntro) {
				System.out.print("\nLa caja fuerte se ha abierto satisfactoriamente");
				intentos = 0; //Tambien podemos igualar la varaible intentos a otro numero, que no sea ni mayor que cerro ni cero, para no interrumpir el else.
				break;
			}
			else {
				System.out.print("\nLo siento, esa no es la combinación. ");
				intentos--;
				System.out.printf("Te quedan %d intentos \n", intentos);
				
				System.out.print("Introduce de nuevo la contraseña: ");
				contraIntro = Integer.parseInt(System.console().readLine());
			}
		} while (1 < intentos || combinacion == contraIntro);
		
		if (intentos == 1) {System.out.print("\nTe quedaste sin intentos");}
		
		
	}
*/


/* Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.
*/
	public static void Ejercicio8(int numEj8) {
		for (int i = 0; i <= 10;i++) {
			System.out.printf("%d * %d = %d\n", numEj8, i, (numEj8*i));
		}
	}
	
	
/* Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
*/
	public static int Ejercicio9(int numEj9) {
		int digitos = 1;
		while (numEj9 > 9) {
			numEj9 = numEj9 /10;
			digitos++;
		}
		return digitos;
	}
	
	
/* Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
A priori, el programa no sabe cuántos números se introducirán. 
El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
*/
	public static void Ejercicio10(int numEj10) {
		int sumatotal = 0;
		int numerostotal = 0;
		while (numEj10 >= 0) {
			sumatotal +=  numEj10;
			numerostotal++;
		}
		int media = sumatotal / numerostotal;
	}


/* Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/
	public static void Ejercicio11(int numEj11) {
		System.out.printf("  x  |\tn^2  |\tn^3  \n\n");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("  %d  |\t%d  |\t%d  \n", numEj11, (numEj11*numEj11), (numEj11*numEj11*numEj11));
			numEj11++;
		}
	}


/* Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
El primer término de la serie de Fibonacci es 0, 
el segundo es 1 y el resto se calcula sumando los dos anteriores, 
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… 
El número n se debe introducir por teclado.
*/
	public static void Ejercicio12(int numEj12) {
	int a = 0;
    int b = 1;
    int c = 0;
      switch (numEj12) {
		 case 0:
          System.out.print("");
        break;
        case 1:
          System.out.print(a);
        break;
        case 2:
          System.out.println(a);
          System.out.println(b);
        break;
        default:
        System.out.println(a);
        for (int i = 1; i < numEj12; i++) { 
          a = b;
          b = c;
          c = b + a;
          System.out.println(c);
        }
		}
	}
	
	
/* Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
*/

	
	
/* Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
*/
	public static int Ejercicio14(int b, int e) {
		int p = 1;
		for (int i = 1;i <= e;i++) {
			if (i == 1) {
				p = b;
			} else {p = p * b;}
		}
		return p;
	}
	
	
/* Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por 
pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. 
No se deben utilizar funciones de exponenciación. 
Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.

HECHO CON LA FUNCIÓN Ejercicio14()
*/


/* Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no primo. 
Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
*/
	public static boolean Ejercicio16(int x) {
		boolean primo = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				primo = false;
			}
		}
		return primo;
	}


/* Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero 
y positivo introducido por teclado. 
Se debe comprobar que el dato introducido es correcto (que es un número positivo).
*/
	public static int Ejercicio17(int x) {
		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			suma += x;
			x++;
		}
		return suma;
	}


/* Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
*/
	public static void Ejercicio18(int x, int y) {
		int mayor = 0;
		int menor = 0;
		if (x>y) {mayor = x; menor = y;}
		else     {mayor = y; menor = x;}
		
		for (int i = menor; i <= mayor; i += 7) {
			System.out.print(i);
			if ((menor + 6) > i) {
				System.out.print(">");
			}
		}
	}


/* Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla.
La altura se debe pedir por teclado. 
El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/
	public static void Ejercicio19(int h, String c) {
			int s = h - 1;
			int l = 1;
			for (int ih = 1; ih <= h; ih++) {
				System.out.print("\n  ");
				for (int is = 1; is <= s; is++) {
					System.out.print(" ");
				}
				for (int il = 1; il <= l; il++) {
					System.out.print(c);
				}
			s--;
			l += 2;
		}
	}


/* Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*/
	public static void Ejercicio20(int h, String c) {
			int s = h - 1; //space
			int l = 1;     //letter
			for (int i = 1; i <= h; i++) {
				System.out.print("\n  ");
				for (int is = 1; is <= s; is++) {
					System.out.print(" ");
				}
				for (int il = 1; il <= l; il++) {
					if (il == 1 || il == l || i == h) {
						System.out.print(c);
					}
					else {
						System.out.print(" ");
					}
				}
			s--;
			l += 2;
		}
	}


/* Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo 
y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. 
El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

HECHO EN EL SWITCH
*/


/* Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

HECHO EN EL SWITCH con la función Ejercicio16(); 
*/


/* Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000. 
Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
*/
	
/* Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números con n filas.
*/
	public static void Ejercicio24(int n) {
		int s = n - 1; //sapce
		int l = 1;     //number
		int raiz = 1;
		for (int in = 1; in <= n; in++) {
			int y = 1;
			System.out.print("\n  ");
			for (int is = 1; is <= s; is++) {
				System.out.print(" ");
			}
			for (int il = 1; il <= l; il++) {
				if (il <= raiz) {
					System.out.print(il);
				}
				else {
					System.out.print(raiz - y);
					y++;
				}
			}
		raiz++;
		s--;
		l += 2;
		}
	}


/* Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
*/
	public static int Ejercicio25(int n) {
		int res = 0;
    while (n > 0) {
      res = (res * 10) + (n % 10);
      n = n /10;
    }
    return res;
	}


/* Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
*/


/* Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
*/


/* Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por teclado.
*/

/* Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros positivos menores 
a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
*/


/* Ejercicio 30
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como
una cadena (de 'lunes' a 'domingo'). Se debe comprobar que el usuario
introduce los datos correctamente y que el segundo día es posterior al primero.
A continuación se muestra un ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*/


/* Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
*/


/* Ejercicio 32
Escribe un programa que, dado un número entero, diga cuáles son y cuánto
suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10
*/


/* Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
Ejemplo:
Introduzca la altura de la U: 5
*
*
*
*
*
*
*
*
* * *
*/


/* Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
*/

}//FINAL CLASS
