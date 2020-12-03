package U2.T8;

import java.util.Scanner;

public class Ej11 {
    //Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
    public static void main ( String args[] ) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        int i = 1;

        for (num = 1; num <= 10; num++) {
            for (i = 1; i <= 10; i++) {
                System.out.print((num * i) + "\n");
                if (i==10){
                    System.out.print("\n");
                }
            }
        }



        /*while(num<11){
            if(i>10){
                num++;
                i=i-10;
                System.out.print("\n");

            }else{

            }
            System.out.print((num*i)+"\n");
            i++;
        }*/




        /*do{
            if(i>10){
                num++;
                i=i-10;
                System.out.print("\n");
            }else{

            }
            System.out.print((num*i)+"\n");
            i++;

        }while(num<10);*/

    }

}
