package U3.T4;

import java.util.Scanner;

public class Ej6 {
    /*Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
    A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.

    NOTA IMPORTANTE: Los números no pueden repetirse.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c = 10;
        int f = 6;
        int n = 0;
        int min = 1000;
        int max = 0;
        int[][] array;
        boolean se_repite = false;
        array = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = (int) ((Math.random() * 1001));//Math.random()*(N-M+1)+M numero entre m y n
                //Que no se repita
                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < j; l++) {
                        if(array[i][j]==array[k][l]){
                            se_repite = true;
                            break;
                        }else{
                            se_repite = false;
                        }
                        break;
                    }
                    if(se_repite==true){
                        j--;
                    }else{
                        break;
                    }
                }
                //Localiza el minimo y el maximo.
                n = array[i][j];
                if (n < min) {
                    min = n;
                }
                if (n > max) {
                    max = n;
                }
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El número minimo es " + min + " y el máximo es " + max + ".");
    }
}
