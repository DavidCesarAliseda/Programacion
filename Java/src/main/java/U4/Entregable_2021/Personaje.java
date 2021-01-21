package U4.Entregable_2021;

public class Personaje {
    private TipoPersonajes nombre;
    private double vel_movimiento;
    private int danyo_punyetazo;
    private int danyo_patada;

    public Personaje() { //Por defecto Sonic
        setNombre(TipoPersonajes.Sonic);
        setVel_movimiento(100);
        setDanyo_punyetazo(100);
        setDanyo_patada(200);
    }

    public Personaje(TipoPersonajes nombre) { //Por defecto Sonic
        setNombre(nombre);
        setVel_movimiento(vel_movimiento);
        setDanyo_punyetazo(danyo_punyetazo);
        setDanyo_patada(danyo_patada);
    }

    //Getter and Setter
    //Vel_mov
    public double getVel_movimiento() {
        return vel_movimiento;
    }

    public void setVel_movimiento(double vel_movimiento) {
        this.vel_movimiento = vel_movimiento;
    }

    //Daño puñetazo
    public int getDanyo_punyetazo() {
        return danyo_punyetazo;
    }

    public void setDanyo_punyetazo(int danyo_punyetazo) {
        this.danyo_punyetazo = danyo_punyetazo;
    }

    //Daño patada
    public int getDanyo_patada() {
        return danyo_patada;
    }

    public void setDanyo_patada(int danyo_patada) {
        this.danyo_patada = danyo_patada;
    }
    //Nombre
    public TipoPersonajes getNombre() {
        return nombre;
    }

    public void setNombre(TipoPersonajes nombre) {
        this.nombre = nombre;
    }

    //Metodos


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre=" + nombre +
                ", vel_movimiento=" + vel_movimiento +
                ", daño_puñetazo=" + danyo_punyetazo +
                ", daño_patada=" + danyo_patada +
                '}';
    }
}
