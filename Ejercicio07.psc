Algoritmo sin_titulo
	Definir tablaDelNumero Como Entero
	Definir hastaNumero Como Entero
	Definir resultado Como Entero
	Definir contador Como Entero
	contador <- 0
	Escribir 'Tabla Del Numero: '
	Leer tablaDelNumero
	Escribir 'Hasta el numero: '
	Leer hastaNumero
	Repetir
		contador <- contador+1
		resultado <- contador*tablaDelNumero
		Escribir tablaDelNumero,' x ',contador,' = ',resultado
	Hasta Que contador>=hastaNumero
FinAlgoritmo

