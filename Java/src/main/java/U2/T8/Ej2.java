package U2.T8;

import java.util.Scanner;

public class Ej2 {
    /*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
    Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las edades,
    la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.*/

    public static void main ( String args[] ){
        Scanner teclado = new Scanner(System.in);

        int edad;
        int numero_alumnos = 0;
        int suma = 0;
        int mayor_de_edad=0;
        int media;

        do {
            System.out.print("Introduce la edad del alumno: ");
            edad = teclado.nextInt();

            if (edad>0){
                numero_alumnos++;
                suma = suma+edad;
            }
            if (edad>18){
                mayor_de_edad++;
            }
        }while (edad>0);

        media = suma/(numero_alumnos);

        System.out.println("La suma de las edades es "+suma+".");
        System.out.println("El número de alumnos es "+numero_alumnos+".");
        System.out.println("La media de edad es "+media+".");
        System.out.println("El número de alumnos mayores de edad es "+mayor_de_edad+".");
        }
}
