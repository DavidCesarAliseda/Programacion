package U5.Examen2021;

import java.util.Comparator;

public class ComparatoNumTiendas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Camion otro1 = (Camion) o1;
        Camion otro2 = (Camion) o2;
        return otro1.getNum_tiendas()-otro2.getNum_tiendas();
    }
}
