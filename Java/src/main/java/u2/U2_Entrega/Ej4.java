package u2.U2_Entrega;

import java.util.Scanner;

public class Ej4 {
    /*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido (incluyendo él mismo). Al lado de cada número se debe indicar
si se trata de un primo o no.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print( "Por favor, introduzca un número entero positivo: ");
        int n = teclado.nextInt();
        int consec = 0;

        for ( consec = n; consec < n + 5; consec++) {
            int contador = 0;

            for (int i = 1; i <= consec; i++) {
                if ((consec % i) == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                System.out.println(consec + " es primo.");

            } else {
                System.out.println(consec + " no es primo.");
            }
        }
    }
}

