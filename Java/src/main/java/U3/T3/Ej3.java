package U3.T3;

import java.util.Scanner;

public class Ej3 {
    /* Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
    Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos datos desea introducir?: ");
        int n = teclado.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca el dato "+i+": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("La media de los números positivos es "+media_positivos_array(numeros)+".");
        System.out.println("La media de los números negativos es "+media_negativos_array(numeros)+".");
        System.out.println("El numero de ceros que aparecen es "+contador_ceros_array(numeros)+".");

    }

    public static double media_positivos_array(int[] numeros) {
        double suma = 0;
        int contador_positivos=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){
                suma=suma+numeros[i];
                contador_positivos++;
            }
        }
        return suma/contador_positivos;
    }
    public static double media_negativos_array(int[] numeros) {
        double suma = 0;
        int contador_negativos=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                suma=suma+numeros[i];
                contador_negativos++;
            }
        }
        return suma/contador_negativos;
    }
    public  static int contador_ceros_array(int[] numeros) {
        int num_ceros=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0){
                num_ceros++;
            }
        }
        return num_ceros;
    }


}
