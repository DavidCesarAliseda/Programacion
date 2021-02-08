package U5.T2.Act3;

public class Circulo implements Figura{
    private int radio;

    public Circulo(int radio) {
        setRadio(radio);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return radio*radio*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
