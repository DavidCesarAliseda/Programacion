package U5.Entregable2021;

public class Jugador_Baloncesto extends Participante implements Encestar{
/*Los jugadores de baloncesto, que cuando realicen en juramento mostrarán por, "Yo XXXXXXX, como jugador de baloncesto, juro los valores deportivos mundiales".
Además deberemos guardar su altura (un número con decimales).*/

    private double altura;

    public Jugador_Baloncesto(String nombre_atleta, int edad, double altura) {
        super(nombre_atleta, edad);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String hacerjuramento() {
        return "Yo "+super.getNombre_atleta()+", como jugador de baloncesto, juro los valores deportivos mundiales";
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }

    @Override
    public String toString() {
        return "Jugador_Baloncesto{" +
                super.toString()+
                "altura=" + altura +
                "} " + super.toString();
    }
}
