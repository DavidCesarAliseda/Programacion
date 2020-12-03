package U2.T2;
import java.util.Scanner;

public class Ej3 {
    //Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: ");
        int primerNum = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: ");
        int segundoNum = teclado.nextInt();

        System.out.print( "Su división es: ");
        System.out.println( primerNum/segundoNum );
    }
}
