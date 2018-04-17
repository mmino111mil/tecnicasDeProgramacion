import java.util.Scanner;

/**
 * Ejercicio 3 – Alternativa Doble
 * Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y la cantidad de alumnos inscriptos para un curso,
 * permita determinar si alcanzan los bancos existentes. De no ser así, informar además cuantos bancos sería necesario agregar.
 * El usuario deberá ingresar por teclado tanto la cantidad de bancos que tiene el aula, como la cantidad de alumnos inscriptos para el curso.
 */
public class Ejercicio03 {

	public static void main(String [] args){

		int cantBancos=0;
		int cantAlumnos=0;
		int necesarioAgregar = 0;

		System.out.print("Cantidad de bancos de Aula : ");
		cantBancos = new Scanner(System.in).nextInt();

		System.out.print("Cantidad de alumnos inscriptos : ");
		cantAlumnos = new Scanner(System.in).nextInt();

		if(cantAlumnos <= cantBancos){
			System.out.print("Alcanzan los bancos existentes");
		}else{
			System.out.print("NO Alcanzan los bancos existentes");
			necesarioAgregar = cantAlumnos - cantBancos;
			System.out.print("Es necesario Agregar" + necesarioAgregar);
		}

	}
}
