package Recuperacion_1_Eva;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    /*Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica en los comentarios:

public int[] filtraCapicuas(int x[])
// Devuelve un array con todos los números capicúa que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño del
// array que se devuelve será menor o igual al que se pasa como
// parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte más fácil, las repeticiones de números capicúa se conservan; es decir, si en el array x el número 505 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número capicúa en x, se devuelve un array con el número -1 como único elemento.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x []= {12, 24, 1221, 563, 22, 56, 22, 87, 88, 19};

        /*int [] x;
        x = new int [10];
        for (int i = 0; i < x.length; i++) {
            System.out.print("Introduzca el numero "+(i+1)+": ");
            x[i]= teclado.nextInt();
        }*/

        System.out.print(Arrays.toString(filtraCapicuas(x)));

    }
    public static int[] filtraCapicuas(int x[]){
        int [] array;
        array = new int [x.length];
        int cont = 0;

        for (int i = 0; i < x.length; i++) {
            int n = x[i];
            if (n==invertir_num(n)){
                array[cont]=x[i];
                cont++;
            }
        }
        int [] capicua;
        capicua = new int [cont];
        for (int i = 0; i < cont; i++) {
            capicua[i]=array[i];
        }
        return capicua;
    }

    public static int invertir_num(int n){
        int inver=0;
        int aux=n;
        while(n>0){
            inver=inver*10+n%10;
            n=n/10;
        }
        return  inver;
    }
}
