package U4.T1.Act9.Maquinaria;

class Vagon {
    private int carga_max;
    private int carga_actual;
    private tipo_mercancia mercancia;

    public Vagon(int carga_max, int carga_actual, tipo_mercancia mercancia) {
        setCarga_actual(carga_actual);
        setCarga_max(carga_max);
        setMercancia(mercancia);
    }
//Carga maxima
    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }
//Carga actual
    public int getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }
//Mercancia
    public tipo_mercancia getMercancia() {
        return mercancia;
    }

    public void setMercancia(tipo_mercancia mercancia) {
        this.mercancia = mercancia;
    }

    //Metodos

    public void infoVagon(){
        System.out.println("Informacion del vagon ");
        System.out.println("La carga maxima es "+this.carga_max);
        System.out.println("La carga actual es "+this.carga_actual);
        System.out.println("La carga es "+this.mercancia);
        System.out.println("-----");
    }

}
