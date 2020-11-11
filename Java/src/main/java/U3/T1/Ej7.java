package U3.T1;

import java.util.Scanner;

public class Ej7 {
    /* Diseñar una función que nos diga si un número es primo.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero: ");
        int n = teclado.nextInt();
        if (es_primo( n )){
            System.out.println( "El número es primo. ");
        }else {
            System.out.println( "El número no es primo. ");
        }
    }
    public static boolean es_primo(int n){
        boolean primo = true;

        for (int i = 2; i < n;i++ ){
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
