package U7._TeoriaMedianteEjercicios;

import java.util.ArrayList;
import java.util.Collections;

public class _03_clase_collections {
  public static void main(String[] args) {
    Cliente c1 = new Cliente("29745987Y", "Chiquito", 8);
    Cliente c2 = new Cliente("75758989Y", "Grandito", 45);
    Cliente c3 = new Cliente("56897742F", "Medianito", 7);
    Cliente c4 = new Cliente("83630305X", "Equisele", 32);
    Cliente c5 = new Cliente("12327845W", "Moi", 47);

    ArrayList<Cliente> lista = new ArrayList<>();
    lista.add(c1);
    lista.add(c2);
    lista.add(c3);

    // Hay una clase Collections que nos brinda una serie de métodos para facilitarnos la vida con
    // las colecciones de todo tipo en general. Son métodos estáticos que trabajan con tipos
    // genéricos.

    // Ordena una lista según el orden de sus elementos o según el comparador que le pasemos
    //Collections.sort(lista);
    //Collections.sort(lista, new OrdenaDescendente());

    // Buscar un elemento mediante búsqueda binaria. OJO! Requiere que el objeto tenga implementada
    // la interfaz Comparable sea implementada de forma genérica. Requiere que laa lista esté
    // ordenada. Devolverá el índice donde se encuentra o si no, un número negativo donde debería
    // estar (si se insertara).
    //Collections.sort(lista);
    //int indice = Collections.binarySearch(lista, new Cliente("75758989Y", null, 0));

    // Intercambia dos nodos en una lista
    Collections.swap(lista, 0, 3);

    // Reemplaza todas las ocurrencias de un nodo determinado por otro
    Collections.replaceAll(lista, c1, c4);

    // Rellenar todos los nodos que tiene una lista con un elemento concreto
    Collections.fill(lista, c5);

    // Copiar una lista en otra
    ArrayList<Cliente> otra_lista = new ArrayList<>();
    Collections.copy(lista, otra_lista);

    // Desordenar elementos (barajar)
    Collections.shuffle(lista);

    // Número de veces que aparece un elemento en la lista
    Collections.frequency(lista, c2);

    // Devuelve el mayor elemento de una colección, basado en el orden natural o bien del comparator
    // que se le pase.
    //Collections.max(lista);
    //Collections.max(lista, new OrdenaDescendente());

    // Invierte la lista
    Collections.reverse(lista);

    // Crear un conjunto a partir de un nodo. Es un conjunto inmutable. Se suele emplear para
    // eliminar un nodo repetido de una lista sin necesidad de usar un bucle
    lista.removeAll(Collections.singleton(new Cliente("29745987Y", null, 0)));
  }
}
