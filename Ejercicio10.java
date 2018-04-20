import java.util.Arrays;
import java.util.Scanner;


/*
INICIO
Texto listaColoresAulas[] = [“Azul”, “Verde”, “Amarillo”]
entero listaCapacAulas[] = [40, 35, 30]
entero cantAlumIns
IMPRIMIR: “Ingrese la cantidad de alumnos inscriptos al cursado:”
TOMAR Y ASIGNAR: cantAlumIns
entero capacidadAulaAux = Obtener(listaCapacAulas,0) //Inicialización.

PARA (entero i=1, i< listaCapacAulas.lenght(), i++)
entero capacidadAulaActual = Obtener (listaCapacAulas, i);
SI(capacidadAulaActual >= cantAlumIns && capacidadAulaActual < capacidadAulaAux)
capacidadAulaAux = capacidadAulaActual;
entero indiceAulaAux = i;
FIN SI
Fin PARA
Texto colorAula = Obtener(listaColoresAulas, indiceAulaAux);
IMPRIMIR: “El aula indicada para la cantidad ingresada de alumnos es el aula” + colorAula + “con una capacidad de:” + capacidadAulaAux;
FIN

 */
public class Ejercicio10 {

	public static void main(String [] args){

		String [] listaColoresAulas = new String[]{"Azul", "Verde", "Amarillo"};
		int [] listaCapacAulas = new int [] {40, 35, 30};

		int i = 0;
		int indiceAulaAux = 0;

		System.out.print("Ingrese la cantidad de alumnos inscriptos al cursado:" );

		int cantAlumIns = new Scanner(System.in).nextInt();
		int capacidadAulaAux = listaCapacAulas[0];

		for(i=0;i<listaCapacAulas.length;i++){
			int capacidadAulaActual = listaCapacAulas[i];
			if(capacidadAulaActual >= cantAlumIns && capacidadAulaActual < capacidadAulaAux) {
				capacidadAulaAux = capacidadAulaActual;
				indiceAulaAux = i;
			}
		}
		String colorAula = listaColoresAulas [indiceAulaAux];
		System.out.println("Aula " + colorAula + " con una capacidad de: " + capacidadAulaAux);

	}



}
