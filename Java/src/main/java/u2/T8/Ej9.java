package u2.T8;

import java.util.Scanner;

public class Ej9 {
    /* Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
    Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
    Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0. */
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        int altura_aux=0;
        int contador=0;


        while (altura != -1 ) {
            System.out.print("Introduce la altura del arbol: ");
            altura = teclado.nextInt();


            if (altura>altura_aux){      //Si la nueva entrada es mayor a la guardada la guarda.
                altura_aux = altura;
                contador++;
            }else {
                altura_aux = altura_aux; //si la nueva entrada es menor no la guarda.
                contador++;
            }
        }
        System.out.print("El arbol mas alto es el numero "+(contador-1)+" con "+altura_aux+" cm."); //resta -1 al contador ya que al introducir el -1 para parar la ejecucion tambien lo cuenta como arbol.





    }
}
