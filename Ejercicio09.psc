
//Ejercicios sobre Estructuras de Datos
//Ejercicio 9 – Arreglo Booleano
//Diseñar un algoritmo que recorra las butacas de una sala de cine y determine cuántas butacas desocupadas 
//hay en la sala. Suponga que inicialmente tiene un array (arreglo) 
//con valores booleanos que si es verdadero(verdadero) implica que está ocupada 
//y si es falso(falso) la butaca está desocupada. Tenga en cuenta que el array deberá ser creado 
//e inicializado al principio del algoritmo.
		
Algoritmo Ejercicio09
	
	Definir butacas como Logicos
	Definir totalDeButacas como numero
	Definir  I , acum , tmp Como Numeros
	
	Escribir "Ingrese total butacas "
	leer totalDeButacas
	
	Dimension butacas[totalDeButacas]

	acum <- 0
	
	// llenar butacas
	Para I<-0 Hasta totalDeButacas -1 Hacer
		tmp = aleatorio(0,1);
		si tmp == 1 entonces
			butacas[I] <- Verdadero
		SiNo
			butacas[I] <- Falso
		FinSi
		
	FinPara
	
	//Mostrar butacas
	Para I<-0 Hasta totalDeButacas -1 Hacer
		Escribir butacas[I]  " " 
	FinPara
	
	//contar vacias
	Para I<-0 Hasta totalDeButacas -1 Hacer
		si butacas[I] == Falso entonces
			acum <- acum + 1
		FinSi
	FinPara
	
	escribir "Butacas desocupadas " acum

FinAlgoritmo
