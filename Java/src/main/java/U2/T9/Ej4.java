package U2.T9;

import java.util.Scanner;

public class Ej4 {
    //Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String mitad = frase.substring(frase.length() / 2, frase.length() / 2 + 1);
        if(mitad.equals(" ")) {
            System.out.println("El caracter de la posicion central es un espacio. ");
        }else {
            System.out.println("El caracter de la posicion central no es un espacio. ");
        }
    }
}



