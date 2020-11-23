package U3.T4;

import java.util.Scanner;

public class Ej4 {
    /*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición.
    Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican con las letras de la “a”
     a la “h” y las filas se indican del 1 al 8.*/
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
    public static int caso1 (int x, int y){ //-c,-f

        while (x>0 || y>0){
            x--;
            y--;
            return x;
            return y;
        }

    }
    public static int caso2 (int x, int y){ //-c+f

    }
    public static int caso3 (int x, int y){ //+c,+f

    }
    public static int caso4 (int x, int y){ //+c,-f

    }
}

