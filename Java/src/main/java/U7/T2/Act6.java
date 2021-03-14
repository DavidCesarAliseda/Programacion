package U7.T2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Act6 {
    /*Implementar la función leeCadena con el siguiente prototipo:

List<Character>leeCadena()

Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.*/
    public static void main(String[] args) {
        System.out.println(leeCadena());
    }
    static List<Character> leeCadena(){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca una frase: ");
        String frase = sc.nextLine();
        char[] aCaracteres = frase.toCharArray();
        List<Character> l1 = new ArrayList<>();
        for (int i = 0; i < aCaracteres.length; i++) {
            l1.add(aCaracteres[i]);
        }

        return l1;
    }
}
