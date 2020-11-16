package U3.T2;

import java.util.Scanner;

public class Ej2 {
    /*Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = teclado.nextLine();

        int contadorespacios=0;

        for(int i=0; i< frase.length(); i++){
            if (frase.charAt(i)==' '){
                contadorespacios++;
            }
        }
        System.out.println("El numero de espacios en "+frase+" es "+contadorespacios);
    }
}
