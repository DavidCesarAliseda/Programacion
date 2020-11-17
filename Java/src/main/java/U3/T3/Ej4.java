package U3.T3;

import java.util.Scanner;

public class Ej4 {
    /*Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
    La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
    (siendo n la longitud indicada anteriormente por el usuario).
    El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista, para cada dígito,
    si es mayor menor o igual que el correspondiente de la combinación secreta.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos digitos debe tener la clave secreta?: ");
        int n = teclado.nextInt();

        int[] clave = new int[n];
        int[] intento = new int[n];

        //Genera el array con longitud n y contenido aleatorio
        for (int i = 0; i < clave.length; i++) {
            clave[i]=(int)(Math.random()*5+1);
        }
        //Recoge array de longitud n y contenido introducido por el usuario
        for (int i = 0; i < intento.length; i++) {
            System.out.print("Intenta acertarla: ");
            int num = teclado.nextInt();
            intento[i]=num;
        }
        //Compara, y vuelve a pedir otro intento hasta que ambos arrays sean iguales.
        while(!array_es_igual(clave, intento, n)){
            comparador_cada_valor_array(clave, intento);
            for (int i = 0; i < intento.length; i++) {
                System.out.print("Vuelve a intentarlo: ");
                int num = teclado.nextInt();
                intento[i]=num;
            }
        }
        if (array_es_igual(clave, intento, n)){
            System.out.println("Has acertado!! ");
        }
    }
    //Compara cada valor de forma independiente
    public static void comparador_cada_valor_array(int[] clave, int[] intento) {
        int j = 0;

        for (int i = 0; i < intento.length; i++) {
            j=i;
                if (intento[i]<clave[j]){
                    System.out.println(intento[i]+" es menor.");
                }else if (intento[i]>clave[j]){
                    System.out.println(intento[i]+" es mayor.");
                }else{
                    System.out.println(intento[i]+" es igual.");
                }
        }
    }
    //Compara uno a uno el contenido del array, y si las igualdades es igual a la longitud del array devuelve true
    public static boolean array_es_igual(int[] clave, int[] intento, int n) {
        boolean es_igual = false;
        int contador_igualdades = 0;

        for (int i = 0; i < intento.length; i++) {
            int j = i;
            if (intento[i]==clave[j]){
                contador_igualdades++;
            }
        }
        if (contador_igualdades== intento.length){
            es_igual=true;
        }else {
            es_igual=false;
        }
        return es_igual;
    }
}
