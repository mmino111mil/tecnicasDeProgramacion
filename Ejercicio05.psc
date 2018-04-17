Algoritmo Ejercicio05
	
	definir numeroDeMes como entero
	definir mes como caracter
	
	Escribir "Numero del mes : "
	Leer numeroDeMes
	
	Segun numeroDeMes Hacer
		1:
			mes <-"Enero"
		2:
			mes <- "Febrero"
		3:
			mes <- "Marzo"
		De Otro Modo:
			mes <- "INCORRECTO"
	Fin Segun
	
	Escribir "El es ingresado es " mes 
FinAlgoritmo
