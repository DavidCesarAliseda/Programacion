package U3.Entregable_2021_TARDE;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número de filas y columnas: ");
        int n = teclado.nextInt();

        int[][] array;
        array = new int[n][n];
        String equis = "X";
        String guion = "-";
        int f = 0;
        int c = 0;
        String[][] buscaminas;
        buscaminas = new String[n][n];
        int contbomba = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int)(Math.random()*2);////Math.random()*(N-M+1)+M numero entre m y n
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    buscaminas[i][j] = equis;
                } else {
                    buscaminas[i][j] = guion;
                }
            }
        }



        do {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(buscaminas[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.print("Introduzca la fila donde cree que está la bomba:  ");
            f = teclado.nextInt();
            System.out.print("Introduzca la columna donde cree que está la bomba:  ");
            c = teclado.nextInt();
            f=f-1;
            c=c-1;

            if(f!=0 && f!=n && c!=0 && c!=n) {

                //Caso1
                if(buscaminas[f - 1][c + 1].equals(equis)){
                    System.out.println("1");
                    contbomba++;
                }
                //Caso2
                if(buscaminas[f - 1][c].equals(equis)){
                    System.out.println("2");
                    contbomba++;
                }
                //Caso3
                if(buscaminas[f - 1][c+1].equals(equis)){
                    System.out.println("3");
                    contbomba++;
                }
                //Caso4
                if(buscaminas[f][c-1].equals(equis)){
                    System.out.println("4");
                    contbomba++;
                }
                //Caso5
                if(buscaminas[f][c+1].equals(equis)){
                    System.out.println("5");
                    contbomba++;
                }
                //Caso6
                if(buscaminas[f+1][c-1].equals(equis)){
                    System.out.println("6");
                    contbomba++;
                }
                //Caso7
                if(buscaminas[f+1][c].equals(equis)){
                    System.out.println("7");
                    contbomba++;
                }
                //Caso8
                if(buscaminas[f+1][c+1].equals(equis)){
                    System.out.println("8");
                    contbomba++;
                }
            }

            if(f==1){
                //Caso4
                if(buscaminas[f][c-1].equals(equis)){
                    System.out.println("4");
                    contbomba++;
                }
                //Caso5
                if(buscaminas[f][c+1].equals(equis)){
                    System.out.println("5");
                    contbomba++;
                }
                //Caso6
                if(buscaminas[f+1][c-1].equals(equis)){
                    System.out.println("6");
                    contbomba++;
                }
                //Caso7
                if(buscaminas[f+1][c].equals(equis)){
                    System.out.println("7");
                    contbomba++;
                }
                //Caso8
                if(buscaminas[f+1][c+1].equals(equis)){
                    System.out.println("8");
                    contbomba++;
                }
            }

            if(f==n) {
                //Caso1
                if (buscaminas[f - 1][c + 1].equals(equis)) {
                    System.out.println("1");
                    contbomba++;
                }
                //Caso2
                if (buscaminas[f - 1][c].equals(equis)) {
                    System.out.println("2");
                    contbomba++;
                }
                //Caso3
                if (buscaminas[f - 1][c + 1].equals(equis)) {
                    System.out.println("3");
                    contbomba++;
                }
                //Caso4
                if (buscaminas[f][c - 1].equals(equis)) {
                    System.out.println("4");
                    contbomba++;
                }
                //Caso5
                if (buscaminas[f][c + 1].equals(equis)) {
                    System.out.println("5");
                    contbomba++;
                }
            }
                if (c==1) {

                    //Caso2
                    if (buscaminas[f - 1][c].equals(equis)) {
                        System.out.println("2");
                        contbomba++;
                    }
                    //Caso3
                    if (buscaminas[f - 1][c + 1].equals(equis)) {
                        System.out.println("3");
                        contbomba++;
                    }

                    //Caso5
                    if (buscaminas[f][c + 1].equals(equis)) {
                        System.out.println("5");
                        contbomba++;
                    }
                    //Caso7
                    if (buscaminas[f + 1][c].equals(equis)) {
                        System.out.println("7");
                        contbomba++;
                    }
                    //Caso8
                    if (buscaminas[f + 1][c + 1].equals(equis)) {
                        System.out.println("8");
                        contbomba++;
                    }
                }
                if (c==n){
                    //Caso1
                    if(buscaminas[f - 1][c + 1].equals(equis)){
                        System.out.println("1");
                        contbomba++;
                    }
                    //Caso2
                    if(buscaminas[f - 1][c].equals(equis)){
                        System.out.println("2");
                        contbomba++;
                    }
                    //Caso4
                    if(buscaminas[f][c-1].equals(equis)){
                        System.out.println("4");
                        contbomba++;
                    }
                    //Caso6
                    if(buscaminas[f+1][c-1].equals(equis)){
                        System.out.println("6");
                        contbomba++;
                    }
                    //Caso7
                    if(buscaminas[f+1][c].equals(equis)){
                        System.out.println("7");
                        contbomba++;
                    }
                }
            if(!buscaminas[f][c].equals(equis)){

                System.out.println("La posición "+f+1+","+c+1+" tiene "+contbomba+" bombas en los alrededores.");
                System.out.println();
            }


        }while(!buscaminas[f][c].equals(equis));
        System.out.println("Has encontrado la bomba, has muerto.");
    }
}
