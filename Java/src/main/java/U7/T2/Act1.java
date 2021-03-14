package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class Act1 {
    /*Actividad 9: Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que pertenezcan, al menos,
     a uno de los dos conjuntos. Su prototipo es:

    Set union (Set conjunto1, Set conjunto2)*/
    public static void main(String[] args) {
        Set<Integer> c1 = new HashSet<>();
        Set<Integer> c2 = new HashSet<>();

        c1.add(1);
        c1.add(2);
        c1.add(3);
        c2.add(4);
        c2.add(5);
        c2.add(6);

        System.out.println(Act1.union(c1, c2));
    }
    static Set union (Set conjunto1, Set conjunto2){
        Set<Integer> c3= new HashSet<>();
        conjunto1.addAll(conjunto2);
        return conjunto1;
    }
}
