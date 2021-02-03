package U5.T1.Act7y8;

public class Etiqueta {
    protected String nombre_destinatario;
    protected String direccion;

    //Constructor
    public Etiqueta(String nombre_destinatario, String direccion) {
       setNombre_destinatario(nombre_destinatario);
       setDireccion(direccion);
    }

    //Get and Set
    //Nombre
    public String getNombre_destinatario() {
        return nombre_destinatario;
    }

    public void setNombre_destinatario(String nombre_destinatario) {
        this.nombre_destinatario = nombre_destinatario;
    }
    //Direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
