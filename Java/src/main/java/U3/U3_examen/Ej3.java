package U3.U3_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    /*Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array bidimensional.
    Esta capa se extrae en forma de array de una dimensión. La extracción de números comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:

public static int[] corteza(int[][] n)

Por ejemplo, si el array bidimensional a es el que se muestra a continuación:

45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48

El array unidimensional generado por corteza(a) sería el siguiente:

45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] n = {{45, 92, 14, 20, 25, 78}, {35, 72, 24, 45, 42, 60,},{32, 42, 64, 23, 41, 39}, {98, 45, 94, 11, 18, 48}};

        System.out.println(Arrays.toString(corteza(n)));

    }
    public static int[] corteza(int[][] n) {
        int[] a;
        a = new int[0];

        int contc = 0;

        a = Arrays.copyOf(n[0], n[0].length);

        int[] corteza;
        corteza = new int[(2 * a.length) + 2 * (n.length - 2)];

        for (int i = 0; i < n[0].length; i++) {
            corteza[contc]=n[0][i];
            contc++;
        }

        for (int i = 1; i < n.length-1; i++) {
            corteza[contc]=n[i][n[0].length-1];
            contc++;
        }

        for (int i = n[0].length-1; i >= 0; i--) {
            corteza[contc]=n[n.length-1][i];
            contc++;
        }

        for (int i = n.length-2; i >0 ; i--) {
            corteza[contc]=n[i][0];
            contc++;
        }

        return corteza;
    }
}
