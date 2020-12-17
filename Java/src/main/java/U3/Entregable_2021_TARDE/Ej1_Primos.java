package U3.Entregable_2021_TARDE;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1_Primos {
    /*Crea la función filtraPrimos que:

Recibe un array de enteros
Devuelve un array de enteros con todos los primos que se encuentran en el array origen
Obviamente el tamaño del array que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. Si no existe ningún número primo en el vector original,
se devuelve un array con el número -1 como único elemento.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array_inicial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primos;
        primos = new int[10];
        int n=0;
        int cont = 0;
        int aux = 0;

        for (int i = 0; i < array_inicial.length; i++) {
            n=array_inicial[i];
            if (es_primo(n)){
                primos[cont] = array_inicial[i];
                cont++;
            }else{
                aux++;
            }
        }
        if(aux==10){
            int[] no_hay_primos = {-1};
        }else {
            primos = Arrays.copyOf(primos, cont);

            System.out.println(Arrays.toString(primos));
        }
    }
    public static boolean es_primo(int n){
        boolean primo = true;

        for (int i = 2; i < n;i++ ){
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
