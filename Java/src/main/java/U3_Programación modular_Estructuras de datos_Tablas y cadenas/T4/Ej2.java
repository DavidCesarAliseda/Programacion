package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    /*Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras correspondientes a colores se deben almacenar alcomienzo y
    las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el programa deben estar enotro array y son
    los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 8;
        String[] colores = {"verde", "rojo", "azul", "amrillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] array;
        array = new String[x];
        String[] ordenada;
        ordenada = new String[x];
        int contord = 0;


        for (int i = 0; i < x; i++) {
            System.out.print("Introduce una palabra: ");
            String palabra = teclado.nextLine();
            array[i] = palabra;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (array[i].equals(colores[j])) {
                    ordenada[contord] = array[i];
                    contord++;
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            boolean es_color = false;
            for (int j = 0; j < colores.length; j++) {
                if(array[i].equals(colores[j])){
                    es_color = true;
                    break;
                }
            }
            if(!es_color){
                ordenada[contord++]=array[i];
            }
        }
        System.out.print(Arrays.toString(ordenada));
    }
}