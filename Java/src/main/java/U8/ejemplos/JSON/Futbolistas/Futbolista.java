package U8.Ejemplos.JSON.Futbolistas;

import java.util.ArrayList;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private ArrayList<String> posiciones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, ArrayList<String> posiciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posiciones = posiciones;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", posiciones=" + posiciones +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
