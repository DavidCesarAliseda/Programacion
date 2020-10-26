package U2.T8;

import java.util.Scanner;

public class Ej15 {
    /*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
     Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:*/
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt(); //Limite superior
        int i = 0;
        boolean es_primo = true;
        int j=0;
        int contador=0;


        for(j=2; j<=num; j++) {              //Recorre desde 1 hasta n
            for (i = 2; i <= num - 1; i++) {   //encontrar un numero primo para un numero concreto
                if (num % i == 0) {
                    es_primo = false;
                    break;
                }
            }if(es_primo){
                contador++;
            }
        }System.out.print("Hay "+contador+" numeros primos.");



        /*for(numero=2 ;numero<=num-1 ;numero++){
            if (numero % i == 0) {
                contador++;
            }
        }if (contador <= 2){
                numero_de_primos++;
            }

        } System.out.print(numero_de_primos);*/









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
