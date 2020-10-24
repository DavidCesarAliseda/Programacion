package U2.T8b;

import java.util.Scanner;

public class Ej8 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer dia ");
        int num = sc.nextInt();
        System.out.print("Introduce el segundo dia ");
        int num2 = sc.nextInt();
        int n_dias = 0;
        int n_horas= 0;

        if ( num2<=7 && num>=1 && num<num2 ){
            n_dias=num2-num;
            n_horas=n_dias*24;
            System.out.println("Entre el dia "+num+" y el dia "+num2+" hay "+n_horas+" horas.");
        }else {
            System.out.println("Has introducido mal los datos.");
        }
    }
}
