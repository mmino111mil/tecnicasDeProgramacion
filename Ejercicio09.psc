
//Ejercicios sobre Estructuras de Datos
//Ejercicio 9 � Arreglo Booleano
//Dise�ar un algoritmo que recorra las butacas de una sala de cine y determine cu�ntas butacas desocupadas 
//hay en la sala. Suponga que inicialmente tiene un array (arreglo) 
//con valores booleanos que si es verdadero(verdadero) implica que est� ocupada 
//y si es falso(falso) la butaca est� desocupada. Tenga en cuenta que el array deber� ser creado 
//e inicializado al principio del algoritmo.
		
Algoritmo Ejercicio09
	
	Definir butacas como Numeros
	Definir  I , acum Como Numeros
	
	Dimension butacas[5]

	acum <- 0

	Para I<-0 Hasta 4 Hacer
		butacas[I] <- aleatorio(0,1)
		escribir butacas[I] 
	FinPara
	
	Para I<-0 Hasta 4 Hacer
		si butacas[I] == 1 entonces
			acum <- acum +1
		FinSi
	FinPara
	
	escribir acum

	
	
FinAlgoritmo
