package Pruebas;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int p = sc.nextInt();
        int contador = 0;
        int aux = 0;
        double naux = n;
        double segundaparte = 0;
        double primeraparte = 0;

        for(aux = n; aux>0; contador++){
            aux=aux/10;
        }
        for (aux = contador; aux > p; aux--){
            naux=naux/10;
        }
        segundaparte=naux%1;
        primeraparte=naux-segundaparte;
        for (aux=contador; contador>p; contador--){
            segundaparte=segundaparte*10;
        }
        System.out.println("Los números partidos son el "+(int)primeraparte+" y el "+(int)segundaparte+".");


    }
}
