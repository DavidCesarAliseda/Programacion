package U2.T7;

import java.util.Scanner;

public class Ej3 {
    //Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la función Math.random(). Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        int codigoAscii = (int)Math.floor(Math.random()*(122-97)+97); /*En cao de que el aleatorio fuera 0 seria *25+97 lo que daria 97 siendo a*/
        char letra = (char)codigoAscii;
        System.out.print(letra);

    }
}
