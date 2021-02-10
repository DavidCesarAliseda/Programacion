package U5.Examen2020_2.Examen2020;

import java.util.Comparator;

public class ComparaCapQuemarse implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Material m1 = (Material) o1;
        Material m2 = (Material) o2;
        int resultado;
        if (m1.getCapQuemarse()>m2.getCapQuemarse()){
            resultado=1;
        }else if(m1.getCapQuemarse()<m2.getCapQuemarse()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;

    }
}
