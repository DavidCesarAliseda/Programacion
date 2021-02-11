package U5.Entregable2021;

public class Atleta extends Participante implements Correr{
    /*Los Atletas, que cuando realicen el juramente mostrarán por pantalla, "Yo XXXXXX, como atleta, juro los valores deportivos mundiales".
    Además debemos guardar el nombre de la prueba en la que participan.*/
    private String nombre_prueba;

    public Atleta(String nombre_atleta, int edad, String nombre_prueba) {
        super(nombre_atleta, edad);
        setNombre_prueba(nombre_prueba);
    }

    public String getNombre_prueba() {
        return nombre_prueba;
    }

    public void setNombre_prueba(String nombre_prueba) {
        this.nombre_prueba = nombre_prueba;
    }

    @Override
    public String hacerjuramento() {
        return "Yo "+super.getNombre_atleta()+", como atleta, juro los valores deportivos mundiales";
    }


    @Override
    public void correr() {
        System.out.println("Voy a correr");
    }

    @Override
    public String toString() {
        return "Atleta{" +
                super.toString()+
                "nombre_prueba='" + nombre_prueba + '\'' +
                "} " + super.toString();
    }
}
