package Pruebas;

import java.util.Scanner;

public class p9 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean no_primo = false;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        double media = 0;

        int n=0;
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        do {

            n = teclado.nextInt();

           for(int i = n-1; i>=2; i--){
               if (n%i==0){
                   no_primo = true;
                   break;
               }
            }
            if(no_primo == true){
                contador++;
                if(n>mayor){
                    mayor=n;
                }if(n<menor || menor ==0) {
                    menor = n;
                }
                media=media+n;
                no_primo=false;
            }else {
                no_primo=true;
            }

        }while (no_primo==false);
        System.out.println("Has introducido "+contador+" numeros");
        System.out.println("Maximo "+mayor);
        System.out.println("Minimo "+menor);
        System.out.println("La media es "+(media/contador));

    }
}


