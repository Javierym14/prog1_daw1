Algoritmo ej3
	Escribir "Introduce la altura"
	Leer  altura
	asterisco<-altura
	espacio<-0
	Para  linea<-1 hasta altura con paso 1
		Para  espacio_linea<-0 hasta espacio con paso 2
			Escribir  " " Sin Saltar 
		FinPara
		Para  asterisco_linea<-1 hasta asterisco con paso 1
			
			Escribir  "*" sin saltar
			
		FinPara
		
		asterisco<-asterisco-1
		
		espacio<-espacio+1
		
		Escribir  " "
		
	FinPara
	Para  linea<-1 hasta altura con paso 1
		Para  espacio_linea<-0 hasta espacio con paso 2
			Escribir  " " sin saltar
		FinPara
		Para  asterisco_linea<-1 hasta asterisco con paso 1
			
			Escribir  "*" sin saltar
			
		FinPara
		
		asterisco<-asterisco+1
		
		espacio<-espacio-1
		
		Escribir  " "
		
	FinPara
	
FinProceso
	

