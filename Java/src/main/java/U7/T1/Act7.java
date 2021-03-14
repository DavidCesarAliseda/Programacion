package U7.T1;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Act7 {
    /*Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por orden alfabético en
    una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer nombre: ");
        String nombre = sc.nextLine();
        TreeSet<String> nombres = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2));
            }
        });
        while (!nombre.equals("fin")){
            nombres.add(nombre);
            System.out.println("Introduzca otro nombre: ");
            nombre = sc.nextLine();
        }
        System.out.println(nombres);
    }
}
