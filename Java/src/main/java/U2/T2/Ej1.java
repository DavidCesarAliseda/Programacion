package U2.T2;
import java.util.Scanner;

public class Ej1 {
    //Crea un programa en Java que escriba en pantalla el producto de dos números prefijados.

    public static void main( String args[] ) {

       Scanner teclado = new Scanner(System.in);
       System.out.print( "Introduzca el primer número: ");
       int primerNum = teclado.nextInt();
       System.out.print( "Introduzca el segundo número: ");
       int segundoNum = teclado.nextInt();

       System.out.print( "Su producto es: ");
       System.out.println( primerNum*segundoNum );

    }

}
