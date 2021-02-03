package U5.T1.Act7y8;

public class Caja {
    protected double ancho;
    protected double alto;
    protected double fondo;
    protected Unidades u;
    protected Etiqueta etiq;

    //Constructor


    public Caja(double ancho, double alto, double fondo, Unidades u) {
        setAlto(alto);
        setAncho(ancho);
        setFondo(fondo);
        setU(u);

    }

    //Get and Set
    //Etiqueta
    public Etiqueta getEtiq() {
        return etiq;
    }

    public void setEtiq(Etiqueta etiq) {
        this.etiq = etiq;
    }

    //Ancho
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Alto
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Fondo
    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    //Unidad
    public Unidades getU() {
        return u;
    }

    public void setU(Unidades u) {
        this.u = u;
    }

    //Metodos
    //ToString
    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", u=" + u +
                '}';
    }

    //getVolumen
    double getVolumen() {
        double volumen;
        if (u == Unidades.M) {
            volumen = this.alto * this.ancho * this.fondo;

        } else {
            volumen = (this.alto * this.ancho * this.fondo)/100;
        }
        return volumen;
    }

}
