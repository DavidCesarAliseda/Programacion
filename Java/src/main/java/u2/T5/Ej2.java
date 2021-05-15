package u2.T5;
import java.util.Scanner;

public class Ej2 {
    //Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.

    public static void main ( String args[] ){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número 12: ");
        int Num = teclado.nextInt();

        if (Num == 12){
            System.out.println("Has introducido el numero 12 correctamente.");
        }
        else {
            System.out.println("No has introducido el numero 12, has introducido el "+Num+".");
        }


    }
}
