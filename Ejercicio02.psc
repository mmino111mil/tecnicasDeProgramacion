SubAlgoritmo valido <- esValido ( username , password   )
	definir valido como logico
	valido <- (username == "user") Y (password == "pass" )
Fin SubAlgoritmo

Algoritmo Ejercicio02
	Definir username Como Caracter
	Definir password Como Caracter
	Definir valido Como Logico
	
	Escribir "Ingrese username"
	Leer username
	
	Escribir "Ingrese password"
	Leer password
	
	valido <-esValido(username , password)
	
	Si valido Entonces
		Escribir "Usuario valido :  "  username  " password "  password
	SiNo
		Escribir  "Usuario NO valido :  "  username
	Fin Si

FinAlgoritmo
