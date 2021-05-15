package u2.T9;

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

        System.out.println("La longitud de la contraseña es "+contrasena.length());
        System.out.println("La primera letra es "+contrasena.charAt(0));
        System.out.println("La ultima letra es "+contrasena.charAt(contrasena.length()-1));
        System.out.print("Intenta acertar la contraseña: ");
        adivina = sc.nextLine();

        if(contrasena.equals(adivina)) {
            System.out.println("Acertaste");
        }else {
            System.out.println("Fallaste");
        }


    }
}
