package u2.U2_Examen;

import java.util.Scanner;

public class Ej3 {
/*Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.*/

    static public void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        double n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        double n2 = sc.nextInt();
        int contador1=0;
        int contador2=0;
        double resto1 = 0;
        double resto2 = 0;
        double par=0;
        double impar=0;


        //Cuantos digitos tiene cada número
        for(int aux = (int)n1; aux>0; contador1++){
            aux=aux/10;
        }


        for (int aux = 1; aux<=contador1; aux++){
            n1=n1/10;
            resto1=n1 % 1;
            n1=n1-resto1;

            n2=n2/10;
            resto2=n2 % 1;
            n2=n2-resto2;


            if (resto1%2==0){
                par=(par+resto1)*10;
            }else if (resto2%2==0){
                par=(par+resto2)*10;
            }else if (resto1%2!=0){
                impar=(impar+resto1)*10;
            }else if (resto2%2!=0) {
                impar=(impar+resto2)*10;
            }
        }

        System.out.println("El número formado por los dígitos pares es : "+(int)par);
        System.out.println("El número formado por los dígitos impares es : "+(int)impar);






    }
}
