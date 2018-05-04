SubAlgoritmo MostrarArreglo ( A , n)
	Definir j Como Entero
	j<-0
	Escribir "[" sin saltar
	Para j<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir A[j]  sin saltar 
		si j!= (n-1) entonces 
			Escribir "," sin saltar
		FinSi
	Fin Para
	Escribir "]"
	Esperar 1 segundo
Fin SubAlgoritmo

Algoritmo insercion
	
	Definir intercambiado como Logico
	Definir n,i,j,aux,A,valor Como entero
	
	Dimension A[100]
	
	n<-6
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese A[" i "] = " sin saltar 
		Leer A[i]
	Fin Para
	
	//A[0]<-2
	//A[1]<-3
	//A[2]<-4
	//A[3]<-5
	//A[4]<-1
	
	Escribir "Vector Ingresado :"
	MostrarArreglo(A,n)
	
	i<-1
	Mientras ( i < n ) Hacer
		aux <- A[i]
		j<-i-1
		Mientras (j >= 0 y A[j] > aux) Hacer
			A[j+1]<-A[j]
			j<- j - 1
		Fin Mientras
		A[j+1]<-aux
		i <- i + 1
		MostrarArreglo(A,n)
	Fin Mientras
	
	
	Escribir "Vector Ordenado :"
	MostrarArreglo(A,n)
	
FinAlgoritmo
