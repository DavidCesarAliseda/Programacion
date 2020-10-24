package U2.T8;

import java.util.Scanner;

public class Ej15 {
    /*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
     Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt(); //Limite superior
        boolean flag = false;
        int numero = 0;
        int numero_de_primos = 0;
        int contador =0;
        int resto = 0;
        int raiz= 0;
        int i = 0;


        for(numero=1 ;numero<=num ;numero++){
            for ( raiz = (int) Math.sqrt(numero); i <=raiz ; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }if (contador <= 2){
                numero_de_primos++;
            }

        } System.out.print(numero_de_primos);









        /*int x = 0; //numero que comprueba si es primo
        int i = 0; //numero que se comprueba si es primo
        int resto = 0;
        int contador_div = 0;
        int contador = 0;

        for (i=1 ; i<=num ; i++){
            for (x=1 ; x<=i ; x++){
                resto=i%x;
                if (resto==0){
                    contador_div++;
                }
            }
            if (contador_div<=2){  //En este if entran todos aquellos que sean primos
                contador++;
            }
        }
        System.out.print("La cantidad de números primos es "+contador+".");*/
    }
}
