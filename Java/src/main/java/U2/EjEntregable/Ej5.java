package U2.EjEntregable;

import java.util.Scanner;

public class Ej5 {
    /*Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
Las vocales abiertas son a, e, o.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print( "Por favor, introduzca un número entero positivo: ");
        String cadena = teclado.nextLine();
        String car;
        int contador = 0;
        String mayus;

        mayus = cadena.toUpperCase();

        for ( int i = 0; i <mayus.length(); i++){
            car = (mayus.substring(i,i+1));

            if (car.equals("A") || car.equals("E") || car.equals("O") || car.equals("H") || car.equals(" ")){
                contador++;
            }
        }
        System.out.println(cadena+" tiene "+contador+" caracteres buscados.");
    }
}
