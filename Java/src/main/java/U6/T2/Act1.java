package U6.T2;

import java.io.*;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        double num = teclado.nextDouble();
        Act1.writeDouble(num);


    }
    static void writeDouble(double d){
        ObjectOutputStream out=null;
        try {
             out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act1//numdouble.dat"));
            out.writeDouble(d);
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

    static void readDouble(){
        ObjectInput in=null;
        double num=0;
        try{
            in=new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act1//numdouble.dat"));
            num=in.readDouble();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(num);
    }
}
