package U5.T2.Act1;

import java.util.Arrays;

public class PilaTabla implements Pila{
    private int cima;
    private Integer[] pila;
    private int por_defecto=0;
    private int indice = -1;

    public PilaTabla() {
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


    @Override
    public void apilar(int num) {
        if (Llena()){
            pila = Arrays.copyOf(pila, pila.length + 1);
        }
        pila[indice+1]=num;
        indice++;
    }

    @Override
    public void desapilar() {
        if (indice>=0) {
            System.out.println("El dato con indice " + indice + " es el " + pila[indice]);
            indice--;
        }else{
            System.out.println("No hay datos en la pila.");
        }
    }
}
