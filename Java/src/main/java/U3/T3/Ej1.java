package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    /*Diseñar un programa que solicite al usuario 5 números decimales.
    A continuación, debe mostrar los números en el mismo orden en que se han introducido.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] num_decimales = new double[5];

        for (int i = 0; i < num_decimales.length; i++) {
            System.out.print("Deme el dato "+i+": ");
            num_decimales[i]= teclado.nextDouble();
        }
        for (int i = 0; i < num_decimales.length; i++) {
            System.out.println("El dato "+i+" es "+num_decimales[i]);
        }

    }
}
