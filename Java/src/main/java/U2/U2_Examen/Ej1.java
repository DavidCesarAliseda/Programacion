package U2.U2_Examen;

import java.util.Scanner;

public class Ej1 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de filas: ");
        int n = sc.nextInt();
        int altura = 1;

        for(int f=1; f<=n; f++){
            for(int c=1; c<=n+(n-1);c++){

                if(c==n){
                    System.out.print(f);
                }
            }System.out.println();
        }
    }
}
