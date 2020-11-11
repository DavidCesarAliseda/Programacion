package U3.T1;

import java.util.Scanner;

public class Ej8 {
    /*Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero: ");
        int n = teclado.nextInt();

        System.out.println(divisores_primos(n));

    }
    public static boolean es_primo(int n) {
        boolean primo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static int divisores_primos (int n){
        int contador_div_primos = 0;

        // Comprobamos todos los divisores de n
        for (int i = 1; i <= n; i++){
            // Si encontramos un divisor y es primo, incrementa el contador
            if (n % i == 0 && es_primo(i)) {
                contador_div_primos++;
            }
        }
        return contador_div_primos;
    }
}

