package U3.T2;

import java.util.Scanner;

public class Ej3 {
    /*Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
    Por ejemplo: "Alvaro Perez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
    El resto de caracteres no se modifican.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba su nombre y apellidos: ");
        String nombre = teclado.nextLine();
        char c;
        String sinvocal = "";

        for(int i = 0; i < nombre.length(); i++){
            c = nombre.charAt(i);
            if (!esVocal(c)){
                sinvocal=sinvocal + c;
            }
        }
        System.out.println(sinvocal);
    }

    static boolean esVocal(char c) {
        boolean resultado;
        String vocales = "aeiou";
        c=Character.toLowerCase(c);

        if(vocales.indexOf(c) == -1) {
            resultado=false;
        }else{
            resultado=true;
        }
        return resultado;
    }
}
