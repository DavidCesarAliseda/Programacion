package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    /*Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
    A continuaciónel programa mostrará el array y preguntará si el usuario quiere destacar elmáximo o el mínimo.
    Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 100;
        int max = 0;
        int min = 500;
        int aux=0;
        int[] array;
        array = new int [x];
        int[] min_max;
        min_max = new int [2];

        generadorrnd_comprobador(x, array, max, min, min_max);
        for (int i = 0; i < x; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int opcion = teclado.nextInt();
        System.out.println();
        if (opcion==1){
            for (int i = 0; i < x; i++) {
                if(array[i]==min_max[0]){
                    System.out.print("**"+min_max[0]+"** ");
                }else{
                    System.out.print(array[i]+" ");
                }
            }
        }else{
            for (int i = 0; i < x; i++) {
                if (array[i] == min_max[1]) {
                    System.out.print("**" + min_max[1] + "** ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }

    }
    public static void generadorrnd_comprobador (int x, int[] array, int max, int min, int[] min_max){
        int n = 0;


        for (int i = 0; i < x; i++) {
            array[i]=(int)(Math.random()*501);  //Al poner 501 el maximo será 500
            n = array[i];
            if (n<min){
                min=n;
            }if(n>max){
                max=n;
            }
        }
        min_max[0]=min;
        min_max[1]=max;

    }
    /*public static void min_max (int x, int[] array, int max, int min, int opcion, int aux, String total){

        for (int i = 0; i < x; i++) {
            if (opcion==1){
                aux=min;
                for (int j = 0; j < x; j++) {
                    if(array[j]==min){
                        insertar(x, array, max, min, opcion, aux, total);
                        array[j]= total;
                    }
                }
            }
        }

    }*/
    /*public static void insertar (int x, int[] array, int max, int min, int opcion, int aux, String total) {
        String destacar = "****";

        String p_izq = destacar.substring(0,2);
        String p_derecha = destacar.substring(2);

        total =  p_izq + aux +p_derecha;
    }*/
}
