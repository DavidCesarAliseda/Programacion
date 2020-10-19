package U2.T5;

import java.util.Scanner;

public class Ej4 {
    //Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int Num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int Num2 = teclado.nextInt();

        int contador = 0;
        int resto1 = Num1%2;
        int resto2 = Num2%2;

        if(resto1==0){
            contador++;
        }
        if(resto2==0){
            contador++;
        }

        System.out.println("La cantidad de numeros pares es "+contador);
    }
}