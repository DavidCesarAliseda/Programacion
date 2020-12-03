package U2.U2_Entrega;

import java.util.Scanner;

public class Ej3 {
    /*Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print( "Por favor, introduce un número entero positivo: ");
        String numero = teclado.nextLine();
        System.out.print( "Introduzca la posición donde quiere insertar: ");
        int posicion = teclado.nextInt();
        teclado.nextLine();
        System.out.print( "Introduzca el dígito que quiere insertar: ");
        String digito = teclado.nextLine();

        String p_izq = numero.substring(0,posicion-1);
        String p_derecha = numero.substring(posicion-1) ; //Divide la frase en dos, en la posicion indicada.

        String total =  p_izq + digito +p_derecha;

        System.out.println("El número resultante es "+total);
    }
}

