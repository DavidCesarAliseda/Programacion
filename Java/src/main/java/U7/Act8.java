package U7;

import java.awt.*;
import java.awt.List;
import java.util.*;

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
    }
    List eliminaRepetidos (List c){
        Set<String> conj_nombre=new HashSet<String>((Collection<? extends String>) c);
        return c;
    }
}
