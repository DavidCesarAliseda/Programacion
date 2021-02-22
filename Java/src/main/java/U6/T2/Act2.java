package U6.T2;

import java.io.*;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        readDouble();

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
