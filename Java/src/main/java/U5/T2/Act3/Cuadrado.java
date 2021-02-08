package U5.T2.Act3;

public class Cuadrado extends PoligonoRegular{


    public Cuadrado(int lado, Color color) {
        super(lado, color);
    }

    public Cuadrado() {
        super();
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color=" + color +
                '}';
    }
}
