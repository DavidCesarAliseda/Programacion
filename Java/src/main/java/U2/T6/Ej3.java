package U2.T6;

import java.util.Scanner;

public class Ej3 {
    //Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int num = teclado.nextInt();

        int resto = num%2;
        int variable1=0;
        int variable2=0;

        if(resto==0){
            variable1=1;
        } else {
            variable1=0;
        }

        System.out.println(variable1);

        variable2 = (resto==0)?1:0;
        System.out.println(variable2);


    }
}
