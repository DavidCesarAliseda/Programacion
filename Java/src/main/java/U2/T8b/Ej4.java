package U2.T8b;

import java.util.Scanner;

public class Ej4 {
    //Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int contador=0;
        int npositivos=0;
        int nnegativos=0;

        for (contador=1; contador <= 10; contador++){
            System.out.print("Introduce un número ");
            int num = teclado.nextInt();
            if (num>0){
                npositivos++;
            }else if(num<0){
                nnegativos++;
            }
        }
        System.out.print("Hay "+npositivos+" numeros positivos y "+nnegativos+" negativos.");

    }

}
