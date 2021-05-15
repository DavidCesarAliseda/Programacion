package u2.T6;

import java.util.Scanner;

public class Ej5 {
    /*Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a continuación muestre un pequeño menú con 3 opciones:
    1.Calcular diámetro
    2.Calcular perímetro
    3.Calcular área
    Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente. (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el radio de la circunferencia: ");
        int radio = teclado.nextInt();

        double pi = Math.PI;
        double diametro = 0;
        double perimetro = 0;
        double area = 0;


        System.out.println("Elija una opción:  ");
        System.out.println(" 1.Calcular diámetro.");
        System.out.println(" 2.Calcular perímetro.");
        System.out.println(" 3.Calcular área.");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1: diametro=2*radio;
                System.out.println("El diámetro es "+diametro+".");
            break;
            case 2: perimetro=2*pi*radio;
                System.out.println("El perimetro es "+perimetro+".");
            break;
            case 3: area=pi*radio*radio;
                System.out.println("El area es "+area+".");
            break;
        }
    }
}
