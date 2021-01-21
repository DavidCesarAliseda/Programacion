package U4.Entregable_2021;

import java.util.Date;

public class Videojuegos {
    private Escenario escen;
    private Personaje person;
    private Date fecha_inicio = new Date();
    private static String ip = "192.168";

    public Videojuegos() {
        Personaje Sonic = new Personaje();
        TipoEnemigos enem[] = {TipoEnemigos.BuzzBomber, TipoEnemigos.Coconuts};
        Escenario escenario = new Escenario(enem);
        setEscen(escenario);
        setPerson(Sonic);
        this.fecha_inicio = fecha_inicio;
    }

    public Videojuegos(Escenario escen, Personaje person) {
        setEscen(escen);
        setPerson(person);
        this.fecha_inicio = fecha_inicio;
    }

    public Escenario getEscen() {
        return escen;
    }

    public void setEscen(Escenario escen) {
        this.escen = escen;
    }

    public Personaje getPerson() {
        return person;
    }

    public void setPerson(Personaje person) {
        this.person = person;
    }

    //Metodos
    //Acceder
    public void accedeIP(){
        System.out.println("La IP es "+ip);
    }
    //Modificarla
    public  void  modificarIP(String nuevaip){
        ip = nuevaip;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "escen=" + escen +
                ", person=" + person +
                ", fecha_inicio=" + fecha_inicio +
                '}';
    }
}
