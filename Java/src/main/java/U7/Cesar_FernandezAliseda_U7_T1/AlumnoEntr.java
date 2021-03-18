package U7.Cesar_FernandezAliseda_U7_T1;

import java.io.Serializable;

public class AlumnoEntr implements Serializable{
    /*De los alumnos guardaremos los siguientes datos:

El nombre del alumnos
Los apellidos
El dni
Un id que deberá ser consecutivo para todos y cada uno de los alumnos que creemos.
La unidad en la que está matriculado.*/

    private String nombre;
    private String apellidos;
    private String DNI;
    private Unidad unidad;
    private int id=0;
    private static int contador_ID = 0;
    //Constructor
    public AlumnoEntr(String nombre, String apellidos, String DNI, Unidad unidad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDNI(DNI);
        setId(contador_ID++);
        setUnidad(unidad);
    }
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AlumnoEntr{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", unidad=" + unidad +
                ", id=" + id +
                '}';
    }
}
