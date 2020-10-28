package U2.T8;

import java.util.Scanner;

public class Ej15 {
    /*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
     Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:*/
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = teclado.nextInt(); //Limite superior
        int contador_primos = 0;
        int num = 0;
        boolean es_primo = true;

        int i = 0;

        for(num = 1; num<=n; num++) {//Recorre desde 1 hasta n
            es_primo = true;
            for (i = 2; i < num ; i++) {   //encontrar un numero primo para un numero concreto
                if (num % i == 0) {
                    es_primo = false;
                    break;
                }
            }if(es_primo){
                contador_primos++;
            }
        }System.out.print("Hay "+contador_primos+" numeros primos.");
    }
}
