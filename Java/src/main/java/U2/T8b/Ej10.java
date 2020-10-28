package U2.T8b;

import java.util.Scanner;

public class Ej10 {
    /*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
    El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura ");
        int altura = sc.nextInt();
        int base = 0;
        int contador_alt = 0;
        int contador_base = 0;
        int fila = 0;
        int columna = 0;

        for (fila = 1; fila <= altura; fila++) {
            for (columna = 1; columna <= altura; columna++) {
                if (columna==1 || columna == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }System.out.println(" ");
        }
        for (columna = 1; columna <= altura; columna++) {
            if (columna==1 || columna == altura) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }


        }
    }
}
