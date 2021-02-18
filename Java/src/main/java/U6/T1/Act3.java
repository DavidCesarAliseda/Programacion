package U6.T1;

import java.io.*;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Act3.duplicar_v1();
        Act3.duplicar_v2();






    }

    public static void duplicar_v1(){
        String texto = "";
        //Leer
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act3//original.txt"));
            String linea = in.readLine();
            while (linea!=null){
                texto=linea;
                linea = in.readLine();
                //Escribir
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Act3//copia.txt", true));
                    out.write(texto);
                    out.newLine();
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void duplicar_v2(){
        String texto = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el fichero a copiar: ");
        String fichero = teclado.nextLine();

        //Leer
        try {
            BufferedReader in = new BufferedReader(new FileReader(fichero));
            String linea = in.readLine();
            while (linea!=null){
                texto=linea;
                linea = in.readLine();
                //Escribir
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Act3//copiav2.txt", true));
                    out.write(texto);
                    out.newLine();
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



}
