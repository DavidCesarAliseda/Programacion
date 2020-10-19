package U2.T3;
import java.util.Scanner;

public class Ej3 {
    //Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero: ");
        double primerNum = teclado.nextFloat();
        System.out.print( "Introduzca el segundo numero: ");
        double segundoNum = teclado.nextFloat();

        double resul= primerNum/segundoNum;

        System.out.println("La división entre "+primerNum+" y "+segundoNum+" es "+resul+".");




    }
}
