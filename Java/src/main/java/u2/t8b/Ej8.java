package u2.t8b;

import java.util.Scanner;

public class Ej8 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera hora: ");
        int hora1 = sc.nextInt();
        System.out.print("Introduce el primer dia (1 al 7): ");
        int dia1 = sc.nextInt();
        System.out.print("Introduce la segunda hora: ");
        int hora2 = sc.nextInt();
        System.out.print("Introduce el segundo dia (1 al 7): ");
        int dia2 = sc.nextInt();
        int n_dias = 0;
        int n_horas= 0;
        int hora_inic = 0;
        int hora_fin = 0;
        int hora_total = 0;

        if(hora1<0||hora1>23){
            System.out.println("Has introducido mal la hora.");
        }
        if(hora2<0||hora2>23){
            System.out.println("Has introducido mal la hora.");
        }

        if ( dia2<=7 && dia1>=1 && dia1<dia2 ){
            n_dias=dia2-dia1;
            n_horas=(n_dias-1)*24;
        }
        if(hora1>0 && hora1<23 && hora2>0 && hora2<23){
            hora_inic = 24-hora1;
            hora_fin = hora2;
        }
        hora_total=hora_inic + hora_fin + n_horas;

        System.out.println("Quedan "+(hora_total)+" horas.");

    }
}
