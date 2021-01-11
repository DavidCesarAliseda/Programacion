package Recuperacion_1_Eva;

import java.util.Scanner;

public class Ej2 {
    /*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.

Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.

Ejemplo: Por favor, introduzca la altura de la pecera (como mínimo 4): 4

Ahora introduzca la anchura (como mínimo 4): 7

* * * * * * *
*           *
*       &   *
* * * * * * * */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = teclado.nextInt();

        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = teclado.nextInt();
        int x = 0;
        int y = 0;

        while (x<=1 || x >= anchura){
            x = (int)(Math.random() * (anchura + 2));
        }
        while (y<=1 || y >= altura){
            y = (int)(Math.random() * (altura));
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <=anchura ; j++) {
                if (j==1 || j==anchura || i==1 || i==altura) {
                    System.out.print("*");
                }else if(i==y && j==x){
                    System.out.print("&");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
