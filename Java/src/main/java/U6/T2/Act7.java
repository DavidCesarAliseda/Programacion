package U6.T2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Act7 {
    /*Escribir por teclado una frase y guardarla en un archivo binario. A continuación, recuperarla del archivo y
    mostrarla por pantalla.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String frase = teclado.nextLine();


    }
    static void writeString(String s){
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act7//frase.dat"));
            out.writeChars(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out!=null){
                try{
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
