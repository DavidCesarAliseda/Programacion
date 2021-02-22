package U6.T2;

import java.io.*;
import java.util.Arrays;

public class Act5 {
    public static void main(String[] args) throws IOException {
        double tabla[] = new double[0];
        ObjectInput in=null;
        try {
            in=new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act3//arreydouble.dat"));
            tabla= (double[]) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
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
        System.out.println(Arrays.toString(tabla));
    }
}
