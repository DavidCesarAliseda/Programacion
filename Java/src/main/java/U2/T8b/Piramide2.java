package U2.T8b;

import java.util.Scanner;

public class Piramide2 {
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = teclado.nextInt();

        //System.out.print("Introduzca el carácter de relleno: ");
        /*String relleno = System.console().readLine();*/

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;

        while (planta <= alturaIntroducida) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print("X");
            }

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
