package U3.T1;

import java.util.Scanner;

public class Ej2 {
    /*Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero: ");
        int n1 = teclado.nextInt();
        System.out.print( "Introduzca el segundo numero: ");
        int n2 = teclado.nextInt();

        comprendidos( n1, n2);

    }
    public static void comprendidos(int n1, int n2){
        if (n1>n2){
            return;
        }
        else {
            for(int i = n1; i<=n2; i++){
                System.out.print(i+"\n");

            }
        }
    }
}
