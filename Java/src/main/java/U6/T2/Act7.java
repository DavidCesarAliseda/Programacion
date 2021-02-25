package U6.T2;

import java.io.*;
import java.util.Scanner;

public class Act7 {
    /*Escribir por teclado una frase y guardarla en un archivo binario. A continuación, recuperarla del archivo y
    mostrarla por pantalla.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String frase = teclado.nextLine();
        Act7.writeString(frase);
        Act7.readString();

    }
    static void writeString(String s){
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act7//frase.dat"));
            out.writeUTF(s);
          //out.writeObject
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

    static void readString(){
        ObjectInputStream in = null;
        String frase="";
        try {
            in= new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act7//frase.dat"));
            frase=in.readUTF();
            //(String) in.readObject()
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try{
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println( frase);
    }
}
