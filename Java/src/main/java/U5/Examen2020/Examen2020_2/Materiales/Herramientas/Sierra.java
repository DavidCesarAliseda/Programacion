package U5.Examen2020.Examen2020_2.Materiales.Herramientas;

import U5.Examen2020.Examen2020_2.Materiales.Herramienta;

public class Sierra extends Herramienta {

    private double diametro;

    public Sierra(double diametro) {
        super("Sierra", 99, 0, 0, true);
        setDiametro(diametro);
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Sierra{" +
                "diametro=" + diametro +
                '}';
    }
}
