package U4.T1.Act9.Personal;

public class Mecanico {
    /*Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)*/

    String nombre;
    long telefono;
    String especialidad;

    public Mecanico(String nombre, long telefono, String especialidad) {
        setNombre(nombre);
        setTelefono(telefono);
        setEspecialidad(especialidad);
    }
    //Get and Setter
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Telefono
    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    //Especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void infoMecanico(){
        System.out.println("Informacion del mecanico.");
        System.out.println("Su nombre es "+this.nombre);
        System.out.println("Su telefono es "+this.telefono);
        System.out.println("Su especialidad es "+this.especialidad);
        System.out.println("-----");
    }








}
