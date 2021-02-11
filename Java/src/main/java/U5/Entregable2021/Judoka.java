package U5.Entregable2021;

public class Judoka extends Participante implements Luchar{
/*Los Judokas, que cuando realicen el juramento mostrarán por pantalla, "Yo XXXXXX, como judoka, juro los valores deportivos mundiales".
Además deberemos guardar el peso de su categoría (un número entero).*/

    private int peso;

    public Judoka(String nombre_atleta, int edad, int peso) {
        super(nombre_atleta, edad);
        setPeso(peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String hacerjuramento() {
        return "Yo "+super.getNombre_atleta()+", como judoka, juro los valores deportivos mundiales";
    }

    @Override
    public void luchar() {
        System.out.println("Voy a pelear");
    }

    @Override
    public String toString() {
        return "Judoka{" +
                super.toString()+
                "peso=" + peso +
                "} " + super.toString();
    }
}
