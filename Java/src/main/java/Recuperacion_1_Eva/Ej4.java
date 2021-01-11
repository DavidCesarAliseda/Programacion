package Recuperacion_1_Eva;

import java.util.Scanner;

public class Ej4 {
    /*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    A continuación, se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla.
    Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números
    (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int indice []= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int array []= {20, 5, 7, 4, 32, 9, 2, 14, 11, 6};
        int [] array;
        array = new int [10];
        int primos = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca el numero "+(i+1)+": ");
            array[i]= teclado.nextInt();
        }

        System.out.print("Indice: ");
        for (int i = 0; i < indice.length; i++) {
            System.out.print(indice[i]+" ");
        }
        System.out.println();

        System.out.print("Valor:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            if (esPrimo(array[i])){
                primos++;
            }
        }

        int [] Primos;
        Primos = new int [primos];
        int aux=0;

        int [] noPrimos;
        noPrimos = new int [array.length-primos];
        int aux2=0;

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])){
                Primos[aux]=array[i];
                aux++;
            }else{
                noPrimos[aux2]=array[i];
                aux2++;
            }
        }
        int contnoprim=0;

        for (int i = 0; i < array.length; i++) {
            if (i<= Primos.length-1){
                array[i]=Primos[i];
            }else{
                array[i]=noPrimos[contnoprim];
                contnoprim++;
            }
        }
        System.out.println();
        System.out.println();

        System.out.print("Indice: ");
        for (int i = 0; i < indice.length; i++) {
            System.out.print(indice[i]+" ");
        }
        System.out.println();
        System.out.print("Valor:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");


        }
    }
    public static boolean esPrimo (int n){
        boolean esprimo = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                esprimo=false;
                break;
            }
        }
        return esprimo;
    }
    
}
