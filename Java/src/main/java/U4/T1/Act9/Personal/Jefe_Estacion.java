package U4.T1.Act9.Personal;

public class Jefe_Estacion {
    /*Jefes estación: nombre completo, dni.*/

    private String nombre;
    private String DNI;

    public Jefe_Estacion(String nombre, String DNI) {
        setNombre(nombre);
        setDNI(DNI);
    }

    //Get and Setter
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //DNI
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
