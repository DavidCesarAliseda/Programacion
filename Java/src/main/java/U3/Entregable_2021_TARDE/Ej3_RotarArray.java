package U3.Entregable_2021_TARDE;

import java.util.Scanner;

public class Ej3_RotarArray {
    /*Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas y N columnas con número aleatorios entre 100 y 200.
        Mostrar dicho array y a continuación rotarlo 90 grados:*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de numeros: ");
        int n = teclado.nextInt();

        int[][] array;
        array = new int[n][n];
        int[][] rotada;
        rotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 101 + 100);////Math.random()*(N-M+1)+M numero entre m y n
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int contfil=0;
        int contcol=0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                rotada[i][j] = array[n - j - 1][ i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotada[i][j] + " ");
            }
            System.out.println();


        }
    }
}


