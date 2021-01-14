package U4.T1.Act10;

import java.util.Scanner;

public class main {
    /*Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad de segundos. El programa mostrará la hora introducida y la hora resultante de sumar a esa hora, la cantidad de segundos indicada. Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los atributos se controlarán mediante métodos set/get.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Hora: ");
        int valorh = teclado.nextInt();

        System.out.print("Min: ");
        int valorm = teclado.nextInt();

        System.out.print("Sec: ");
        int valors = teclado.nextInt();

        Hora h = new Hora(valorh, valorm, valors);

        System.out.print("Cuantos segundos quiere mostrar: ");
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(h.getHora() + ":" + h.getMin() + ":" + h.getSec());
            h.sumaSegundos();





       /* Hora h = new Hora(0,0,0);
        int valor;

        System.out.print("Hora: ");
        valor = teclado.nextInt();
        h.setHora(valor);

        System.out.print("Min: ");
        valor = teclado.nextInt();
        h.setMin(valor);

        System.out.print("Sec: ");
        valor = teclado.nextInt();
        h.setSec(valor);

        System.out.print("Cuantos segundos quiere mostrar: ");
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(h.getHora()+":"+h.getMin()+":"+h.getSec());
            h.sumaSegundos();
        }*/

            //h.muestraHora();
        }
    }
}
