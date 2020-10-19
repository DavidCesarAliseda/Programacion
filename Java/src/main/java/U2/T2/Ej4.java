package U2.T2;
import java.util.Scanner;

public class Ej4 {
    //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca la distancia en millas: ");
        int milla = teclado.nextInt();
        int metro = milla*1609;

        //If para hacer diferencia entre milla y millaS
        if (milla == 1){
            System.out.println(milla+" milla son "+metro+" metros.");
        }
        else{
            System.out.println(milla+" millas son "+metro+ " metros.");
        }

    }
}
