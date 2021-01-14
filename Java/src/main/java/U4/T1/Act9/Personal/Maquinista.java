package U4.T1.Act9.Personal;

public class Maquinista {
    /*Maquinistas: nombre completo, dni, sueldo mensual, rango*/

    private String nombre;
    private String DNI;
    private double sueldo;
    private int rango;

    public Maquinista(String nombre, String DNI, double sueldo, int rango) {
        setNombre(nombre);
        setDNI(DNI);
        setSueldo(sueldo);
        setRango(rango);
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

    //Sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Rango
    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    //Metodos
    public void infoMaquinista(){
        System.out.println("Informacion del maquinista ");
        System.out.println("Su nombre es "+this.nombre);
        System.out.println("Su DNI es "+this.DNI);
        System.out.println("Su sueldo es "+this.sueldo);
        System.out.println("Su rango es "+this.rango);
        System.out.println("-----");
    }

}
