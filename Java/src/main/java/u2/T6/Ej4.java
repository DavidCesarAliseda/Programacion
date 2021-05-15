package u2.T6;

import java.util.Scanner;

public class Ej4 {
    //Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        byte num1 = teclado.nextByte();
        System.out.print("Introduzca el segundo numero: ");
        byte num2 = teclado.nextByte();

        int menor=0;
        int menor2=0;

        if (num1>num2){
            menor=num2;
        }
        if (num2>num1){
            menor=num1;
        }
        System.out.println("El numero menor es "+menor+".");

        menor2 = (num1<num2)?num1:num2;
        System.out.println("El menor de los numeros es "+menor2+".");
    }


}
