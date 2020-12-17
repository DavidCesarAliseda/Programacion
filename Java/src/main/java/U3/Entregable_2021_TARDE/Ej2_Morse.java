package U3.Entregable_2021_TARDE;

import java.util.Scanner;

public class Ej2_Morse {
 /*Crea una función con la siguiente cabecera:

     public String convierteEnMorse(int n)

     Esta función convierte el número n al sistema Morse y lo devuelve en una
     cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
     Morse. Utiliza esta función en un programa para comprobar que funciona bien.
     Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
     desde el programa principal.

     1 . _ _ _ _ 6 _ . . . .
     2 . . _ _ _ 7 _ _ . . .
     3 . . . _ _ 8 _ _ _ . .
     4 . . . . _ 9 _ _ _ _ .
     5 . . . . . 0 _ _ _ _ _*/

 public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

     System.out.print("Introduzca el numero que desea convertir en morse: ");
     int n = teclado.nextInt();

     System.out.println("EL numero "+n+" en morse es "+convierteEnMorse(n));

     }

    public static String convierteEnMorse(int n) {

        String traduccion= "";
        int n_temp=0;
        String[] morse = {/*0*/"_____", /*1*/". _ _ _ _", /*2*/". . _ _ _", /*3*/". . . _ _", /*4*/"...._",
                          /*5*/".....", /*6*/"_ . . . .", /*7*/" _ _ . . .", /*8*/"_ _ _ . .", /*9*/"_ _ _ _ ."};

        for (int i = n; i > 0; i/=10) {
            System.out.println(i);
            n_temp=i%10; //al ser entre 10 no es necesario pasarlo a entero.
            System.out.println(n_temp);

            traduccion = morse[n_temp] + traduccion;
        }
        return traduccion;
    }
}
