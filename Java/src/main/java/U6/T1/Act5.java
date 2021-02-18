package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act5 {
    public static void main(String[] args) {
        int mayor=0;
        int num = 0;
        int menor=0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act5//numero.txt"));
            String linea = in.readLine();
            num=Integer.parseInt(linea);
            mayor=num;
            menor=num;
            while (linea!=null){
                num=Integer.parseInt(linea);
                System.out.println(num);
                if (num>mayor){
                    mayor=num;
                }else if (num<menor){
                    menor=num;
                }
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Mayor: "+mayor+" y menor: "+menor);
    }
}