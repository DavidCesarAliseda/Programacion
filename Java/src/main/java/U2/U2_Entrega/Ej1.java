package U2.U2_Entrega;

import java.util.Scanner;

public class Ej1 {
    /*Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error y volverlo a pedir hasta que sea correcto.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura = 0;
        while (altura % 2 == 0 || altura <= 3) {
            System.out.print("Por favor, introduzca la altura del rombo (numero impar mayor de 3): ");
            altura = teclado.nextInt();
        }
        int fila = 0;
        int columna = 0;
        int nespacios = (altura - 1) / 2; //Numero de espacios que hay desde una esquina de la tabla a un vertice, ya sea en horizontal o vertical.

        for (fila = 0; fila < altura ; fila++) {
            for (columna = 0; columna <  nespacios ; columna++) {
                System.out.print(" ");
            }
            for (columna = 0; columna < altura - 2* nespacios; columna++) {
                if (columna==0 || columna== altura-2* nespacios-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (fila < altura/2) {
                nespacios--;    //Mitad superior
            } else {
                nespacios++;    //Mitad inferior
            }
        }
    }
}
