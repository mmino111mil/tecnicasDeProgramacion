//Ejercicio 6 � Repetitiva Mientras (While)
//Dise�ar un algoritmo que muestre por pantalla la tabla de multiplicaci�n del n�mero que ingrese el usuario. Para definir hasta que n�mero desea que muestre la tabla de multiplicaci�n el usuario tambi�n deber� ingresar este valor. La tabla de multiplicaci�n a mostrar debe empezar en la multiplicaci�n por 1.

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
