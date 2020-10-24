package U2.T8b;

import java.util.Scanner;

public class Ej11 {
    /*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
    Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura ");
        int altura = sc.nextInt();
        int mitad = altura/2+1;
        int aux = 0;
        int ancho = 0;
        int contador = 0;
        if (altura>3 && altura%2!=0){

            while (contador<=altura){
                for(ancho=0; (ancho) <= altura; ancho++){
                    System.out.print(" ");






                }
                System.out.println("*");

            contador++;
            altura=altura-2;
            }


        }else{
            System.out.println("Error. ");
        }



    }

}
