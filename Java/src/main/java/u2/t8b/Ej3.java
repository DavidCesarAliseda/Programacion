package u2.t8b;

import java.util.Scanner;

public class Ej3 {
    /*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
    El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
    por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número ");
        int num = teclado.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        for (int n = 1; n<=num; n++){

            System.out.print(num1+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}
