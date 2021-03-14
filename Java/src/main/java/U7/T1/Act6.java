package U7.T1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Act6 {
    /*Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección,
    de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer nombre: ");
        String nombre = sc.nextLine();
        LinkedHashSet <String> nombres = new LinkedHashSet<>();
        while (!nombre.equals("fin")){
            nombres.add(nombre);
            System.out.println("Introduzca otro nombre: ");
            nombre = sc.nextLine();
        }
        System.out.println(nombres);
    }
}
