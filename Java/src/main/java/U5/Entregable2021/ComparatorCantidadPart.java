package U5.Entregable2021;

import java.util.Comparator;

public class ComparatorCantidadPart implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Pais otro1 = (Pais) o1;
        Pais otro = (Pais) o2;
        int resultado;
        if (otro1.getNum_part()>otro.getNum_part()){
            resultado=-1;
        }else if(otro1.getNum_part()<otro.getNum_part()){
            resultado=1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
