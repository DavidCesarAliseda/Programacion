package U5.Entregable2021;

import java.util.Comparator;

public class ComparatorPartEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Participante otro1 = (Participante) o1;
        Participante otro2 = (Participante) o2;

        int resultado;
        if (otro1.getEdad()>otro2.getEdad()){
            resultado=1;
        }else if(otro1.getEdad()<otro2.getEdad()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
