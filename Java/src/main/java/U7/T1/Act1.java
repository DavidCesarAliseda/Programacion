package U7.T1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Act1 {
    /*Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden en
    que se vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla en sentido creciente y volverla
    a mostrar por pantalla.*/
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random()*100));
        }
        System.out.println(lista);

        Collections.sort(lista); /*Metodo de la interfaz Collections*/
        System.out.println(lista);
    }


}
