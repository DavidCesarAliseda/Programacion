package U3.T1;

import java.util.Scanner;

public class Ej3 {
    /*Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
    Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
    Además, hemos de pasarle a la función el radio de la base y la altura.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Elija una opción: ");
        System.out.println( "1. Area.");
        System.out.println( "2. Volumen.");
        int opcion = teclado.nextInt();
        System.out.print( "Introduzca el radio: ");
        int r = teclado.nextInt();
        System.out.print( "Introduzca la altura: ");
        int h = teclado.nextInt();
        System.out.print("\n");
        calculo(opcion, r, h);
    }
    public static void calculo (int opcion, int r, int h){
        if (opcion==1){
            double area=2 * Math.PI * r * (h+r);
            System.out.println("El area es "+area);
        }
        else if (opcion==2){
            double volumen = Math.PI * r*r *h;
            System.out.println("El area es "+volumen);
        }else{
            System.out.println( "Los datos son incorrectos");
        }
    }
}
