package U3.U3_examen;

import java.util.Scanner;

public class Ej2 {
    /*Escribe un programa que pida 20 números enteros.
    Estos números se deben introducir en un array de 4 filas por 5 columnas.
    El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
    La suma total debe aparecer en la esquina inferior derecha.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f = 4;
        int c = 5;
        int[][] array;
        array = new int[f+1][c+1];

        int suma_filas=0;
        int suma_col=0;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Introduzca el número correspondiente a la fila "+(i+1)+" y la columna "+(j+1)+": ");
                int n = teclado.nextInt();
                array[i][j]=n;
            }
        }
        System.out.println();

        //Suma de fila
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                array[i][c]=array[i][c]+array[i][j];
                suma_filas=suma_filas+array[i][j];
            }
        }

        //Suma columnas
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < f; i++) {
                array[f][j]=array[f][j]+array[i][j];
                suma_col=suma_col+array[i][j];
            }
        }

        //Suma de filas y columnas
        array[f][c]=suma_col+suma_filas;

        //Mostrar tabla
        for (int i = 0; i < f+1; i++) {
            for (int j = 0; j < c+1; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
