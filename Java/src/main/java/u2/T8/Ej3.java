package u2.T8;
import java.util.Scanner;

public class Ej3 {
    /*Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
     El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
     El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1). */
    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        int num_azar = (int) Math.floor(Math.random()*100+1);
        int num=0;
        boolean flag=false;
        System.out.print("¿Que número crees que va a salir entre el 1 y el 100? ");
        /*num = teclado.nextInt();*/

        while (flag == false){
            num = teclado.nextInt();
            if (num>num_azar){
                System.out.print("El número es menor. Prueba otra vez: ");


            }else if (num<num_azar && num != -1){
                System.out.print("El número es mayor. Prueba otra vez: ");

            }else {
                flag=true;   // Tanto acertando como con -1.
            }

        }
        if (num == -1){
            System.out.println("Te has rendido. ");
        }else {
            System.out.println("Has ganado maquina. ");
        }

    }
}
