package U2.T8;

import java.util.Scanner;

public class Ej15 {
    /*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
     Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt(); //Limite superior
        int x = 0; //numero que comprueba si es primo
        int resto = 0;
        int num_mult = 0;
        int contador = 0;
        int i=1;

        while(x<=num){
            for (x=1 ; x<=num ; x++){
                for (i=1 ; i<=x ; i++){

            }
            }
        }System.out.print("Hay "+contador+" numeros primos");


















        /*int contador = 0;
        int aux = 0;
        int i = 0;
        int div = 1;
        int resto = 0;

        while(i<=num){

            for (i =1 ; i <= div ; i++ ){
                resto = i%div;
                if (resto == 0){
                    aux++;
                }

            }if (aux<2){
                contador=contador;
            }else{
                contador++;
            }
        }*/

    }
}
