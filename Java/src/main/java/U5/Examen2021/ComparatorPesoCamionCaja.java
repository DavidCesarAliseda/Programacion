package U5.Examen2021;

import java.util.Comparator;

public class ComparatorPesoCamionCaja implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        CamionCajas otro1 = (CamionCajas) o1;
        CamionCajas otro2 = (CamionCajas) o2;

        return otro1.getCargaMax()-otro2.getCargaMax();
    }
}
