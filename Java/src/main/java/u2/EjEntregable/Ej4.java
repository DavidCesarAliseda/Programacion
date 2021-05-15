package u2.EjEntregable;

import java.util.Scanner;

public class Ej4 {
    /*Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura, que debe ser un número impar mayor o igual que 3.
    La distancia entre cada flecha de asteriscos es siempre de 5 espacios. Si la altura introducida por el usuario no es un número impar mayor o igual que 3,
    el programa debe mostrar un mensaje de error.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura=0;
        while (altura % 2 == 0 || altura < 3) {
            System.out.print("Introduzca la altura de la flecha, siendo un numero impar mayor o igual que 3: ");
            altura = teclado.nextInt();
        }
        for (int i = 0; i<altura/2; i++){
            for (int j = 0; j<=1+(altura-1)/2; j++){
                if(i+j==altura/2){
                    System.out.print("*     *");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

        System.out.println("*     *");

        for (int i = 1; i<=altura; i++){
            for (int j = 0; j<=altura/2; j++){
                if(i-j==3){
                    System.out.print("*     *");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}