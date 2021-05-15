package u2.T7;

import java.util.Scanner;

public class Ej1 {
    //Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de a: ");
        int a = teclado.nextInt();
        System.out.print("Introduzca el valor de b: ");
        int b = teclado.nextInt();

        int auxiliar = a;
        a=b;
        b=auxiliar;

        System.out.print("Ahóra a es "+a+" y b es "+b+".");
    }
}