package U3.T3;

import java.util.Scanner;

public class Ej4 {
    /*Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
    La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
    (siendo n la longitud indicada anteriormente por el usuario).
    El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista, para cada dígito,
    si es mayor menor o igual que el correspondiente de la combinación secreta.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos digitos debe tener la clave secreta?: ");
        int n = teclado.nextInt();

        int[] clave = new int[n];

        System.out.println(clave);


    }

    public  static int generador_num_aleatorio(int[] clave){

        return (int)(Math.random()*5+1);

    }


}
