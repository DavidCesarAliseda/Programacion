package U2.T8;

import java.util.Scanner;

public class Ej8 {
    //Pedir un número y calcular su factorial.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número para hacer el factorial: ");
        int num = teclado.nextInt();
        int contador = num-1;
        int factorial = num;


        for ( int i = num-1 ; i>0 ; i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+num+" es "+factorial+".");


        /*
        while ( contador !=0) {
            factorial=factorial*contador;
            contador--;
        }

        System.out.print("El factorial de "+num+" es "+factorial+".");*/
    }
}
