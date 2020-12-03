package U2.T8;

import java.util.Scanner;

public class Ej14 {
    //Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud del lado: ");
        int l = teclado.nextInt(); //l=lado triangulo
        int i = 0;

        while (l>0){
            for (i = 1 ; i<=l ; i++ ){
                System.out.print("*");
            }
            System.out.println();
            l--;
        }
    }
}
