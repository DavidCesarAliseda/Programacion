package U6.T2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: ");
        int entero = teclado.nextInt();
        System.out.println();
        double Decimales[] = new double[entero];
        int cont=0;
        while (cont<entero){
            System.out.print("Introduzca un numero decimal: ");
            Decimales[cont]= teclado.nextDouble();
            cont++;
        }
        System.out.println();
        Act4.writeDouble(Decimales);


    }

    static void writeDouble(double[] d) {
        ObjectOutputStream out = null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act3//arreydouble.dat"));
            out.writeObject(d);
            out.close();
        } catch (IOException e) {
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
