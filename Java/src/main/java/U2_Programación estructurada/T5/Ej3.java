package U2.T5;
import java.util.Scanner;

public class Ej3 {
    //Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int Num = teclado.nextInt();

        int resto = Num%2;

        if(resto==0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }



    }
}
