package U2.T8;

import java.util.Scanner;

public class Ej1 {
    //Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        int cuadrado;
        int num;
        int resto;

        /*do {

            System.out.print("Introduzca un número entero: ");
             num = teclado.nextInt();

            resto = num%1;

            if (resto == 0){
                System.out.println("El numero es par. ");
            }else {
                System.out.println("El numero es impar. ");
            }

            if (num > 0){
                System.out.println("El numero es positivo. ");
            }else if (num<0) {
                System.out.println("El numero es negativo.");
            }else {
                System.out.println("El numero es el 0");
            }

            cuadrado = num*num;

            System.out.println("El cuadrado es "+cuadrado);
        } while (num != 0);*/
        num=1;
        while (num!=0) {
            System.out.print("Introduzca un número entero: ");
            num = teclado.nextInt();

            resto = num%2;

            if (resto == 0){
                System.out.println("El numero es par. ");
            }else {
                System.out.println("El numero es impar. ");
            }

            if (num > 0){
                System.out.println("El numero es positivo. ");
            }else if (num<0) {
                System.out.println("El numero es negativo.");
            }else {
                System.out.println("El numero es el 0");
            }

            cuadrado = num*num;

            System.out.println("El cuadrado es "+cuadrado+".\n");

        }
    }
}





