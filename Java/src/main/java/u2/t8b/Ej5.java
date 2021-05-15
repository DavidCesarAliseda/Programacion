package u2.t8b;

import java.util.Scanner;

public class Ej5 {
    //Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el caracter ");
        String relleno = sc.nextLine();

        int espacios = altura-1;
        int long_linea = 1;
        int planta = 1;

        while (planta <= altura) {

            //Inserta los espacios.
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= long_linea; i++) {
                System.out.print(relleno);
            }

            System.out.println();

            planta++;
            espacios--;
            long_linea += 2;

        }
    }
}
