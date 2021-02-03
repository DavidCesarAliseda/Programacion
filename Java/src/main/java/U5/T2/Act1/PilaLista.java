package U5.T2.Act1;

import U4.T2.Act1_2.Lista;

public class PilaLista implements Pila{
    private Lista pila;
    private int cima;

    public PilaLista() {
        pila = new Lista();
        cima = 0;
    }

    //Get and set
    public Lista getPila() {
        return pila;
    }

    public void setPila(Lista pila) {
        this.pila = pila;
    }

    @Override
    public void apilar(int num) {
        pila.insert_final(num);
        cima++;
    }

    @Override
    public void desapilar() {
        System.out.println("El elemento a desapilar es el "+pila.obtener_elemento(cima)+".");
        pila.eliminar_elemento(cima);
        cima--;
    }

    //Metodos

}
