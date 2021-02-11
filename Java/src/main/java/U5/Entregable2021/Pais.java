package U5.Entregable2021;

import U5.Examen2020.Examen2020.Material;

import java.util.Objects;

public class Pais implements Comparable{
    /*El nombre del país.
    El número de participantes que aportan a las competiciones.*/

    private String nombre;
    private int num_part;

    public Pais(String nombre, int num_part) {
        setNombre(nombre);
        setNum_part(num_part);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_part() {
        return num_part;
    }

    public void setNum_part(int num_part) {
        this.num_part = num_part;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", num_part=" + num_part +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return num_part == pais.num_part && Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int compareTo(Object o) {
        Pais otro = (Pais) o;
        return this.getNombre().compareTo(((Pais) o).getNombre());
    }
}
