package u2.T6;

import java.util.Scanner;

public class Ej1 {
    //Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número del mes: ");
        int num_mes = teclado.nextInt();

        switch (num_mes){
            case 1: System.out.println("El mes "+num_mes+" corresponde a Enero."); break;
            case 2: System.out.println("El mes "+num_mes+" corresponde a Febrero."); break;
            case 3: System.out.println("El mes "+num_mes+" corresponde a Marzo."); break;
            case 4: System.out.println("El mes "+num_mes+" corresponde a Abril."); break;
            case 5: System.out.println("El mes "+num_mes+" corresponde a Mayo."); break;
            case 6: System.out.println("El mes "+num_mes+" corresponde a Junio."); break;
            case 7: System.out.println("El mes "+num_mes+" corresponde a Julio."); break;
            case 8: System.out.println("El mes "+num_mes+" corresponde a Agosto."); break;
            case 9: System.out.println("El mes "+num_mes+" corresponde a Septiembre."); break;
            case 10: System.out.println("El mes "+num_mes+" corresponde a Octubre."); break;
            case 11: System.out.println("El mes "+num_mes+" corresponde a Noviembre."); break;
            case 12: System.out.println("El mes "+num_mes+" corresponde a Diciembre."); break;
        }
    }
}
