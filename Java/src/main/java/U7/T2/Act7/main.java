package U7.T2.Act7;

public class main {
    public static void main(String[] args) {
        ListaOrdenada l1 = new ListaOrdenada(new EnteroCreciente());
        l1.insertarOrdenado(9);
        System.out.println(l1);
        l1.insertarOrdenado(15);
        System.out.println(l1);
        l1.insertarOrdenado(8);
        System.out.println(l1);
        l1.insertarOrdenado(11);
        System.out.println(l1);
        System.out.println();
        ListaOrdenada l2 = new ListaOrdenada(new EnteroDecreciente());
        l2.insertarOrdenado(9);
        System.out.println(l2);
        l2.insertarOrdenado(15);
        System.out.println(l2);
        l2.insertarOrdenado(8);
        System.out.println(l2);
        l2.insertarOrdenado(11);
        System.out.println(l2);
    }
}
