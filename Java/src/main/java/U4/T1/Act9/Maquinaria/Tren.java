package U4.T1.Act9.Maquinaria;

import U4.T1.Act9.Personal.Maquinista;

import java.util.Arrays;

public class Tren {

    Locomotora locomotora;
    Vagon vagones[];
    Maquinista maquinista;
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
    public void anadir_vagon(int carga_max, int carga_actual, String mercancia){
        if(numvagones <= 5) {
            Vagon v = new Vagon(carga_max, carga_actual, mercancia);
            vagones[numvagones] = v;
            numvagones++;
        }
    }
    public void infoTren(){
        maquinista.infoMaquinista();
        locomotora.infoLocomotora();
        for (int i = 0; i < numvagones; i++) {
            System.out.println("Info vagon numero "+numvagones);
            vagones[numvagones].infoVagon();
        }
    }
}
