package U7.T1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Act8 {
    /*Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos
    (sin modificar la original), con el prototipo: List eliminaRepetidos (List c)*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer nombre: ");
        String nombre = sc.nextLine();

        ArrayList<String> nombres = new ArrayList<>();
        while (!nombre.equals("fin")){
            nombres.add(nombre);
            System.out.println("Introduzca otro nombre: ");
            nombre = sc.nextLine();
        }
        System.out.println(Act8.eliminaRepetidos(nombres));
    }
    static List eliminaRepetidos (List c){
        HashSet<String> conj_nombre=new HashSet<>(c);
        c.clear();
        c.addAll(conj_nombre);
        return c;
    }
}
