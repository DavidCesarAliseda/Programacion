package u2.T8;

import java.util.Scanner;

public class Ej12 {
    /*Pedir 5 calificaciones de alumnos.
    El programa debe decir, al final, si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.*/
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int nota = 0;
        int suspenso = 0;

        for (num = 1; num <= 5; num++) {
            System.out.print("Introduce la nota: ");
            nota = teclado.nextInt();
            if (nota < 5){
                suspenso=1;

            }
        }
        System.out.print("\n");
        switch(suspenso){
            case 0:System.out.println("No hay ningún suspenso."); break;
            case 1:System.out.println("Hay al menos un suspenso."); break;
        }

    }
}
