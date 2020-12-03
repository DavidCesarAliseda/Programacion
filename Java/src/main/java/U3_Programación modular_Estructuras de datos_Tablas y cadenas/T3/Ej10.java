package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
    /*Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar de la siguiente forma:
    se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
    La función tiene que devolver la cantidad de impares desechados.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 5;
        int[] pares;
        pares = new int [x];
        boolean espar=false;

        System.out.println("Ha introducido "+RellenaPares(x, pares)+" números pares.");
        System.out.println("El array de numeros pares es: "+Arrays.toString(pares));

    }
    public static int RellenaPares (int x, int[] pares){
        Scanner teclado = new Scanner(System.in);
        int impares = 0;
        int n = 0;

        for (int i = 0; i < x; i++) {
            do{
                System.out.println("Introduce un numero:");
                n = teclado.nextInt();
                if(n%2==0){
                    pares[i] = n;
                }else{
                    impares++;
                }
            }while (n%2!=0);
        }
        return impares;
    }
}
