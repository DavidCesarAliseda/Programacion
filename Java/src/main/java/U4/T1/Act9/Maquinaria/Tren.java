package U4.T1.Act9.Maquinaria;

import U4.T1.Act9.Personal.Maquinista;

import java.io.Serializable;

public class Tren implements Serializable {//Para tema de ficheros

    private Locomotora locomotora;
    private Vagon vagones[];
    private Maquinista maquinista;
    private int numvagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        setLocomotora(locomotora);
        setMaquinista(maquinista);
        vagones = new Vagon[5];
        numvagones = 0;
    }

    //Locomotora
    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    //Maquinista
    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }
    //Metodos
    //Añadir vagon
    public void anadir_vagon(int carga_max, int carga_actual, tipo_mercancia mercancia){
        if(numvagones < 5) {
            Vagon v = new Vagon(carga_max, carga_actual, mercancia);
            vagones[numvagones] = v;
            numvagones++;
        }else{
            System.out.println("No se puede añadir el vagon ");
            System.out.println();
        }
    }
    public void infoTren(){
        maquinista.infoMaquinista();
        locomotora.infoLocomotora();
        for (int i = 0; i < numvagones; i++) {
            System.out.println("Info vagon numero "+(i+1));
            vagones[i].infoVagon();
        }
    }
}
