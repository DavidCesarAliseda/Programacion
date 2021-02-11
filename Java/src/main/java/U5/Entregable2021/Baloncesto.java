package U5.Entregable2021;

import java.util.Arrays;

public class Baloncesto extends Deporte{
    private int num_equipos;

    public Baloncesto(String nombre_dep, String nombre_pab) {
        super(nombre_dep, nombre_pab);
        setNum_equipos(num_equipos);
    }

    public int getNum_equipos() {
        return num_equipos;
    }

    public void setNum_equipos(int num_equipos) {
        this.num_equipos = num_equipos;
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                super.toString()+
                "num_equipos=" + num_equipos +
                "} ";
    }

    public void mostrarJugadoresBaloncestoPorAltura(){
        Arrays.sort(participantes, new ComparatorAltura());
        System.out.println(Arrays.toString(participantes));
    }
}
