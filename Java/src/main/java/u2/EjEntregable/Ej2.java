package u2.EjEntregable;

import java.util.Scanner;

public class Ej2 {
    /*Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se leen igual hacia delante y hacia atrás.
    El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno.
    Se recomienda usar long en lugar de int ya que el primero admite números más largos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print( "Introduzca el numero enteropositivo a verificar ");
        long numero = teclado.nextLong();

        int aux = (int) numero;
        int cifra = 0;
        long inverso = 0;

        while (aux!=0){                          //invierte el numero.
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(numero == inverso){
            System.out.println("El "+numero+" es capicua.");
        }else{
            System.out.println("El "+numero+" no es capicua.");
        }
    }
}
