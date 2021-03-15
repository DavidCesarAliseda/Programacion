package U7.T2.Act7;

import java.util.Comparator;

public class EnteroDecreciente implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int n1=(int) o1;
        int n2=(int) o2;
        return -(n1-n2);
    }
}
