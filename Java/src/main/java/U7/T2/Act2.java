package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class Act2 {
    /*Hacer lo mismo que en el ejercicio anterior con la intersección , formada por los elementos comunes a los dos conjuntos. Su prototipo es:

     Set interseccion (Set conjunto1, Set conjunto2)*/

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

        System.out.println(Act2.interseccion(c1, c2));
    }
    static Set interseccion (Set conjunto1, Set conjunto2){
        conjunto1.retainAll(conjunto2);
        return conjunto1;
    }
}
