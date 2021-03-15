package U7.T2.Act7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
/*Definir una clase ListaOrdenada, que hereda de LinkedList, que permita la inserción ordenada. Codificar un método que inserte un nuevo elemento con el prototipo:

void insertarOrdenado( E elemento)*/
public class ListaOrdenada<E> extends LinkedList<E> {

    public Comparator<E> comparator;

    public ListaOrdenada(Comparator<E> comparator) {
        super();
        this.comparator = comparator;
    }
    void insertarOrdenado( E elemento){
        int indice=0;
        if (size()==0){
            add(elemento);
        }else {
            Iterator<E> it = this.iterator();
            while (indice<size() && comparator.compare(elemento, it.next())>0){
                indice++;
            }
            add(indice, elemento);
        }
    }
}
