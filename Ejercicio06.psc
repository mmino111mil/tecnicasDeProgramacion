//Ejercicio 6 – Repetitiva Mientras (While)
//Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del número que ingrese el usuario. Para definir hasta que número desea que muestre la tabla de multiplicación el usuario también deberá ingresar este valor. La tabla de multiplicación a mostrar debe empezar en la multiplicación por 1.

Algoritmo Ejercicio06
	
	definir tablaDelNumero como entero
	definir hastaNumero como entero
	definir resultado como entero
	definir contador como entero
	
	contador <-0
	
	Escribir "Tabla Del Numero: "
	Leer tablaDelNumero
	
	Escribir "Hasta el numero: "
	Leer hastaNumero
	
	Mientras contador < hastaNumero Hacer
		contador <- contador + 1
		resultado <- contador * tablaDelNumero
		Escribir tablaDelNumero  " x " contador " = " resultado
	Fin Mientras
	
FinAlgoritmo
