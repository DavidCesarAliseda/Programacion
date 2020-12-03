package U2.U2_Entrega;

import java.util.Scanner;

public class Ej2 {
    /*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.*/
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print( "Por favor, introduzca un número entero positivo: ");
            long numero = teclado.nextLong();
            long aux = numero;
            long cifra = 0;
            int contador_par = 0;
            int contador_impar = 0;

            while (aux!=0) {
                cifra = aux % 10;
                if (cifra%2 == 0) {
                    contador_par++;
                } else {
                    contador_impar++;
                }
                aux=aux-cifra;
                aux = aux / 10;
            }
            System.out.println("El "+numero+" contiene "+contador_par+" dígitos pares y "+contador_impar+" dígitos impares.");
        }
}
