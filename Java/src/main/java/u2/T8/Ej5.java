package u2.T8;

import java.util.Scanner;

public class Ej5 {
    /*Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
     A continuación, solicitará por teclado un valor que debe estar dentro del rango.
     Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el minimo de un rango: ");
        int min = teclado.nextInt();
        System.out.print("Introduce el maximo de un rango: ");
        int max = teclado.nextInt();
        System.out.print("Introduce un numero intermedio: ");
        int num = teclado.nextInt();

        while (num>max || num<min){
            System.out.print("Ese numero no es intermedio. Introduce un numero intermedio: ");
            num = teclado.nextInt();

        }



    }
}
