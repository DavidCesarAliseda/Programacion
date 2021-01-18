//Rehacer
package U4.T2.Act1_2;

import java.util.Arrays;

public class Lista {
    private int indice;
    private Integer[] tabla;
    private final int por_defecto = 10;


    //Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números,
    // y otro al que se le pasa como argumento el tamaño inicial de la tabla.
    public Lista() {
        setIndice(-1);
        tabla = new Integer[por_defecto];
    }

    public Lista(int tamanio_inicial) {
        setIndice(-1);
        tabla = new Integer[tamanio_inicial];
    }

    //Get y Set
//Elementos
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
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
        System.out.println("En la lista hay " + (indice) + " elementos.");
    }

    //Insertar final
    public void insert_final(int num) {
        if (Llena()){
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        indice++;
        tabla[indice]=num;
    }

    //Insertar principio
    public void insert_inicio(int num) {
        if (Llena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        for (int i = indice; i >= 0; i--) {
            tabla[i] = tabla[i - 1];//Desplaza los elementos hacia el final
        }
        indice++;
        tabla[0]=num;


    }

    //Insertar posicion
    public void insert_posicion(int num, int posicion) {
        if (Llena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        for (int i = indice; i >= posicion-1; i--) {
            tabla[i] = tabla[i-1];//Desplaza los elementos hacia el final
        }
        indice++;
        tabla[posicion-1]=num;

    }

    //¿Cabe el dato?
    boolean Llena() {
        return indice == tabla.length-1;
    }

    //Convertir array en cadena
    public String array_a_cadena() {
        String cadena = "";
        for (int i = 0; i <= indice; i++) {
            if (i < indice - 1) {
                cadena = cadena + tabla[i] + ", ";
            } else {
                cadena = cadena + tabla[i] + ". ";
            }
        }
        return cadena;
    }

    //Fusionar listas
    public void fusionar_tablas_alfinal(Lista otraLista) {

    }

    //Eliminar elemento
    public void eliminar_elemento(int posicion) {
        for (int i = posicion-1; i < tabla.length-1; i++) {
            tabla[i]=tabla[i+1];
        }
        indice--;
        /*tabla[posicion - 1] = null;*/
    }

    //Obtener elemento
    public Integer obtener_elemento(int posicion) {
        return tabla[posicion - 1];
    }

    //Buscar elemento
    int buscar_elemento(Integer num) {
        int indic = -1;
        for (int i = 0; i <= this.indice; i++) {
            if (tabla[i].equals(num)) {
                indic = i;
                break;
            }

        }
        return indic;
    }
}

