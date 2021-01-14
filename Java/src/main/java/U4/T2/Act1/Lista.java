package U4.T2.Act1;

import java.util.Arrays;

class Lista {
    private int elementos;
    private Integer[] tabla;


    //Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números,
    // y otro al que se le pasa como argumento el tamaño inicial de la tabla.
    public Lista() {
        setElementos(0);
        tabla = new Integer[10];
    }

    public Lista(int tamanio_inicial) {
        setElementos(0);
        tabla = new Integer[tamanio_inicial];
    }

    //Get y Set
//Elementos
    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    //Tabla
    public Integer[] getTabla() {
        return tabla;
    }

    public void setTabla(Integer[] tabla) {
        this.tabla = tabla;
    }

    //Metodos
    //Num elementos
    public void mostrar_numelementos() {
        System.out.println("En la lista hay " + elementos + ".");
    }

    //Insertar final
    public void insert_final(int num) {
        if (Llena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        tabla[elementos] = num;
        elementos++;
    }

    //Insertar principio
    public void insert_inicio(int num) {
        if (Llena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        for (int i = elementos; i >= 1; i--) {
            tabla[i] = tabla[i - 1];//Desplaza los elementos hacia el final
        }
        tabla[0] = num;
        elementos++;
    }

    //Insertar posicion
    public void insert_posicion(int num, int posicion) {
        if (Llena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        for (int i = elementos; i >= posicion - 1; i--) {
            tabla[i] = tabla[i - 1];//Desplaza los elementos hacia el final
        }
        tabla[posicion - 1] = num;
        elementos = tabla.length;
    }

    //¿Cabe el dato?
    boolean Llena() {
        return elementos == tabla.length;
    }

    //Convertir array en cadena
    public String array_a_cadena() {
        String cadena = "";
        for (int i = 0; i < elementos; i++) {
            if (i < elementos - 1) {
                cadena = cadena + tabla[i] + ", ";
            } else {
                cadena = cadena + tabla[i] + ". ";
            }
        }
        return cadena;
    }

    //Fusionar listas
    public void fusionar_tablas_alfinal(Lista otraLista) {
        while (tabla.length < elementos + otraLista.elementos) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }

        for (int i = 0, j = elementos; i < otraLista.elementos; i++, j++) {
            tabla[j] = otraLista.tabla[i];
        }
        elementos = tabla.length;
    }

    //Eliminar elemento
    public void eliminar_elemento(int posicion) {
        tabla[posicion - 1] = null;
    }

    //Obtener elemento
    public Integer obtener_elemento(int posicion) {
        return tabla[posicion - 1];
    }

    //Buscar elemento
    int buscar_elemento(Integer num) {
        int indice = -1;
        for (int i = 0; i < elementos; i++) {
            if (tabla[i].equals(num)) {
                indice = i;
                break;
            }

        }
        return indice;
    }
}

