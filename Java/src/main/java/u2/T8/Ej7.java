package u2.T8;


public class Ej7 {
    //Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void main ( String args[] ){
        int impar = 1;
        int contador = 0;
        int n_impares = 1;

        while (contador<10){
            impar=impar*n_impares;
            n_impares=n_impares+2;
            contador=contador+1;
        }
        System.out.println("El producto de los 10 primeros números impares es "+impar+".");
    }
}
