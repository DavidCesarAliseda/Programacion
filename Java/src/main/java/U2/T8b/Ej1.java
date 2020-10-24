package U2.T8b;

import java.util.Scanner;

public class Ej1 {
     /*Caja fuerte con cuatro intentos para abrirla*/

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la conbinación para cerrarla: ");
        int combinacion = teclado.nextInt();
        int abrir = 0;
        int contador = 0;

        for (contador=1; contador<=4; contador++){
            System.out.print("Introduce la combinación para abrirla: ");
            abrir = teclado.nextInt();

            if (abrir==combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente. ");
                contador=5;

            }


        }


    }

}
