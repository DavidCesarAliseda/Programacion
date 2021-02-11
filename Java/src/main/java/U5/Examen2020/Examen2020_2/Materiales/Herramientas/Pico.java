package U5.Examen2020.Examen2020_2.Materiales.Herramientas;

import U5.Examen2020.Examen2020_2.Material;
import U5.Examen2020.Examen2020_2.Materiales.Herramienta;

public class Pico extends Herramienta implements Minar {
    private int grosor;

    public Pico(int grosor) {
        super("Pico", 99, 0, 0, true);
        setGrosor(grosor);
    }


    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Pico{" +
                "grosor=" + grosor +
                '}';
    }

    @Override
    public void hacer(Object o) {
        Material m = (Material) o;
        m.setMasa(m.getMasa()+100);
    }

    @Override
    public void deshacer(Object o) {
        Material m = (Material) o;
        m.setMasa(m.getMasa()+100);
    }
}
