package u2.T2;
import java.util.Scanner;

public class Ej2 {
    //Crea un programa que muestre el resto de dividir dos números prefijados.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: ");
        int primerNum = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: ");
        int segundoNum = teclado.nextInt();

        System.out.print( "Su resto es: ");
        System.out.println( primerNum%segundoNum );
    }
}
