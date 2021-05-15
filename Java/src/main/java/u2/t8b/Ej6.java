package u2.t8b;

import java.util.Scanner;

public class Ej6 {
    //Lo mismo que el 5 pero la pirámide hueca.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String relleno;
        System.out.print("Introduce el caracter ");
        relleno = sc.nextLine();

        System.out.print("Por favor, introduzca la altura de la pirámide: \n");
        int altura = sc.nextInt();

        int espacios = altura - 1;
        int long_linea = 1;
        int planta = 1;

        while (planta <= altura) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for (int i = 1; i <= long_linea; i++) {
                if ((i == 1) || (i == long_linea)) {
                    System.out.print(relleno);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            planta++;
            espacios--;
            long_linea += 2;
        }
    }
}


