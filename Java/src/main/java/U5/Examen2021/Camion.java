package U5.Examen2021;

public abstract class Camion {

    private int matricula;
    private int cargaMax;
    private Conductor conductor;
    private int num_tiendas;

    public Camion(int matricula, int cargaMax, Conductor conductor, int num_tiendas) {
        setMatricula(matricula);
        setCargaMax(cargaMax);
        setConductor(conductor);
        setNum_tiendas(num_tiendas);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getNum_tiendas() {
        return num_tiendas;
    }

    public void setNum_tiendas(int num_tiendas) {
        this.num_tiendas = num_tiendas;
    }

    //Metodos
    public abstract void descargar();

    @Override
    public String toString() {
        return "Camion{" +
                "matricula=" + matricula +
                ", cargaMax=" + cargaMax +
                ", conductor=" + conductor +
                ", num_tiendas=" + num_tiendas +
                '}';
    }
}
