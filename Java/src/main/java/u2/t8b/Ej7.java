package u2.t8b;

import java.util.Scanner;

public class Ej7 {
    //Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número ");
        int num = teclado.nextInt();

        int cantidad = 0;
        int aux = num;
        int contador = 0;
        double resto = 0;
        double numaux = (double)num;
        double nuevo_num = 0;
        double ndigito = 0;

        //Cllcula el numero de digitos del numero introducido.
        while (aux>0){
            aux = aux/10;
            cantidad++;
        }

        for (contador=1; contador<=cantidad; contador++){
            numaux=numaux/10;
            System.out.println(numaux);
            resto=numaux%1;
            System.out.println(resto);
            numaux=numaux-resto;
            System.out.println(numaux);

            System.out.println(ndigito);
            nuevo_num=(nuevo_num+resto)*10;

        }
        System.out.print(Math.round(nuevo_num));









    }
}
