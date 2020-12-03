package U2.T5;
import java.util.Scanner;

public class Ej6 {
    //Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tiempo en segundos: ");
        int tiempo = teclado.nextInt();

        double gravedad = 9.8;
        double velocidad = gravedad*tiempo;


        if(tiempo>=0){
            System.out.println("La velocidad el objeto es: "+velocidad);
        }else{
            System.out.println("Tiempo incorrecto.");
        }

    }
}
