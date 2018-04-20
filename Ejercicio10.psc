Algoritmo Ejercicio10
	
	Definir listaColoresAulas como cadenas
	Dimension listaColoresAulas[3]
	
	Definir listaCapacAulas como numeros
	Dimension listaCapacAulas[3]
	
	listaColoresAulas[0] <- "Azul"
	listaColoresAulas[1] <- "Verde"
	listaColoresAulas[2] <- "Amarillo"
	
	listaCapacAulas[0]<-40
	listaCapacAulas[1]<-35
	listaCapacAulas[2]<-30
	
	Definir colorAula como cadena
	Definir i,indiceAulaAux , cantAlumIns , capacidadAulaActual , capacidadAulaAux  como Numero

	indiceAulaAux<-0
	
	Escribir "Cantidad de alumnos inscriptos al cursado:"
	leer cantAlumIns
	
	capacidadAulaAux <- listaCapacAulas[0] //Inicialización.
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		capacidadAulaActual = listaCapacAulas[i]
		SI(capacidadAulaActual >= cantAlumIns && capacidadAulaActual < capacidadAulaAux)
			capacidadAulaAux = capacidadAulaActual;
			indiceAulaAux = i;
		FIN SI
	Fin Para
		
	colorAula = listaColoresAulas[indiceAulaAux]
	
	Escribir "Aula "  colorAula  " con una capacidad de: "  capacidadAulaAux;

FinAlgoritmo
