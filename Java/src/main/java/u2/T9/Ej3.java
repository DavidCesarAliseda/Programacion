package u2.T9;

import java.util.Scanner;

public class Ej3 {
    /*En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.*/
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

        int i = adivina.compareTo(contrasena);

        while(!contrasena.equals(adivina)) {

            if (i > 0) {
                System.out.println("Menor.");
                System.out.print("Intenta acertar la contraseña: ");
                adivina = sc.nextLine();
            } else if (i < 0) {
                System.out.println("Mayor.");
                System.out.print("Intenta acertar la contraseña: ");
                adivina = sc.nextLine();
            }

        }System.out.println("Acertaste.");
    }
}
