package U4.CollectionsLibroJava;

import java.util.*;

public class Ej12_1 {
    /*Crear colección de 20 números aleatorios menores que 100, y guardarlos en el orden en que se vayan generando;
    mostrar por pantalla dicha lista, ordenar en sentido creciente y volver a mostrar*/
    public static void main (String[] args){
        List<Integer> lista = new ArrayList<>();   //Podria haber sido LinkedList
        Integer temp;
        for (int i = 0; i < 20; i++) {
            temp = (int) (Math.random()*100);//Del 0 al 99
            lista.add(temp);
        }

        System.out.println("Lista en orden de inserción: ");
        System.out.println(lista);
        //Orden segun orden natural de Integer
        Collections.sort(lista);
        System.out.println("Lista en orden creciente: ");
        System.out.println(lista);
    }
}
