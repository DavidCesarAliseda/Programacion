package U5.T2.Act3;

import java.util.Comparator;

public class ComparaColorTriangulo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Triangulo t1 = (Triangulo) o1;
        Triangulo t2 = (Triangulo) o2;
        //Obtiene atributo tipo color con el color del triangulo
        //Color c1 = t1.getColor();
        Color c2 = t2.getColor();
        //Optiene cadena con el color del triangulo
        //String color1 = c1.toString();
        String color2 = c2.toString();

        return t1.color.name().compareTo(color2);
    }
}
