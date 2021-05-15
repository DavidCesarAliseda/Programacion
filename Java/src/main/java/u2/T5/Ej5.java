package u2.T5;
import java.util.Scanner;

public class Ej5 {
    //Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        int num3 = teclado.nextInt();

        if(num1>num2 && num1>num3){
            System.out.print(num1+" es el mayor de los tres.");
        } else if (num2>num1 && num2>num3){
            System.out.print(num2+" es el mayor de los tres.");
        }else {
            System.out.print(num3+" es el mayor de los tres.");
        }

    }
}
