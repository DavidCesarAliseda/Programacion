package U2.T8;

import java.util.Scanner;

public class Ej4 {
    //Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número mayor a 1: ");
        int num = teclado.nextInt();
        int contador = 1;
        while (num !=contador){
            System.out.println(contador);
            contador++;
        }

    }
}
