package U5.T2.Act2;

import java.util.Comparator;

public class ComparadorNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((Cliente) o1).getNombre()).compareTo((((Cliente) o2).getNombre()));
    }
}
