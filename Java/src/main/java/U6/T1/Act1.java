package U6.T1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el nombre de un fichero: ");
        String fichero = teclado.nextLine();
        if (fichero.isEmpty()){
            fichero="Ficheros//U6//T1//Act1//prueba.txt";
        }
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(fichero));
            String linea = in.readLine();
            while (linea!=null){
                texto+=linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);
    }
}
