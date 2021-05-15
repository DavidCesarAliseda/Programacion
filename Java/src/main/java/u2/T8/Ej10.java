package u2.T8;

import java.util.Scanner;

public class Ej10 {
    /* Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
     El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        for (int i = 1 ; i<=10; i++){

            System.out.print((num*i)+"\n");


        }

    }
}
