package U3.T3;

import java.util.Scanner;

public class Ej2 {
    /*Escribir una aplicación que solicite al usuario cuántos números desea introducir.
    A continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
    los mostrará en el orden inverso al introducido.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos datos desea introducir?: ");
        int n = teclado.nextInt();

        int[] num_enteros = new int[n];

        for (int i = 0; i < num_enteros.length; i++) {
            System.out.print("Introduzca el dato "+i+": ");
            num_enteros[i] = teclado.nextInt();

        }
        for (int i = num_enteros.length-1; i >= 0 ; i--) {
            System.out.println("El dato "+i+" es "+num_enteros[i]);
        }

    }
}
