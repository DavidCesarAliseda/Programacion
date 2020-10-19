package U2.T3;
import java.util.Scanner;

public class Ej1 {
    //Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: ");
        byte primerNum = teclado.nextByte();
        System.out.print( "Introduzca el segundo número: ");
        byte segundoNum = teclado.nextByte();

        System.out.print( "Su suma es: ");
        System.out.println( primerNum+segundoNum );

    }
}
