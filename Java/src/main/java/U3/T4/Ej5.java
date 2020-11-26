package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    /*Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300.
    A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas superior izquierda a la esquina inferior derecha, así como el máximo,
     mínimo y la media de los números que hay en esa diagonal.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 10;
        int f = 0;
        int c = 0;
        int n = 0;
        int min = 500;
        int max = 0;
        int total = 0;
        int[][] array;
        array = new int [x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j]=(int)((Math.random()*101+200));//Math.random()*(N-M+1)+M numero entre m y n
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Los números de la diagonal son: ");

        while(f < x && c < x){
            System.out.print(array[f][c]+" ");
            n=array[f][c];
            f++;
            c++;
            if (n<min){
                min=n;
            }if(n>max){
                max=n;
            }
            total=total+n;
        }
        System.out.println();
        System.out.println("El número minimo es "+min+" y el máximo es "+max+".");
        System.out.println("La media es "+total/x+".");

    }


}
