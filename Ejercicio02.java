import java.io.Console;
import java.util.Scanner;

/**
 * Ejercicio 2 – Alternativa Simple
 *
 * Escribir un algoritmo que permita loguearse (registrarse) a un sistema, ingresando un nombre de usuario
 * y la contraseña adecuada. Considerar que tanto el usuario como la contraseña están formados sólo por letras.
 * El sistema deberá validar que el usuario y la contraseña sean correctas, comparándolas con lo que es
 * sistema tiene registrado para ese usuario.
 *
 * Aclaración, en los sistemas reales, el inicio de sesión es mucho más complejo que lo que se muestra a
 * continuación. Se ha simplificado el proceso, abstrayendo la validación a una función denominada esValido()
 * que resuelve la verificación del usuario y su contraseña.
 */
public class Ejercicio02 {

	public static void main(String [] args){

		String username="";
		String password="";

		System.out.print ("Username:");
		username = new Scanner(System.in).next();

		System.out.print ("Password:");
		password = new Scanner(System.in).next();

		if(esValido( username, password)){
			System.out.println ("Usuario valido : username " + username + " "  + " password " + password);
		}else{
			System.out.println ("Usuario INVALIDO : username " + username );
		}

	}

	public static boolean esValido(String username, String password){
		return "user".equals(username) && "pass".equals(password) ? true : false ;
	}

}
