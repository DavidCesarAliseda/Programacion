package U7.U7_Entregable.Cesar_FernandezAliseda_U7_T1;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Unidad implements Serializable {
    private String unidad;
    private List alumnos;

    public Unidad(String unidad) {
        setUnidad(unidad);
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public List getAlumnos() {
        return alumnos;
    }

    public void setAlumnos() {
        this.alumnos = new ArrayList();
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "unidad='" + unidad + '\'' +
                '}';
    }



}
