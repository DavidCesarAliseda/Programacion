package U3.T1;

import java.util.Scanner;

public class Ej11 {
    /*Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo. Realizar una versión iterativa y otra recursiva.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        double a = teclado.nextInt();
        System.out.print("Introduzca el exponente: ");
        int n = teclado.nextInt();

        System.out.println(a+" elevado a "+n+" es "+exponencial(a, n));
        System.out.println(a+" elevado a "+n+" es "+exp_iterativa(a, n));

    }

    public static double exponencial(double a, int n){
        double resultado=a;

        for (int aux = 1; aux<n; aux++){
            resultado=resultado*a;
        }
        return resultado;
    }
    public static double exp_iterativa(double a, int n){
        double resultado=a;
        int contador=1;
        if (contador < n) {
            resultado = a * exp_iterativa(a, n - 1);
            contador++;
        }
        return resultado;
    }

}
