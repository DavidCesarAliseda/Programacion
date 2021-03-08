package U7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Act3 {
    /*Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden decreciente a
    medida que se vayan generando y mostrar la colección por pantalla.*/
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int num = (int) (Math.random() * 10);
        lista.add(num);
        for (int i = 0; i < 19; i++) {
            num = (int) (Math.random() * 10);
            int contador=0;
            Iterator<Integer> it = lista.iterator();
            while (it.hasNext()){
                if (it.next()<=num){
                    lista.add(contador, num);
                }else{
                    lista.add(num);
                }
                contador++;
                break;
            }
        }
        System.out.println(lista);
    }
}
