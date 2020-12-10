package U3.Examen_2021_GrupoATarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    /*Define la función mezcla con la siguiente cabecera:

public static int[] mezcla(int[] a, int[] b)

Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc. Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.

Ejemplos:

Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }

Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}

Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}

Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] a ={8, 9, 0};
        int[] b ={1, 2, 3, 5};

        System.out.println(Arrays.toString(mezcla(a, b)));

    }
    public static int[] mezcla(int[] a, int[] b){
        int[] c;
        c = new int[a.length+ b.length];
        int conta=0;
        int contb=0;
        int aux_a = a.length;
        int aux_b = b.length;

        for (int i = 0; i < c.length; i++) {
            if (i%2==0 && aux_a>0){
                c[i]=a[conta];
                conta++;
                aux_a--;
            }else{
                c[i]=b[contb];
                contb++;
                aux_b--;
            }
        }
        return c;
    }
}
