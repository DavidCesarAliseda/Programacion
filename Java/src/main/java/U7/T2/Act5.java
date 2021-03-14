package U7.T2;

import java.util.ArrayList;
import java.util.List;

public class Act5 {
    /*Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista, fusión de las dos anteriores.
    Desarrollar el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros de entrada se mantengan intactas.*/
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(fusion(l1, l2));
    }
    static List fusion (List l1, List l2){
        List<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);
        return l3;
    }
}
