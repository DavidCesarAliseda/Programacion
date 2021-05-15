package u2.T3;
import java.util.Scanner;

public class Ej2 {
    //Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca su año de nacimiento: ");
        short anonacimiento = teclado.nextShort();
        System.out.print( "Introduzca el año actual: ");
        short anoactual = teclado.nextShort();

        int dif = anoactual - anonacimiento;

        System.out.println("La diferencia entre "+anoactual+" y "+anonacimiento+" es "+dif+".");

    }
}
