package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    /*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada clase está compuesta por 5 alumnos.
    Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero.
    Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos (que se lee por teclado).
    (Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los alumnos).*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 5; //alumnos
        int y = 3; //nº trimestre

        int notas[][];
        notas = new int [x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Introduce la nota del alumno numero "+(j+1)+" del trimestre "+(i+1)+":");
                notas[j][i] = teclado.nextInt();
            }
        }


        /*System.out.print("Introduce las notas del primer trimestre. ");
        for (int i = 0; i < x; i++) {
            System.out.print("Nota numero "+(i+1)+":");
            notas[i][1] = teclado.nextInt();
        }
        System.out.print("Introduce las notas del segundo trimestre. ");
        for (int i = 0; i < x; i++) {
            System.out.print("Nota numero "+(i+1)+":");
            notas[i][2] = teclado.nextInt();
        }
        System.out.print("Introduce las notas del tercer trimestre. ");
        for (int i = 0; i < x; i++) {
            System.out.print("Nota numero "+(i+1)+":");
            notas[i][3] = teclado.nextInt();
        }*/

    }
}
