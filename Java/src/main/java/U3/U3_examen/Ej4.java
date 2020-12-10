package U3.U3_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] a= {6, 2, 5, 0, 1};

        System.out.println("El array "+ Arrays.toString(a)+" convertido en cadena sería "+convierteArrayEnString(a)+".");

    }
    public static String convierteArrayEnString(int[] a){
        String cadena = "";

        for (int i = 0; i < a.length; i++) {
            cadena+= a[i];
        }
        return cadena;
    }
}
