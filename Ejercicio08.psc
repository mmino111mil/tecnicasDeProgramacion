//Ejercicio 8 � Repetitiva Para (For)
// Dise�ar un algoritmo que realice el promedio de 4 n�meros. Los n�meros podr�n ser decimales 
// y ser�n ingresados por pantalla por el usuario.

Algoritmo Ejercicio08
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
	
FinAlgoritmo
