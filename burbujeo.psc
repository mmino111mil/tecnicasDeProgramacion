SubAlgoritmo MostrarArreglo ( A )
	Definir j Como Entero
	j<-0
	Escribir "[" sin saltar
	Para j<-0 Hasta 4 Con Paso 1 Hacer
		Escribir A[j]  sin saltar 
		si j!=4 entonces 
			Escribir "," sin saltar
		FinSi
	Fin Para
	Escribir "]"
	Esperar 1 segundo
Fin SubAlgoritmo

Algoritmo burbujeo
	Definir intercambiado como Logico
	Definir n,i,j,aux,A Como entero
	Dimension A[5]
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Ingrese A[" i "] = " sin saltar 
		Leer A[i]
	Fin Para
	
	//A[0]<-2
	//A[1]<-3
	//A[2]<-4
	//A[3]<-5
	//A[4]<-1
	
	n<-5
	
	Escribir "Vector Ingresado :"
	MostrarArreglo(A)
	
	Repetir
		intercambiado <- Falso
		Para i<-1 Hasta 4 Con Paso 1 Hacer
			Si(A[i-1] > A[i]) Entonces
				//los intercambio y recordamos que algo a cambiado
				
				aux <- A[i-1]
				A[i-1] = A[i]
				A[i]<-aux
				intercambiado <- Verdadero
			FinSi
		Fin Para
		Escribir "Estado actual : " sin saltar 
		MostrarArreglo(A)
	Hasta Que (intercambiado == Falso)
	
	Escribir "Vector Ordenado :"
	MostrarArreglo(A)
	
FinAlgoritmo
