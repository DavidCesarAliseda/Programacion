package U5.T2.Act3;

public class Triangulo extends PoligonoRegular implements Comparable{
    private int altura;

    public Triangulo(int lado, Color color) {
        super(lado, color);
        setAltura(altura);
    }

    public Triangulo() {
        super();
        setAltura(10);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return ((lado*altura)/2);
    }

    @Override
    public int compareTo(Object o) {
        Triangulo otro = (Triangulo) o;
        int resultado;
        if (this.getLado()>otro.getLado()){
            resultado=1;
        }else if (this.getLado()<otro.getLado()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", lado=" + lado +
                ", color=" + color +
                '}';
    }
}
