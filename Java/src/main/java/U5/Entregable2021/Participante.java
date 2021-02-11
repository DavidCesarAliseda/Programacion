package U5.Entregable2021;

import java.util.Arrays;
import java.util.Objects;

public abstract class Participante {
    /*El nombre del atleta.
La edad del atleta.
Y un método que deben tener todas las clases hijas que se llame hacerjuramento().*/

    private String nombre_atleta;
    private int edad;

    public Participante(String nombre_atleta, int edad) {
        setEdad(edad);
        setNombre_atleta(nombre_atleta);
    }

    public String getNombre_atleta() {
        return nombre_atleta;
    }

    public void setNombre_atleta(String nombre_atleta) {
        this.nombre_atleta = nombre_atleta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public abstract String hacerjuramento();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participante)) return false;
        Participante that = (Participante) o;
        return edad == that.edad && Objects.equals(nombre_atleta, that.nombre_atleta);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre_atleta='" + nombre_atleta + '\'' +
                ", edad=" + edad +
                '}';
    }
}
