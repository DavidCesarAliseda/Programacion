package U5.Examen2021;

import java.util.Arrays;

public class CamionPerchas extends Camion implements Comparable{

    private PrendaColgada[] prendasColgadas;
    private int indidePrendasColgadas;

    public CamionPerchas(int matricula, int cargaMax, Conductor conductor, int num_tiendas) {
        super(matricula, cargaMax, conductor, num_tiendas);
        setPrendaColgada();
        setIndidePrendasColgadas(0);
    }

    public PrendaColgada[] getPrendasColgadas() {
        return prendasColgadas;
    }

    public void setPrendaColgada() {
        this.prendasColgadas = new PrendaColgada[0];
    }

    public int getIndidePrendasColgadas() {
        return indidePrendasColgadas;
    }

    public void setIndidePrendasColgadas(int indidePrendasColgadas) {
        this.indidePrendasColgadas = indidePrendasColgadas;
    }

    public void addPrenda(PrendaColgada prendaColgada){
        if (indidePrendasColgadas ==prendasColgadas.length){
            prendasColgadas= Arrays.copyOf(prendasColgadas, indidePrendasColgadas+1);
        }
        prendasColgadas[indidePrendasColgadas++]=prendaColgada;
    }

    public void quitarPrenda(PrendaColgada prendaColgada){
        for (int i = 0; i < indidePrendasColgadas; i++) {
            if (prendasColgadas[i].equals(prendaColgada)){
                for (int j = i; j < indidePrendasColgadas-1; j++) {
                    prendasColgadas[j]=prendasColgadas[j+1];
                }
            }
        }
        indidePrendasColgadas--;
        prendasColgadas=Arrays.copyOf(prendasColgadas, indidePrendasColgadas);
    }

    @Override
    public void descargar() {
        System.out.println( "Descargando "+indidePrendasColgadas+" Prendas");
    }

    @Override
    public int compareTo(Object o) {
        CamionPerchas otro = (CamionPerchas) o;
        return indidePrendasColgadas-otro.getIndidePrendasColgadas();
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendasColgadas=" + Arrays.toString(prendasColgadas) +
                ", indidePrendasColgadas=" + indidePrendasColgadas +
                "} " + super.toString();
    }
}
