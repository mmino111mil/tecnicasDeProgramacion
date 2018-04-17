import java.util.Scanner;

/**
 * Ejercicio 1 – Secuencial
 * Escribir un algoritmo que permita realizar una suma de dos números enteros. El usuario deberá ingresar primero un número, luego el siguiente número,
 * y el sistema arrojará el resultado correspondiente.
 */

public class Ejercicio01 {

	public static void main(String [] args){

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.print ("Ingrese A : ");
		a = new Scanner(System.in).nextInt();

		System.out.print ("Ingrese B : ");
		b = new Scanner(System.in).nextInt();

		c = a + b;

		System.out.print ("Suma A + B : " + c );

	}
}
