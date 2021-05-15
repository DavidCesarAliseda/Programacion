package U7.Cesar_FernandezAliseda_David_U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Atleta implements Serializable {
    private String Nombre;
    private String Pais;
    private Integer marca;
    private Categoria categoria;
    private boolean Finisher;
    private int dorsal;


    public Atleta(String nombre, String pais, Categoria categoria) {
        setNombre(nombre);
        setPais(pais);
        setCategoria(categoria);
        setFinisher(false);
        setMarca(0);
        setDorsal(0);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return Finisher;
    }

    public void setFinisher(boolean finisher) {
        Finisher = finisher;
    }

    @Override
    public String toString() {
        return "\nAtleta{" +
                "Nombre='" + Nombre + '\'' +
                ", Pais='" + Pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", Finisher=" + Finisher +
                ", dorsal=" + dorsal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atleta)) return false;
        Atleta atleta = (Atleta) o;
        return Finisher == atleta.Finisher && dorsal == atleta.dorsal && Objects.equals(Nombre, atleta.Nombre) && Objects.equals(Pais, atleta.Pais) && Objects.equals(marca, atleta.marca) && categoria == atleta.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Pais, marca, categoria, Finisher, dorsal);
    }
}
