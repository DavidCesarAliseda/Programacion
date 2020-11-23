package U3.T3;

import java.util.Arrays;

public class Ej8 {
    /* Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [n,m] debe contener n+m.
    Después, se debe mostrar su contenido.*/
    public static void main(String[] args) {
        int y = 5;
        int x = 5;
        int array[][];
        array = new int [y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j]=i+j;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
