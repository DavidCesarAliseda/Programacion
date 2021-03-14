package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class Act3 {
    /*Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero, pero no al segundo). Con el prototipo:

Set diferencia (Set conjunto1, Set conjunto2)*/
    public static void main(String[] args) {
        Set<Integer> c1 = new HashSet<>();
        Set<Integer> c2 = new HashSet<>();

        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.add(6);
        c2.add(3);
        c2.add(4);
        c2.add(9);
        c2.add(7);

        System.out.println(diferencia(c1, c2));
    }
    static Set diferencia (Set conjunto1, Set conjunto2){
        conjunto1.removeAll(conjunto2);
        return conjunto1;
    }
}
