package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    /*Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar. Hacer lo mismo con otra serie de 6 enteros.
    A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan ordenados.
    Fusionar significa copiar en el orden correcto para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 6;
        int[] serie1 = new int[n];
        int[] serie2 = new int[n];
        int[] fusion = new int[2*n];

        for (int i = 0; i < serie1.length; i++) {
            System.out.print("Introduzca el valor de "+(i+1)+" de la primera serie: ");
            serie1[i] = teclado.nextInt();
        }
        for (int i = 0; i < serie2.length; i++) {
            System.out.print("Introduzca el valor de "+(i+1)+" de la segunda serie: ");
            serie2[i] = teclado.nextInt();
        }

        Arrays.sort(serie1);
        Arrays.sort(serie2);
        fusion_ordenada_arrays(serie1, serie2, fusion);

        System.out.println("\n");
        System.out.println("La primera serie es "+Arrays.toString(serie1));
        System.out.println("La segunda serie es "+Arrays.toString(serie2));
        System.out.println("El resultado de la fusión es "+Arrays.toString(fusion));

    }
    public static void fusion_ordenada_arrays (int[]serie1, int[]serie2, int[]fusion) {
        int indice1 = 0;
        int indice2 = 0;
        int indicef = 0;

       //Compara cada digito de las arrays y pasa el menor a la fusión
        while (indice1 < serie1.length && indice2 < serie2.length ){
            if (serie1[indice1] < serie2[indice2]){
                fusion[indicef] = serie1[indice1];
                indice1++;
            }else{
                fusion[indicef] = serie2[indice2];
                indice2++;
            }
            indicef++;
        }
         //CUando una de las arrays originales se agote hay que copiar la otra en su totalidad.
        if(indice1== serie1.length){
            while (indice2 < serie2.length){
                fusion[indicef] = serie2[indice2];
                indice2++;
                indicef++;
            }
        }else {
            while (indice1 < serie1.length) {
                fusion[indicef] = serie1[indice1];
                indice1++;
                indicef++;
            }
        }


        /*for (int i = 0; i < fusion.length; i++) {

            if (serie1[indice1] <= serie2[indice2]) {
                fusion[i] = serie1[indice1];
                indice1++;
            } else {
                fusion[i] = serie2[indice2];
                indice2++;
            }
            if (indice1 == serie1.length && indice2 != serie2.length) {
                for (int j = indice1; j < serie2.length; j++) {
                    fusion[i] = serie2[j];
                    i++;
                }
            }
            else if (indice2 == serie2.length && indice1 != serie1.length)  {
                for (int j = 0; j < serie1.length; j++) {
                    fusion[i] = serie1[j];
                    i++;
                }

            }
        }*/
    }
}
