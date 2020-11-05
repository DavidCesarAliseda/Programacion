package U3.T1;

import java.util.Scanner;

public class Ej6 {
    /*Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un caracter: ");
        String caracter = teclado.nextLine();
        String mayus;
        mayus = caracter.toUpperCase();
        boolean flag = false;

        if(vocal (caracter, mayus, flag)){
            System.out.println("Es una vocal.");
        }else{
            System.out.println("No es una vocal.");
        }
    }
    public static boolean vocal(String caracter, String mayus, boolean flag) {


        if (mayus.equals("A") || mayus.equals("E") || mayus.equals("I") || mayus.equals("O") || mayus.equals("U")
                || mayus.equals("á") || mayus.equals("é") || mayus.equals("í") || mayus.equals("ó") || mayus.equals("ú")
                /*|| mayus.equals("Á") || mayus.equals("É") || mayus.equals("Í") || mayus.equals("Ó") || mayus.equals("Ú")*/) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}

//https://es.stackoverflow.com/questions/31178/c%C3%B3mo-limpiar-string-de-tildes-en-java
