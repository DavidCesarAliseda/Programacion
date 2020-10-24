package U2.T8b;

import java.util.Scanner;

public class Ej9 {
    /*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
    El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.*/
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura ");
        int altura = sc.nextInt();
        int base = (altura/2+1);
        int contador_alt = 0;
        int contador_base = 0;

        for(contador_alt=1; contador_alt<=altura-1; contador_alt++){
            System.out.println("*");
        }
        for(contador_base=1; contador_base<=base; contador_base++){
            System.out.print("*");
        }





    }
}
