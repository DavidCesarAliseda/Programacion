package U2.T8b;

import java.util.Scanner;

public class Ej11 {
    /*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
    Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int altura=0;
        int fila = 0;int columna = 0;
        do {
            System.out.println("Introduzca la altura: ");
            altura = sc.nextInt();
            if (altura%2==0 || altura <=3){
                System.out.println("Error, la altura debe ser impar y mayor que 3. ");
            }
        }while (altura%2==0 || altura <=3);

        for (fila=1; fila<=altura; fila++){
            for (columna=1; columna<=altura; columna++){
                if(fila == columna || fila + columna == altura + 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println(" ");
        }

    }

}
