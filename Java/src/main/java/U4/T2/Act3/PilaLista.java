package U4.T2.Act3;

import U4.T2.Act1_2.Lista;

/*Repetir el ejercicio anterior para implementar la clase PilaLista, donde, en vez de usar una tabla para almacenar los valores apilados, usamos un objeto de la clase Lista implementada en el ejercicio 1.*/
public class PilaLista {
    private Lista pila;
    private int  cima;

    public PilaLista() {
       pila= new Lista();
       cima=0;
    }

    //Get and set
    public Lista getPila() {
        return pila;
    }

    public void setPila(Lista pila) {
        this.pila = pila;
    }

    //Metodos
    public void apilar(int num){
        pila.insert_final(num);
        cima++;
    }

    public void desapilar(){
        System.out.println("El elemento a desapilar es el "+pila.obtener_elemento(cima)+".");
        pila.eliminar_elemento(cima);
        cima--;
    }

}
