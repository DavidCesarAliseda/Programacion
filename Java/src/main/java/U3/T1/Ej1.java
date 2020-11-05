package U3.T1;

import java.util.Scanner;

public class Ej1 {
    /*Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero: ");
        int n = teclado.nextInt();
        Eco(n);
    }
    public static void Eco(int n){
        for(int a = 1; a<=n; a++){
            System.out.print( "Eco...\n");
        }
    }
}


