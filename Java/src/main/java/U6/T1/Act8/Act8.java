package U6.T1.Act8;

import java.io.*;

public class Act8{
    public static void main(String[] args) {


        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act8//Perso1.txt"));
            BufferedReader in2 = new BufferedReader(new FileReader("Ficheros//U6//T1//Act8//Perso2.txt"));

            BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Act8//Perso.txt"));

            String nombre1 = in.readLine();
            String nombre2 = in2.readLine();

            while (nombre1!=null && nombre2!=null){
                if (nombre1.compareToIgnoreCase(nombre2)<0){
                    out.write(nombre1);
                    out.newLine();
                    nombre1 = in.readLine();
                }else {
                    out.write(nombre2);
                    out.newLine();
                    nombre2 = in.readLine();
                }
            }
            if (nombre1 == null){
                out.write(nombre2);
                out.newLine();
                nombre1=in2.readLine();
            }else{
                out.write(nombre1);
                out.newLine();
                nombre1=in.readLine();
            }
            in.close();
            in2.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
