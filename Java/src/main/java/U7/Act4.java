package U7;

import java.util.ArrayList;
import java.util.Scanner;

public class Act4 {
    /*Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
    Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que
    estén repetidas. A continuación, mostrar las que no lo estén.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = teclado.nextLine();

        ArrayList <String> lista_palabras = new ArrayList<>();
        frase.split(frase);
        System.out.println(frase);
    }
}
