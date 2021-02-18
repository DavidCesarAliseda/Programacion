package U6.T1;

import java.io.*;
import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Para mostrar el libro de firmas.");
        System.out.println("2. Para firmar.");

        System.out.print("  Elija una de las opciones:");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            Act6.mostrar();
        } else if (opcion == 2) {
            Act6.firmar();
        } else {
            System.out.println("Opcion no valida"); }

    }

    public static void mostrar(){
        String texto="";
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act6//librofirma.txt"));
            String linea = in.readLine();
            while (linea!=null){
                texto+=linea+'\n';
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Firmas:");
        System.out.println(texto);
    }

    public static void firmar(){
        Scanner teclado = new Scanner(System.in);
        boolean firmar=true;
        System.out.println("Introduzca su firma: ");
        String nombre=teclado.nextLine();
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Act6//librofirma.txt", true));
            try {
                BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Act6//librofirma.txt"));
                String linea = in.readLine();
                while (linea!=null){
                    if (linea.equals(nombre)){
                        System.out.println("Ya ha firmado.");
                        firmar=false;
                        break;
                    }
                    linea = in.readLine();
                }
                out.write(nombre);
                out.newLine();
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }



            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
