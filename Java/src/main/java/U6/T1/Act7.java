package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
       Act7.mostrar24();





    }
    public static void mostrar24(){
        Scanner teclado = new Scanner(System.in);
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act7//more.txt"));
            int cont = 0;
            String linea = in.readLine();

            while (linea!=null && cont<25){
                cont++;
                System.out.println(linea);
                linea = in.readLine();

                if (cont==24){
                    teclado.nextLine();
                    cont=0;
                }
            }

            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
