package U3.Entregable_2021_TARDE;

import java.util.Scanner;

public class Ej2 {
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
     double numero=n;

     String[] morse = {/*0*/"_____", /*1*/". _ _ _ _", /*2*/". . _ _ _", /*3*/". . . _ _", /*5*/"...._",
                       /*6*/"_ . . . .", /*7*/" _ _ . . .", /*8*/"_ _ _ . .", /*9*/"_ _ _ _ ."};


     System.out.print(convierteEnMorse(numero, morse));
     
     
     
     
     
     
 }
    public static double invertir_num(double numero){
        double cifra=0;
        double inverso = 0;
        while(numero>=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }

    public static int cont_digitos(double numero){
        int cont=0;
        double aux = numero;
        while(aux>0){
            numero=aux/10;
            cont++;
        }
        return  cont;
    }

    public static String convierteEnMorse(double numero, String[] morse) {
        numero = invertir_num(numero);
        String traduccion= "";

        double cifra = 0;

        while (numero >= 0) {

            numero = numero / 10;
            cifra = numero%1;

            for (int i = 0; i < morse.length; i++) {
                if (i==cifra){
                    traduccion=traduccion + morse[i];
                }
            }
            numero=numero - cifra/10;

        }
        return traduccion;
    }



        
}
