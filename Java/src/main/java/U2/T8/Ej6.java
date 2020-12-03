package U2.T8;

import java.util.Scanner;

public class Ej6 {
    //Escribir todos los múltiplos de 7 menores que 100.
    public static void main ( String args[] ){

        int contador=1;
        do{
            System.out.println(7*contador);
            contador++;

        }while (contador*7 < 100);

        //for (contador=1; contador*7<100; contador++) lo mismo pero con for

    }
}
