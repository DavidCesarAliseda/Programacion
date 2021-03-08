package U7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Act5 {
    /*Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por orden decreciente a
    medida que se vayan generando, y mostrar la colección por pantalla.*/
    public static void main(String[] args) {
        TreeSet<Integer> coleccion = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        });
        for (int i = 0; i < 20; i++) {
            coleccion.add((int)(Math.random()*100));
        }
        System.out.println(coleccion);
    }
}
