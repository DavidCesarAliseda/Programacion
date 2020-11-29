package U3.T4;

import java.util.Scanner;

public class Ej4_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letras = "abcdefgh";
        int max = 8;
        int min = 1;
        String[][] tablero = new String[max][max]; //bucle 8x8
        for (int i = max-1; i >= min-1; i--) {//Se resta uno pq en el array va de 0 a 7
            for (int j = min-1; j < max; j++) {//Se resta uno pq en el array va de 0 a 7
                String posicion= letras.charAt(j)+Integer.toString(i+1);//Es i+1 pq la columna es el valor del array+1
                tablero[j][i]=posicion;
                System.out.print(tablero[j][i] + " ");
            }
            System.out.println();
        }
        System.out.print("Introduce la posicion del alfil: ");
        String posicion= teclado.nextLine();
        int x = letra_a_numero(posicion);
        int y = Integer.parseInt(posicion.substring(1,2))-1;

        System.out.println(tablero[x][y] + " ");


        //bucle1 -c -f
        int aux_x = x-1;
        int aux_y = y-1;

        while (aux_x >= 0 && aux_y >= 0){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x--;
            aux_y--;
        }
        System.out.println();

        //bucle2 +c -f
        aux_x = x+1;
        aux_y = y-1;

        while (aux_x < max && aux_y >= 0){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x++;
            aux_y--;
        }
        System.out.println();

        //bucle3 -c +f
        aux_x = x-1;
        aux_y = y+1;

        while (aux_x >= 0 && aux_y < max){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x--;
            aux_y++;
        }
        System.out.println();

        //bucle3 +c +f
        aux_x = x+1;
        aux_y = y+1;

        while (aux_x < max && aux_y < max){
            System.out.print(tablero[aux_x][aux_y]+ " ");
            aux_x++;
            aux_y++;
        }
        System.out.println();
    }
    public static int letra_a_numero (String posicion){
        String letras = "abcdefgh";

        return letras.indexOf(posicion.charAt(0));
    }
}
