package U5.Entregable2021;

public class Judo extends Deporte{
    private int num_tatamis;

    public Judo(String nombre_dep, String nombre_pab) {
        super(nombre_dep, nombre_pab);
        setNum_tatamis(num_tatamis);
    }


    public int getNum_tatamis() {
        return num_tatamis;
    }

    public void setNum_tatamis(int num_tatamis) {
        this.num_tatamis = num_tatamis;
    }

    @Override
    public String toString() {
        return "Judo{" +
                super.toString()+
                "num_tatamis=" + num_tatamis +
                "} " + super.toString();
    }
}
