package U5.Examen2021;

public class PrendaColgada extends Prenda implements Doblar, Colgar{

    private double altura;

    public PrendaColgada(int precio, String nombre, long codigoBarras, double peso, double altura) {
        super(precio, nombre, codigoBarras, peso);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+super.getNombre()+" no se puede doblar");
    }

    @Override
    public void colgar() {
        System.out.println("La prenda "+super.getNombre()+" se debe colgar");
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura=" + altura +
                "} " + super.toString();
    }
}
