package u2.T4;
import java.util.Scanner;

public class Ej2 {
    //Necesitamos una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la media puede contener decimales.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero entero: ");
        double Num1 = teclado.nextDouble();
        System.out.print( "Introduzca el segundo numero entero: ");
        double Num2 = teclado.nextDouble();

        double suma = Num1+Num2;
        double result = suma/2;

        System.out.println("La media entre "+Num1+" y "+Num2+" es "+result+".");


    }


}
