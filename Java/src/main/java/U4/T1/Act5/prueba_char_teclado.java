package U4.T1.Act5;

import java.util.Scanner;

public class prueba_char_teclado {
    private static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un texto: ");
        String txt = teclado.nextLine();
        System.out.println(txt);

        System.out.print( "Introduzca un char: ");
        char caract = teclado.next().charAt(0);

        txt = txt+caract;
        System.out.println(txt);

    }
}
