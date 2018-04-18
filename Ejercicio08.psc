//Ejercicio 8 – Repetitiva Para (For)
// Diseñar un algoritmo que realice el promedio de 4 números. Los números podrán ser decimales 
// y serán ingresados por pantalla por el usuario.

Algoritmo Ejercicio08
	definir a como real
	definir acum como real
	definir i como entero

	acum<-0
	
	Para i<-1 Hasta  4 Con Paso 1 Hacer
		leer a
		acum <- acum + a
	Fin Para
	
	Escribir "Total " acum " Promedio : " acum / 4
	
FinAlgoritmo
