package U2.T8b;

import java.util.Scanner;

public class Ej2 {
    //Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número ");
        int num = teclado.nextInt();
        int contador = 0;
        int cuadrado = 0;
        int cubo = 0;

        for (contador = num+1; contador<=num+5; contador++){
            cuadrado = contador*contador;
            cubo=cuadrado*contador;


                System.out.print(contador+"  "+cuadrado+"  "+cubo+"\n");
        }
    }
}




