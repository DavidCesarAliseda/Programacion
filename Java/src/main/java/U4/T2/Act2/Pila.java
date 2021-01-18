package U4.T2.Act2;

import java.util.Arrays;

public class Pila {
    private int cima;
    private Integer[] pila;
    private int por_defecto=0;
    private int indice = -1;

    public Pila() {
        setCima(0);
        pila = new Integer[por_defecto];
    }

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    //Metodos
    //Apilar
    public void apilar(int num){
        if (Llena()){
            pila = Arrays.copyOf(pila, pila.length + 1);
        }
        pila[indice+1]=num;
        indice++;
    }
    //Desapilar
    public void desapila(){
        indice--;
    }
    //Comprobar si está llena.
    public boolean Llena(){
            return indice == (pila.length-1);
    }
    //Cima
    public void cima(){
        if (indice==-1){
            System.out.println("Aún no se han introducido datos.");
        }else{
            System.out.println("La cima de la pila es: "+pila[indice]+".");
        }
    }

}




