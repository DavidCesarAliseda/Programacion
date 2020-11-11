package U3.T1;

import java.util.Scanner;

public class Ej10 {
    /*Escribir una función que decida si dos números enteros positivos son amigos.
    Dos números son amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual al segundo número, y viceversa.
    Ejemplos: (220 - 284), (1184 - 1210)*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int n2 = teclado.nextInt();

        if(num_amigos(n1,n2)){
            System.out.println(n1+" y "+n2+" son amigos.");
        }else{
            System.out.println(n1+" y "+n2+" no son amigos.");
        }

    }
    public static int suma_div(int n){  //suma divisores de un numero
        int suma=0;
        for (int i = 1; i < n; i++) { //al ser < no usa el propio número
            if(n % i == 0) {          //si i es divisor entero de n
                suma = suma + i;
            }
        }
        return suma;
    }
    static boolean num_amigos(int n1, int n2) {
        boolean son_amigos;

        if (n1 == suma_div(n2) && n2 == suma_div(n1)){
            son_amigos = true;
        }else{
            son_amigos = false;
        }
        return son_amigos;
    }
}
