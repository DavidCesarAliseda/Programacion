package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] mesas =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] nmesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n=0;
        boolean hay_sitio = false;
        int mesa_vacia = 0;

        do{
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            n = teclado.nextInt();
            if(n>4) {
                System.out.println("Lo siento, no admitimos grupos de " + n + ", haga grupos de 4 personas como máximo e intente de nuevo.");

            }
            else if(n>0 && n<5) {

                for (int i = 0; i < mesas.length; i++) { //Revisa si existe alguna mesa libre.
                    if (mesas[i] == 0) {
                        hay_sitio = true;
                        mesa_vacia=i;
                        break;
                    } else {
                        hay_sitio = false;
                    }
                }
                if (hay_sitio==true){
                    mesas[mesa_vacia]=n;
                    System.out.println("Por favor, siéntense en la mesa número " + (mesa_vacia + 1) + ".");
                    System.out.println(Arrays.toString(nmesas));
                    System.out.println(Arrays.toString(mesas));
                    System.out.println();
                }else{
                    //BUsca hueco en las mesas ocupadas.
                    int hueco = 0;
                    boolean hay_hueco=false;
                    for (int i = 0; i < mesas.length; i++){
                        if(n<=(4-mesas[i])){
                            hueco=i;
                            hay_hueco=true;
                            break;
                        }
                    }
                    if (hay_hueco){
                        mesas[hueco]=mesas[hueco] + n;
                        System.out.println("Tendrán que compratir mesa, Sientense en la mesa "+(hueco+1)+".");
                        System.out.println(Arrays.toString(nmesas));
                        System.out.println(Arrays.toString(mesas));
                        System.out.println();

                    }else {
                        System.out.println("Lo siento, no quedan mesas libres.");
                        System.out.println(Arrays.toString(nmesas));
                        System.out.println(Arrays.toString(mesas));
                        System.out.println();

                    }
                }
            }
            else if (n == -1){
                System.out.println("Gracias, hasta pronto. ");
            }else{
                System.out.println("Ese número de personas no es válido.");
                System.out.println();
            }
        }while(n!=-1);




        /*

        do{
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            n = teclado.nextInt();
            if(n>4){
                System.out.println("Lo siento, no admitimos grupos de "+n+", haga grupos de 4 personas como máximo e intente de nuevo.");
            }else if (n == -1){
                System.out.println("Gracias, hasta pronto. ");
            }else if(n>0 && n<5){
                for (int i = 0; i < 10; i++) {
                    if(n<=mesas[i] && mesas[i]==4){
                        mesas[i]=mesas[i]-n;
                        nmesa=i;
                        System.out.println("Sientense en la mesa "+(i+1)+".");
                        break;
                    }else if(n<=mesas[i] && mesas[i]!=4){
                        mesas[i]=mesas[i]-n;
                        nmesa=i;
                        System.out.println("Tendrán que compratir mesa, Sientense en la mesa "+(i+1)+".");
                        break;
                    }else if(n>mesas[i]){
                        System.out.println("Lo siento, no quedan mesas libres.");
                    }
                }
            }else{
                System.out.println("Ese número de personas no es valido.");

            }

        }while(n!=-1);*/




    }

}
