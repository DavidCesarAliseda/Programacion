package U4.Entregable_2021;

import java.util.Arrays;

public class Escenario {
    private int altura;
    private int longitud;
    private int num_anillos;
    private int num_gemas;
    private TipoEnemigos[] tipos_enemigos;
    private Enemigo[] enemigos ;
    private int indice_enemigos;
    private final int limite_enemigos;

    public Escenario(TipoEnemigos[] tipos_enemigos) {
        this.limite_enemigos=10;
        this.indice_enemigos=0;
        setAltura(100);
        setLongitud(100);
        setNum_anillos(500);
        setNum_gemas(2);
        setTipos_enemigos(tipos_enemigos);
        setEnemigos();

    }

    //Getter ab setter
    //Tipo enem
    public TipoEnemigos[] getTipos_enemigos() {
        return tipos_enemigos;
    }

    public void setTipos_enemigos(TipoEnemigos[] tipos_enemigos) {
        this.tipos_enemigos = tipos_enemigos;
    }
    //enem
    public Enemigo[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos() {
        this.enemigos = new Enemigo[limite_enemigos];
    }

    //altura
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //long
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    //numanillos
    public int getNum_anillos() {
        return num_anillos;
    }

    public void setNum_anillos(int num_anillos) {
        this.num_anillos = num_anillos;
    }
    //numgemas
    public int getNum_gemas() {
        return num_gemas;
    }

    public void setNum_gemas(int num_gemas) {
        this.num_gemas = num_gemas;
    }

    //Metodos
    //Generar enemigo
    public void generar_enemigo() {
        
        if (indice_enemigos < limite_enemigos) {
            int enem_aleat = (int) (Math.random() * tipos_enemigos.length);

            Enemigo e = new Enemigo(tipos_enemigos[enem_aleat]);
            enemigos[indice_enemigos++] = e;

        }
    }
    //Eliminar
    public void eliminar_enem(int posicion) {
        for (int i = posicion; i <= indice_enemigos; i++) {
            enemigos[i] = enemigos[i + 1];//Desplaza los elementos hacia el final
        }
        indice_enemigos--;
    }
    //Num enem
    public void mostrarnum_enem(){
        System.out.println("Hay "+indice_enemigos+" enemigos.");
    }



    @Override
    public String toString() {

        return "Escenario{" +
                "altura=" + altura +
                ", longitud=" + longitud +
                ", num_anillos=" + num_anillos +
                ", num_gemas=" + num_gemas +
                ", tipos_enemigos=" + Arrays.toString(tipos_enemigos) +
                ", enemigos=" + Arrays.toString(enemigos) +
                '}';
    }
}
