package U2.T3;
import java.util.Scanner;

public class Ej4 {
    //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km)
    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca la distancia en millas: ");
        float milla = teclado.nextFloat();
        float metro = milla*1609;

        if (milla == 1){
            System.out.println(milla+" milla son "+metro+" metros.");
        }
        else{
            System.out.println(milla+" millas son "+metro+ " metros.");
        }

    }
}
