import java.util.Scanner;


/*
definir a, acum como real
	definir i como entero

	acum<-0
	cant<-4

	Escribir "Ingrese cuatro numeros : "

	Para i<-1 Hasta cant Con Paso 1 Hacer
		leer a
		acum <- acum + a
	Fin Para

	Escribir "Total " acum " Promedio : " acum / cant
 */
public class Ejercicio08 {

	private int MAX_CANT = 4;

	public static void main(String [] args){

		int i =0;

		double promedio = 0, acum = 1,  cant = 4;

		System.out.print("Ingrese " + cant + "  valores : ");

		for( i=0 ; i<4 ; i++){
			double in = new Scanner(System.in).nextDouble();
			acum = acum + in ;
		}

		promedio = acum / cant ;

		System.out.println("Promedio " + promedio + "  ");

	}

}
