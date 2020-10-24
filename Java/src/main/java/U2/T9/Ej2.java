package U2.T9;

import java.util.Scanner;

public class Ej2 {
    /* Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
     número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;
        String adivina;
        System.out.print("Introduce la contraseña ");
        contrasena = sc.nextLine();

        char[] contrasenacaracter = contrasena.toCharArray();
        int longitud = contrasenacaracter.length;

        System.out.print("La primera letra es "+contrasena.charAt(1));
        System.out.print("La untima letra es "+contrasena.charAt(longitud));
        System.out.print("Hay "+longitud+" letras.");

        System.out.print("Intenta adivinarla");
        adivina = sc.nextLine();

        if(adivina.equals(contrasena)){
            System.out.print("Acertaste");
        }else{
            System.out.print("Fallaste");
        }
    }
}
