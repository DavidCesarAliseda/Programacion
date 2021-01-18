package U4.T2.Act1_2;

public class main {
    /*Actividad 1: Las listas son estructuras dinámicas de datos, donde se pueden insertar o eliminar elementos de un determinado tipo sin limitación de espacio.
    Implementar la clase Lista correspondiente a una lista de números de la clase Integer. Los números se guardarán en una tabla. Cuando falte espacio para un nuevo elemento, la tabla se redimensionará, incrementando la capacidad de la lista. Entre los métodos de la clase se incluirán:

-Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, y otro al que se le pasa como argumento el tamaño inicial de la tabla.
-Obtener el número de elementos insertados en la lista.
-Insertar un número al final de la lista.
-Insertar un número al principio de la lista.
-Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
-Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
-Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
-Obtener el elemento cuyo índice se pasa como parámetro.
-Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolver -1.
-Representar la lista con una cadena de caracteres.*/
    public static void main(String[] args) {

        Lista l1 = new Lista(2);
        Lista l2 = new Lista(3);
        Lista l3 = new Lista();

        l2.insert_inicio(9);
        l2.insert_final(6);
        l2.insert_posicion(1, 2);
        System.out.println(l2.array_a_cadena());


    }

}
