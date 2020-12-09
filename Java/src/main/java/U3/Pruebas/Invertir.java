package U3.Pruebas;

import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el numero que desea convertir en morse: ");
        int n = teclado.nextInt();
        double numero=n;

        double cifra=0;
        double inverso = 0;

        while(numero>=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }

        System.out.println(inverso);


    }
}
