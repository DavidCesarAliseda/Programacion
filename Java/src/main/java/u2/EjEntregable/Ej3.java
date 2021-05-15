package u2.EjEntregable;

import java.util.Scanner;

public class Ej3 {
    //Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el numero entero positivo: ");
        int n = teclado.nextInt();

        int numero = n;
        int digito = 0;
        double binario = 0;
        int exp = 0;

        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp); //Math.pow devuelve la  base elevada al exponente. Math.pow(base, exponente)
            exp++;
            numero = numero/2;
        }
        System.out.println(n+" en binario es "+(int) binario);



    }


}
