package U5.Examen2020_2;

public abstract class Material implements Comparable{
    /*El nombre
La masa (entre 0 y 1000)
La capacidad de quemarse (entre 0 y 100)
La capacidad de diluirse (entre 0 y 100).
Si son movibles o no*/

    private String nombre;
    private int masa;
    private int CapQuemarse;
    private int CapDiluirse;
    private boolean esMovil;

    public Material(String nombre, int masa, int capQuemarse, int capDiluirse, boolean esMovil) {
        setNombre(nombre);
        setMasa(masa);
        setCapQuemarse(capQuemarse);
        setCapDiluirse(capDiluirse);
        setEsMovil(esMovil);
    }

    //Get and Set
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Masa
    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        if (masa>=0 && masa<=1000){
            this.masa = masa;
        }else if (masa<0){
            setMasa(0);
        }else{
            setMasa(1000);
        }
    }
    //Capacida quemar
    public int getCapQuemarse() {
        return CapQuemarse;
    }

    public void setCapQuemarse(int capQuemarse) {
        if (capQuemarse>=0 && capQuemarse<=100){
            this.CapQuemarse = capQuemarse;
        }
    }
    //Capacida diluir
    public int getCapDiluirse() {
        return CapDiluirse;
    }

    public void setCapDiluirse(int capDiluirse) {
        if (capDiluirse>=0 && capDiluirse<=100) {
            this.CapDiluirse = capDiluirse;
        }
    }
    //ES movil
    public boolean isEsMovil() {
        return esMovil;
    }

    public void setEsMovil(boolean esMovil) {
        this.esMovil = esMovil;
    }

    //Metodos
    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", CapQuemarse=" + CapQuemarse +
                ", CapDiluirse=" + CapDiluirse +
                ", esMovil=" + esMovil +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Material otro = (Material) o;
        int resultado;
        if (this.getMasa()>otro.getMasa()){
            resultado=1;
        }else if(this.getMasa()<otro.getMasa()){
            resultado=-1;
        }else{
            resultado=0;
        }
        return resultado;
    }


}
