package U2.T8b;

import java.util.Scanner;

public class Piramide {
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = teclado.nextInt();

        //System.out.print("Introduzca el carácter de relleno: ");
        /*String relleno = System.console().readLine();*/

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;
        //int i = 0;

        while (planta <= alturaIntroducida) {

            // inserta espacios
            for ( int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for ( int i = 1; i <= longitudDeLinea; i++) {
                if ((i == 1) || (i == longitudDeLinea)) {
                    System.out.print("X");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
