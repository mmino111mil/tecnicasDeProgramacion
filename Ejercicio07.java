import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String [] args){

		int tablaDelNumero, hastaNumero,resultado , contador  ;

		contador = 0 ;

		System.out.print("Tabla Del Numero: ");
		tablaDelNumero = new Scanner(System.in).nextInt();

		System.out.print("Hasta el numero: ");
		hastaNumero = new Scanner(System.in).nextInt();

		do{
			contador = contador + 1;
			resultado=contador * tablaDelNumero;
			System.out.println( tablaDelNumero + " x " + contador + " = " +resultado );
		}while ( contador < hastaNumero );

	}

}
