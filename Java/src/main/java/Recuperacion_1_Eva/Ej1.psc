Algoritmo Ej1
	Definir num Como Entero;
	Definir contador Como Entero;
	Definir mayor Como Entero;
	Definir impar Como Real;
	Definir contimpar Como Entero;
	Definir sumaimpar Como Entero;
	num <- 0;
	contador <- 0;
	mayor <- 0;
	impar <- 0;
	contimpar <- 0;
	sumaimpar <- 0;
	
	Escribir "Indroduzca numeros de forma consecutiva. Para salir del programa introducir un número negativo. ";
	Mientras num >= 0 Hacer
		Leer num;
		Si num > 0 Entonces
			contador<-contador+1;
		
	
			Si num > mayor y num Mod 2 = 0 Entonces
				mayor <- num;
			FinSi
		
			Si No num Mod 2 = 0 Entonces
				contimpar <- contimpar + 1;
				sumaimpar <- sumaimpar + num;	
			
			FinSi
		FinSi
	FinMientras
	
	Escribir "Ha introducido " contador " numeros no negativos.";
	Escribir "El mayor numero par es " mayor ".";
	Escribir "La media de los numeros impares es " sumaimpar/contimpar ".";
	
FinAlgoritmo
