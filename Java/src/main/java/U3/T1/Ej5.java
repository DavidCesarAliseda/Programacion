package U3.T1;

import java.util.Scanner;

public class Ej5 {
    /*Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer numero: ");
        int n1 = teclado.nextInt();
        System.out.print( "Introduzca el segundo numero: ");
        int n2 = teclado.nextInt();
        System.out.print( "Introduzca el tercer numero: ");
        int n3 = teclado.nextInt();

        System.out.println( "El número mayor es "+mayor (n1, n2, n3));

    }
    public static int mayor (int n1, int n2){
        if(n1<n2){
            return n2;
        }else if (n1>n2){
            return n1;
        }else{
            System.out.print( "Error");
            return 0;
        }
    }
    public static int mayor (int n1, int n2, int n3){
        if(mayor(n1, n2)<n3){
            return n3;
        }else if(mayor(n1, n2)>3){
            return mayor(n1, n2);
        }else{
            System.out.print( "Error");
            return 0;
        }
    }
}
