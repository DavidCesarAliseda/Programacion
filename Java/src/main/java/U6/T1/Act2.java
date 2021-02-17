package U6.T1;

import java.io.*;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduzca su edad: ");
        int edad = teclado.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Act2//datos.txt"));
            out.write("Nombre: "+nombre);
            out.newLine();
            out.write("Edad: "+edad);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
