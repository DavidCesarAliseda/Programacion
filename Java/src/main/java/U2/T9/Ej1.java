package U2.T9;
import java.util.Scanner;

public class Ej1 {
    //Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;
        System.out.print("Introduce la palabra ");
        palabra1 = sc.nextLine();
        System.out.print("Introduce la palabra ");
        palabra2 = sc.nextLine();

        char[] palabra1caracter = palabra1.toCharArray();
        char[] palabra2caracter = palabra2.toCharArray();

        int longitud1 = palabra1caracter.length;
        int longitud2 = palabra2caracter.length;

        if (longitud1>longitud2){
            System.out.println("La palabra "+palabra1+" es la mas larga");
        }else{
            System.out.println("La palabra "+palabra2+" es mas larga");
        }
    }
}