package U6.T2;

import java.io.*;
import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) throws IOException {

        Act6.writeDouble();
        ObjectInput in=null;

        try {
            in=new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act6//numdouble.dat"));
            while (true){
                System.out.println(in.readDouble());
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    static void writeDouble(){
        ObjectOutputStream out=null;
        Scanner teclado = new Scanner(System.in);

        try {
            out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act6//numdouble.dat"));
            System.out.println("Introduce un numero decimal");
            double num = teclado.nextDouble();
            while (num!=0){
                out.writeDouble(num);
                System.out.println("Introduce un numero decimal");
                num = teclado.nextDouble();
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
}
