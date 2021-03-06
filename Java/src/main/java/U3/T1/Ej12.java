package U3.T1;

import java.util.Scanner;

public class Ej12 {
    /*Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = teclado.nextInt();
        System.out.println("El factorial de "+n+" es "+factorial(n));

    }

    public static long factorial(long n) {
        long resultado = 1;

        if (n == 0) {
            return resultado;                      //si n=0 resultado es 1 que es multiplicado por el resto del factorial
        } else {
            return n * factorial(n - 1);   //hace el factorial normal hasta llegar a n-1=0
        }
    }
}
