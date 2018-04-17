import java.util.Scanner;

/**
 * Ejercicio 5 – Alternativa Múltiple
 * Diseñar un algoritmo que devuelva el nombre del mes, a partir del número de mes, ingresado por teclado, por el usuario.
 * Si el usuario ingresa un número de mes que no exista, se deberá mostrar un mensaje indicando que el número ingresado no es correcto.
 *
 */
public class Ejercicio05 {

	public static void main(String [] args) {
		option3();
	}

	public static void option1() {

		int numeroDeMes = 0;
		String mes = "No se ingreso un mes";

		System.out.print("Numero del mes : ");
		numeroDeMes = new Scanner(System.in).nextInt();

		switch (numeroDeMes){
			case  1 : mes = "Enero"      ; break;
			case  2 : mes = "Febrero"    ; break;
			case  3 : mes = "Marzo"      ; break;
			case  4 : mes = "Abril"      ; break;
			case  5 : mes = "Mayo"       ; break;
			case  6 : mes = "Junio"      ; break;
			case  7 : mes = "Julio"      ; break;
			case  8 : mes = "Agosto"     ; break;
			case  9 : mes = "Septiembre" ; break;
			case 10 : mes = "Octubre"    ; break;
			case 11 : mes = "Noviembre"  ; break;
			case 12 : mes = "Diciembre"  ; break;
			default : mes = "NO valido"  ; break;
		}

		System.out.print("El mes ingresado  : " + mes );
	}


	public static void option2() {

		int numeroDeMes = 0;
		String mes = "No se ingreso un mes";

		System.out.print("Numero del mes : ");
		numeroDeMes = new Scanner(System.in).nextInt();

		if(numeroDeMes == 1){
			mes = "Enero";
		}else if(numeroDeMes == 2){
			mes = "Febrero";
		}else if(numeroDeMes == 3){
			mes = "MArzo";
		}else if(numeroDeMes == 4){
			mes = "Abril";
		}else if(numeroDeMes == 5){
			mes = "Mayo";
		}else if(numeroDeMes == 6){
			mes = "Junio";
		}else if(numeroDeMes == 7){
			mes = "Julio";
		}else if(numeroDeMes == 8){
			mes = "Agosto";
		}else if(numeroDeMes == 9){
			mes = "Septiembre";
		}else if(numeroDeMes == 10){
			mes = "Octubre";
		}else if(numeroDeMes == 11){
			mes = "Noviembre";
		}else if(numeroDeMes == 12){
			mes = "Diciembre";
		}else{
			mes = "NO valido";
		}

		System.out.print("El mes ingresado  : " + mes );
	}

	public static void option3() {

		int numeroDeMes = 0;
		String mes = "No se ingreso un mes";
		String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		System.out.print("Numero del mes : ");
		numeroDeMes = new Scanner(System.in).nextInt();

		if(numeroDeMes > 0 && numeroDeMes <=12){
			System.out.print("El mes ingresado  : " + meses[numeroDeMes - 1] );
		}else{
			System.out.print("El mes ingresado no es valido");
		}


	}


}
