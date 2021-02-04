package U5.T2.Act2;

import java.util.Comparator;

public class ComparadorEdad implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;

        if (c1.getEdad()>c2.getEdad()){
            resultado=1;
        }else if (c2.getEdad()>c1.getEdad()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
