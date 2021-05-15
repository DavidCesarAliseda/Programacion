package u2.t8b;

import java.util.Scanner;

public class Ej1 {
     /*Caja fuerte con cuatro intentos para abrirla*/

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        //Cierra la caja fuerte con la conbinacion del usuario
        System.out.print("Introduce la conbinación para cerrarla: ");
        int combinacion = teclado.nextInt();
        //Llamada al metodo para abrir la caja
        abrirCajaFuerte(teclado, combinacion);
    }

    //Metodo para intentar abrir la caja fuerte
    private static void abrirCajaFuerte(Scanner teclado, int combinacion) {
        int abrir = 0;
        int numMaximoIntentos = 4;

        //Contador para controlar el numero de intentos de abrir la caja
        for (int contador=1; contador<=numMaximoIntentos; contador++){

            //Usuario introduce la clave
            System.out.print("Introduce la combinación para abrirla: ");
            abrir = teclado.nextInt();

            //Comprobacion de clave
            if (abrir== combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente. ");
                break;
            }
        }
    }
}
