Algoritmo Ejercicio03
	
	Definir cantBancos como Entero
	Definir cantAlumnos como Entero
	Definir necesarioAgregar como Entero
	
	Escribir "Cantidad de bancos de Aula :"
	Leer cantBancos
	
	Escribir "Cantidad de alumnos inscriptos : "
	Leer cantAlumnos

	Si cantAlumnos <= cantBancos Entonces
		Escribir "Alcanzan los bancos existentes" 
	SiNo
		necesarioAgregar <- cantAlumnos - cantBancos
		Escribir "Es necesario Agregar "  necesarioAgregar " bancos "
	Fin Si

FinAlgoritmo
