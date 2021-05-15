package u2.T2;
import java.util.Scanner;

public class Ej5 {
    //Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca la temperatura en grados centigrados: ");
        int gcent = teclado.nextInt();

        System.out.print( "Su temperatura en Fahrenheit es: ");
        System.out.println( (gcent * 9 / 5) + 32 );

    }
}
