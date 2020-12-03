package U3.T1;

import java.util.Scanner;

public class Ej4 {
    /*Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero: ");
        int n1 = teclado.nextInt();
        System.out.print( "Introduzca el segundo numero: ");
        int n2 = teclado.nextInt();

        System.out.println( "El número mayor es "+mayor (n1, n2));

    }
    public static int mayor (int n1, int n2){
        if(n1<n2){
            return n2;
        }else if (n1>n2){
            return n1;
        }else{
            System.out.print( "Error");
            return 0;
        }
    }
}
