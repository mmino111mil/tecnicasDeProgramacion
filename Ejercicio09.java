import java.util.Arrays;
import java.util.Scanner;


/*
	Definir butacas como Numeros
	Definir  I , acum Como Numeros

	Dimension butacas[5]

	acum <- 0

	Para I<-0 Hasta 4 Hacer
		butacas[I] <- aleatorio(0,1)
		escribir butacas[I]
	FinPara

	Para I<-0 Hasta 4 Hacer
		si butacas[I] == 1 entonces
			acum <- acum +1
		FinSi
	FinPara

	escribir acum

 */
public class Ejercicio09 {

	public static void main(String [] args){

		boolean [] butacas ;
		int i = 0;
		int acum = 0;

		System.out.print("Cantidad de butacas : " );

		int totalDeButacas = new Scanner(System.in).nextInt();

		butacas = llenarButacas(totalDeButacas);

		System.out.println("butacas" + Arrays.toString(butacas));

		for(i = 0 ; i<totalDeButacas; i++){
			if(butacas[i] == false ) {
				acum ++ ;
			}
		}

		System.out.println("butacas desocupadas " + acum + "  ");

	}

	private static  boolean [] llenarButacas(int totalDeButacas){
		boolean [] butacas = new boolean[totalDeButacas];
		for(int i = 0 ; i<totalDeButacas; i++){
			butacas [i] = Math.random() < 0.5;
		}
		return butacas;
	}

}
