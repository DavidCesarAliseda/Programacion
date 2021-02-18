package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act4 {
    public static void main(String[] args) {
        int numLetras=0;
        int numPalabras=0;
        int numLineas=0;
        String texto="";
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act4//carta.txt"));

            int c = in.read();
            System.out.println((char)c);
            while (c!=-1){
                numLetras++;
                if (c==32){
                    numPalabras++;
                }
                else if (c==10){
                    numLineas++;
                    numPalabras++;
                }
                texto += (char)c;
                c=in.read();
            }

            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Palabras: "+numPalabras);
        System.out.println("Letras: "+numLetras);
        System.out.println("Lineas: "+numLineas);
        System.out.println(texto);

    }
}
