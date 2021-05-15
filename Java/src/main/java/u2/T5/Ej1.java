package u2.T5;
import java.util.Scanner;

public class Ej1 {
    //Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero para saber si es positivo o negativo: ");
        int Num = teclado.nextInt();

        if (Num >= 0){
            if (Num == 0){
                System.out.print("El 0 no tiene signo.");
            }
            else {
                System.out.print("El "+Num+ " es un número positivo.");

            }
        }
        else{
            System.out.print("El "+Num+" es un número negativo.");
        }
    }
}
