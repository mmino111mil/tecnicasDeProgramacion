Algoritmo Ejercicio04
	Definir descuento Como Real
	Definir montoTotal Como Real
	Definir formaDePago Como Caracter
	Definir descuentoAplicado Como Real
	
	descuento <- 10
	
	Escribir 'Monto Total:'
	Leer montoTotal
	Escribir 'forma De Pago: '
	Leer formaDePago
	Si (formaDePago=='CONTADO') Entonces
		descuentoAplicado <- montoTotal - ( montoTotal * descuento / 100)
		Escribir 'Total a Pagar : ' descuentoAplicado " (descuento " descuento "%)"
	SiNo
		Escribir 'Forma de pago no tiene descuento : ' montoTotal
	FinSi
FinAlgoritmo

