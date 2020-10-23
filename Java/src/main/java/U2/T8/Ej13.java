package U2.T8;

import java.util.Scanner;

public class Ej13 {
    //Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int nota;
        int condicionado = 0;
        int aprobado = 0;
        int suspenso = 0;

        for (num = 1; num <= 6; num++) {
            System.out.print("Introduce la nota ");
            nota = teclado.nextInt();
            if (nota==4){
                condicionado++;
            }else if (nota>=5){
                aprobado++;
            }else {
                suspenso++;
            }

        }
        System.out.println("El número de condicionados es "+condicionado+".");
        System.out.println("El número de aprobados es "+aprobado+".");
        System.out.println("El número de suspensos es "+suspenso+".");


    }
}
