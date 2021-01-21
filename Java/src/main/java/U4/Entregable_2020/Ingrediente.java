package U4.Entregable_2020;

public class Ingrediente {
    String Nombre;
    private int calorias;


    public Ingrediente() {
        setNombre("Queso");
        setCalorias(250);
    }

    public Ingrediente(String nombre, int calorias) {
        setNombre(nombre);
       setCalorias(calorias);
    }

    //Getter and setter
    //Nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    //Calorias
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "Nombre='" + Nombre + '\'' + ", calorias=" + calorias + '}';
    }
}
