package U5.Examen2021;

import java.util.Arrays;

public class CamionCajas extends Camion implements Comparable{
    private Caja[] cajasencamion;
    private int indiceCajas;


    public CamionCajas(int matricula, int cargaMax, Conductor conductor, int num_tiendas) {
        super(matricula, cargaMax, conductor, num_tiendas);
        setCaja();
        setIndiceCajas(0);
    }

    public Caja[] getCaja() {
        return cajasencamion;
    }

    public void setCaja() {
        this.cajasencamion = new Caja[0];
    }

    public int getIndiceCajas() {
        return indiceCajas;
    }

    public void setIndiceCajas(int indiceCajas) {
        this.indiceCajas = indiceCajas;
    }

    @Override
    public void descargar() {
        int contprendas=0;
        for (int i = 0; i < indiceCajas; i++) {
            contprendas=contprendas+cajasencamion[i].getIndicePrenda();
        }
        System.out.println("Descargando "+indiceCajas+" cajas y "+contprendas+" prendas");
    }

    public void addCaja(Caja caja){
        if (indiceCajas==cajasencamion.length){
            cajasencamion= Arrays.copyOf(cajasencamion, indiceCajas+1);
        }
        cajasencamion[indiceCajas++]=caja;
    }

    public void quitarCaja(Caja caja){
        for (int i = 0; i < indiceCajas; i++) {
            if (cajasencamion[i].getId_caja()==caja.getId_caja()){
                for (int j = i; j < indiceCajas-1; j++) {
                    cajasencamion[j]=cajasencamion[j+1];
                }
            }
        }
        indiceCajas--;
        cajasencamion=Arrays.copyOf(cajasencamion, indiceCajas);
    }

    @Override
    public int compareTo(Object o) {
        CamionCajas otro = (CamionCajas) o;

        return getIndiceCajas()-otro.getIndiceCajas();
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajasencamion=" + Arrays.toString(cajasencamion) +
                ", indiceCajas=" + indiceCajas +
                "} " + super.toString();
    }
}
