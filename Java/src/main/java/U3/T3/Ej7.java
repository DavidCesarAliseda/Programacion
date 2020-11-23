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
        int y = 3; // nº trimestre

        int notas[][];
        notas = new int [y][x];


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Introduce la nota del alumno numero "+(j+1)+" del trimestre "+(i+1)+":");
                notas[i][j] = teclado.nextInt();
            }
        }
        media_curso(notas, x, y);

        System.out.println("¿De que alumno quiere saber la media?");
        int n = teclado.nextInt();
        media_alumno(notas, x, y, n);
    }
    public static void media_curso (int[][] notas, int x, int y) {
        int suma = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i==0){
                    suma=suma + notas[i][j];
                }
                if (i==1){
                    suma=suma + notas[i][j];
                }
                if (i==2){
                    suma=suma + notas[i][j];
                }
            }
            System.out.println("La media del trimestre "+(i+1)+" es "+suma/x);
            suma = 0;
        }
    }
    public static void media_alumno (int[][] notas, int x, int y, int n){
        int suma = 0;

        for (int i = 0; i < y; i++) {
            suma = suma + notas[i][n-1];
        }
        System.out.println("La media del alumno "+n+" es "+(double)suma/y);
    }
}
