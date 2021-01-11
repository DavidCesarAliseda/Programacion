package Recuperacion_1_Eva;

import java.util.Scanner;

public class Ej3 {
    /*Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de int ya que el primero admite números más largos. Suponemos que el usuario introduce correctamente los datos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = teclado.nextInt();
        System.out.print("Introduzca la posición dentro del número: ");
        int posicion = teclado.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        int num2 = teclado.nextInt();
        int contador = 0;
        long aux = num;
        long aux2 = 0;
        while (aux>0){
            aux=aux/10;
            contador++;
        }
        aux=num;
        for (int i = 0; i < contador-posicion; i++) {
            aux2=aux2*10+aux%10;
            aux=aux/10;
        }
        aux=aux/10;
        aux=aux*10+num2;
        long aux3 = 0;
        for (int i = 0; i < contador-posicion; i++) {
            aux=aux*10;

            aux3=aux3*10+aux2%10;
            aux2=aux2/10;
        }
        aux=aux+aux3;
        System.out.println("El número resultante es"+aux);
    }
}
