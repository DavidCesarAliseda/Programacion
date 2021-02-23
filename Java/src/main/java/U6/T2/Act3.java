package U6.T2;

import java.io.*;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) throws IOException {
        writeInt();
        readInt();

    }

    static void writeInt(){
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act3//numint.dat"));
            System.out.println("Introduzca un numero: ");
            int num = teclado.nextInt();
            while(num>=0){
                out.writeInt(num);
                System.out.println("Introduzca un numero: ");
                num = teclado.nextInt();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void readInt() throws IOException {
        ObjectInput in=null;
        try{
            in=new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act3//numint.dat"));
            while (true){
                System.out.println(in.readInt());
            }

        }catch (EOFException ex){
            System.out.println("Fin del fichero");
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
