package u2.T7;

import java.util.Scanner;

public class Ej2 {
    /*Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:

    - verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
    - falso. En caso contrario.
    escribe el código necesario para inicializar "jasp" en una línea.*/

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la edad: ");
        int edad = teclado.nextInt();
        System.out.print("Introduzca el nivel de estudios: ");
        int nivel_estudios = teclado.nextInt();
        System.out.print("Introduzca los ingresos: ");
        int ingresos = teclado.nextInt();



        boolean jasp;


        jasp = false;
        jasp = ((edad<=28) && (nivel_estudios>3) && (ingresos>28000));

        System.out.println(jasp);





    }
}
