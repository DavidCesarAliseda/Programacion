package U5.Examen2021;

import java.util.Arrays;

public class Caja {

    private Prenda[] prendas;
    private int capMax=5;
    private int indicePrenda;
    private int id_caja;

    public Caja(int id_caja) {
        setPrendas();
        setIndicePrenda(0);
        setId_caja(id_caja);
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas() {
        this.prendas = new Prenda[capMax];
    }

    public int getIndicePrenda() {
        return indicePrenda;
    }

    public void setIndicePrenda(int indicePrenda) {
        this.indicePrenda = indicePrenda;
    }

    public int getId_caja() {
        return id_caja;
    }

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }


    public void addPrenda(Prenda prenda){
        if (indicePrenda ==prendas.length){
            prendas= Arrays.copyOf(prendas, indicePrenda+1);
        }
        prendas[indicePrenda++]=prenda;
    }

    public void quitarPrenda(Prenda prenda){
        for (int i = 0; i < indicePrenda; i++) {
            if (prendas[i].equals(prenda)){
                for (int j = i; j < indicePrenda-1; j++) {
                    prendas[j]=prendas[j+1];
                }
            }
        }
        indicePrenda--;
        prendas=Arrays.copyOf(prendas, indicePrenda);
    }

    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                ", indicePrenda=" + indicePrenda +
                ", id_caja=" + id_caja +
                '}';
    }
}
