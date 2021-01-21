package U4.Entregable_2021;

public class Enemigo {
    private TipoEnemigos nombre;
    private int vida;
    private int danyo;

    public Enemigo(TipoEnemigos nombre) {
        setNombre(nombre);
        setVida(100);
        setDanyo(70);
    }

    //Getter and setter
    //nombre
    public TipoEnemigos getNombre() {
        return nombre;
    }

    public void setNombre(TipoEnemigos nombre) {
        this.nombre = nombre;
    }
    //vida
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    //danyo
    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    //Metodos
    //Restar vida
    public void restar_vida(int danyo){
        this.vida=this.vida-danyo;
        if(this.vida<=0){
            this.vida=0;
        }
    }


    @Override
    public String toString() {
        return "Enemigo{" +
                "nombre=" + nombre +
                ", vida=" + vida +
                ", daño=" + danyo +
                '}';
    }
}
