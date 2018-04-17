import java.util.Scanner;

/**
 * Ejercicio 4 – Alternativa Doble
 * Diseñar un algoritmo que permita aplicar un descuento del 10% al monto total de una compra si la forma de pago empleada es de contado.
 * El usuario deberá ingresar el monto de la compra realizada y la forma de pago utilizada. Si es contado, deberá aplicar el descuento,
 * sino se deberá mostrar un mensaje informando que para dicha forma de pago no tiene descuento.
 */
public class Ejercicio04 {

	private static final double CONTADO = 0;
	private static final double TARJETA = 1;

	public static void main(String [] args){

		double descuento = 0.9;
		double montoTotal = 0;
		double formaDePago = CONTADO;

		System.out.print("Monto Total : ");
		montoTotal = new Scanner(System.in).nextDouble();

		System.out.print("Forma de pago : ");
		formaDePago = new Scanner(System.in).nextDouble();

		if(formaDePago == CONTADO ){
			double descuentoAplicado = montoTotal * descuento;
			System.out.print("descuento Aplicado : " + descuentoAplicado);
		}else{
			System.out.print("forma de pago no tiene descuento : " + montoTotal);
		}

	}
}
