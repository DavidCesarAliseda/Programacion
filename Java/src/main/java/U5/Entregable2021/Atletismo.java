package U5.Entregable2021;

public class Atletismo extends Deporte{
    private int num_pruebas;

    public Atletismo(String nombre_dep, String nombre_pab, int num_pruebas) {
        super(nombre_dep, nombre_pab);
        setNum_pruebas(num_pruebas);
    }

    public int getNum_pruebas() {
        return num_pruebas;
    }

    public void setNum_pruebas(int num_pruebas) {
        this.num_pruebas = num_pruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                super.toString()+
                "num_pruebas=" + num_pruebas +
                "} " + super.toString();
    }
}
