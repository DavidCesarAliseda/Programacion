package U2.T8;


public class Ej7 {
    //Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void main ( String args[] ){
        int impar = 1;
        int contador = 1;

        while (contador<10){
            impar=impar*contador;
            contador=contador+2;
        }
        System.out.println("El producto de los 10 primeros números impares es "+impar+".");
    }
}
