package U5.Entregable2021;

import java.util.Comparator;

public class ComparatorAltura implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Jugador_Baloncesto otro1 = (Jugador_Baloncesto) o1;
        Jugador_Baloncesto otro2 = (Jugador_Baloncesto) o2;

        int resultado;
        if (otro1.getAltura()>otro2.getAltura()){
            resultado=1;
        }else if(otro1.getAltura()<otro2.getAltura()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
