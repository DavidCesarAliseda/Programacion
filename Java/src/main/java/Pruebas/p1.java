package Pruebas;

import java.util.Scanner;

public class p1 {
/*Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M.
Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error.
 A continuación se muestran algunos ejemplos. La anchura de la figura siempre será de 6 caracteres.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura, siendo un número entero impar mayor o igual que 5: ");
        int altura = sc.nextInt();

        while (altura < 5 || altura % 2 == 0) {
            System.out.print("Introduzca la altura correctamente: ");
            altura = sc.nextInt();
        }
        for (int f = 1; f <= altura; f++) {
            for (int c = 1; c <= 6; c++) {
                    if (c==1 || c == 6 || f==1 || f== altura || f==(altura/2)+1){
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
}
