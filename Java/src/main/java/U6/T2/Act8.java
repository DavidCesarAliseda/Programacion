package U6.T2;

import java.io.*;
import java.util.Arrays;

public class Act8 {
    /*Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor, y guardarlos en un fichero binario. A continuación, recuperarlos y mostrarlos por consola.*/
    public static void main(String[] args) throws IOException {

        int dimension = (int) (Math.random() * 99 + 1);
        int tabla[] = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            tabla[i] = (int) (Math.random() * 99 + 1);
        }
        Act8.writeIntdeArray(tabla);
        Act8.readInt();
    }
    static void writeIntdeArray(int[] array) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act8//enteros.dat"));
            for (int i = 0; i < array.length; i++) {
                out.writeInt(array[i]);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static void readInt() throws IOException {
        ObjectInputStream in= null;
        try{
            in=new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act8//enteros.dat"));
            while (true){
                System.out.println(in.readInt());
            }
        } catch (EOFException ex){
            System.out.println("Fin del fichero");
            in.close();
        }catch (IOException e) {
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
}
