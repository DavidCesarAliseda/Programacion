package U3.T3;

import java.util.Arrays;

public class Ej6 {
    /* Implementar una función sinRepetidos() con el prototipo:

int[] sinRepetidos(int t[])

que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.*/
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 9, 6, 5, 6, 7, 1, 5};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sinRepetidos(a)));

    }
    public static int[] sinRepetidos (int[] a) {
        int cont = 0;

        Arrays.sort(a);

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i+1]) {
                a[i]=0;
                cont++;
            }
        }
        Arrays.sort(a);
        int[] b = Arrays.copyOfRange(a, cont, a.length);
        return b;
    }
}
//Otra solución seria copiar el digito si no está repetido en el array resultado, para dimensionar el array hacer una copia sobre el mismo.
