package U2.T4;
import java.util.Scanner;

public class Ej4 {
    //Sería interesante disponer de un programa que pida como entrada un número decimal y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
    public static void main ( String args[] ){

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el número decimal a redondear: ");
        double Numdecimal = teclado.nextDouble();

        double partedecimal = (Numdecimal%1);
        double numcomparar = partedecimal*10;
        double parteentera = Numdecimal-partedecimal;
        int Num = (int)parteentera + 1;


        if (numcomparar >= 5){
            System.out.println("Al redondear "+Numdecimal+" obtenemos: "+Num+".");

        }
        else{
            System.out.println("Al redondear "+Numdecimal+" obtenemos: "+Num+".");

        }
    }
}
