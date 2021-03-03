package U7;

import java.util.ArrayList;
import java.util.Collections;

public class Act2 {
    /*Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.*/
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random()*100));
        }
        System.out.println(lista);

        lista.sort(Collections.reverseOrder());
        System.out.println(lista);
    }
}
