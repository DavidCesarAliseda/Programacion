package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class Act4 {
    /*Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen al segundo y
     false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:

boolean incluido(Set conjunto1, Set conjunto2)*/
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

        System.out.println(incluido(c1, c2));
    }
    static boolean incluido(Set conjunto1, Set conjunto2){
        return conjunto1.containsAll(conjunto2);
    }
}
