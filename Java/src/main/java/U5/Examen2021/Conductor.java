package U5.Examen2021;

public class Conductor {
    /*Del conductor necesitaremos saber su nombre, sus apellidos y su NSS (número de seguridad social).*/

    private String nombre;
    private String apellido;
    private long NSS;

    public Conductor(String nombre, String apellido, long NSS) {
        setNombre(nombre);
        setApellido(apellido);
        setNSS(NSS);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNSS() {
        return NSS;
    }

    public void setNSS(long NSS) {
        this.NSS = NSS;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", NSS=" + NSS +
                '}';
    }
}
