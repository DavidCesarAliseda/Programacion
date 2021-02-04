package U4.Entregable_2021;

import U5.T1.Act9.Lavadora;

import java.util.Comparator;

public class CompararPrecioFinal implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;
        Lavadora l1 = (Lavadora) o1;
        Lavadora l2 = (Lavadora) o2;
        if (l1.getPrecioFinal()>l2.getPrecioFinal()){
            resultado=1;
        }else if (l1.getPrecioFinal()<l2.getPrecioFinal()){
            resultado = -1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
