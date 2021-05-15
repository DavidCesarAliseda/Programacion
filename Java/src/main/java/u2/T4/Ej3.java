package u2.T4;
import java.util.Scanner;

public class Ej3 {
    //Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero decimal: ");
        double Num1 = teclado.nextDouble();
        System.out.print( "Introduzca el segundo numero decimal: ");
        double Num2 = teclado.nextDouble();
        System.out.print( "Introduzca el tercero numero decimal: ");
        double Num3 = teclado.nextDouble();

        double mediacondecimal = (Num1+Num2+Num3)/3;
        double partedecimal = mediacondecimal%1;
        double mediaentera = mediacondecimal-partedecimal;
        int resultado = (int)mediaentera;

        System.out.println("La parte entera de la media entre "+Num1+", "+Num2+" y "+Num3+" es "+resultado+".");


    }
}
