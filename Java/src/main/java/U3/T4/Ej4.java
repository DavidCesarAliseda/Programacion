package U3.T4;

import java.util.Scanner;

public class Ej4 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letras = "abcdefgh";
        int max = 8;
        int min = 1;
        String[][] tablero = new String[max +1][max +1]; //bucle 9x9
        //fila 0 y columna 9 no se imprimen
        for (int i = max - 1; i >= min - 1; i--) {
            for (int j = min; j <= max ; j++) {
                tablero[j - 1][i + 1] = letras.charAt(j - 1) + Integer.toString(i + 1);
                System.out.print(tablero[j - 1][i + 1]+ " ");
            }
            System.out.println();
        }

        System.out.print("Introduce la posición del alfil: ");
        String posicion = teclado.nextLine();
        int x = letra_a_numero(posicion);
        int y = Integer.valueOf(posicion.substring(1, 2));

        //bucle1 -c -f
        int aux_x = x-1;
        int aux_y = y-1;

        while (aux_x >= 0 && aux_y >= 0){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x--;
            aux_y--;
        }

        //bucle2 +c -f
        aux_x = x+1;
        aux_y = y-1;

        while (aux_x < max && aux_y >= 0){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x++;
            aux_y--;
        }

        //bucle3 -c +f
        aux_x = x-1;
        aux_y = y+1;

        while (aux_x >= 0 && aux_y <= max){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x--;
            aux_y++;
        }

        //bucle3 +c +f
        aux_x = x+1;
        aux_y = y+1;

        while (aux_x <= max && aux_y <= max){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x++;
            aux_y++;
        }

    }
    public static int letra_a_numero (String posicion){
        String letras = "abcdefgh";

        return letras.indexOf(posicion.charAt(0));
    }


}

