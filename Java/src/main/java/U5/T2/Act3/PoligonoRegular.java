package U5.T2.Act3;

public class PoligonoRegular implements Figura{

    protected int lado;
    public Color color;
    protected static int contadorPoligonos=0;

    public PoligonoRegular(int lado, Color color) {
        setLado(lado);
        setColor(color);
       contadorPoligonos++;
    }

    public PoligonoRegular() {
        setLado(10);
        setColor(Color.AZUL);
        contadorPoligonos++;
    }

    //Get and Set
    //Lado
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    //COlor
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "PoligonoRegular{" +
                "lado=" + lado +
                ", color=" + color +
                ", contadorPoligonos=" + contadorPoligonos+
                '}';
    }
}
