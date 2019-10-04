Algoritmo Ejercicio3
	
	definir altura, x, i como entero
	
	cont<-"*"
	
	Escribir Sin Saltar "Introduce la altura: "
	leer altura;

	
	Para x<-1 Hasta altura Con Paso 1 Hacer
		
		escribir cont
		cont<-cont+"*"
		
	FinPara
	
	Para i<- altura Hasta 1 Con Paso -1 Hacer
		cont<- ""
		altura<-altura-1
		
		
		
		escribir cont
	FinPara
FinAlgoritmo