package U3.Entregable_2021_TARDE;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    /*Crea la función filtraPrimos que:

Recibe un array de enteros
Devuelve un array de enteros con todos los primos que se encuentran en el array origen
Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. Si no existe ningún número primo en el vector original,
se devuelve un array con el número -1 como único elemento.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int[] array_inicial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primos;
        primos = new int[10];
        filtraPrimos(array_inicial, primos);
        System.out.println(Arrays.toString(primos));



    }

    public static void filtraPrimos(int[] array_inicial, int[] primos) {
        boolean es_primo = false;
        int x = 0;
        int contador = 0;
        for (int i = 0; i < array_inicial.length; i++) {
            for (int j = 2; j < array_inicial[i]; j++) {
                if (array_inicial[i] % j == 0) {
                    es_primo=false;
                }
                if(es_primo){
                    primos[x]=array_inicial[i];
                    contador++;
            }

            }
        }
    }

}
