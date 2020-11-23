package U3.T4;

import java.util.Scanner;

public class Ej4 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la posición del alfil: ");
        String posicion = teclado.nextLine();

        int x = letra_a_numero(posicion);
        int y = Integer.valueOf(posicion.substring(0, 1));



    }
    public static int letra_a_numero (String posicion){
        String letras = "abcdefgh";

        return letras.indexOf(posicion.charAt(0));
    }


}

