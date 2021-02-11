package U5.Entregable2021;

import java.util.Arrays;

public class Juego {
    /*El año de celebración. Debemos asegurarnos de que es múltiplo de 4.Si no es así debes decidir qué hacer.
La sede en la que se van a celebrar.
Una lista de países participantes.Deberé poder añadir y quitar países a dicha lista.
Una lista de deportes cuyas competiciones va a albergar dicha edición de los Juegos Deportivos.Deberé añadir y quitar deportes a dicha lista.*/

    private int anyo_celebracion;
    private String sede;
    private Pais[] paises_part;
    private Deporte[] deportes;
    private int indice_pais;
    private int indice_deportes;

    public Juego(int anyo_celebracion, String sede) {
        setIndice_deportes(0);
        setIndice_pais(0);
        setAnyo_celebracion(anyo_celebracion);
        setSede(sede);
        setDeportes();
        setPaises_part();
    }

    public int getAnyo_celebracion() {
        return anyo_celebracion;
    }

    public void setAnyo_celebracion(int anyo_celebracion) {
        if(anyo_celebracion %4==0){
            this.anyo_celebracion = anyo_celebracion;
        }else{
            this.anyo_celebracion = 2020;
        }
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises_part() {
        return paises_part;
    }

    public void setPaises_part() {
        this.paises_part = new Pais[this.indice_pais];
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes() {
        this.deportes = new Deporte[this.indice_deportes];
    }

    public int getIndice_pais() {
        return indice_pais;
    }

    public void setIndice_pais(int indice_pais) {
        this.indice_pais = indice_pais;
    }

    public int getIndice_deportes() {
        return indice_deportes;
    }

    public void setIndice_deportes(int indice_deportes) {
        this.indice_deportes = indice_deportes;
    }

    //Metodos
    public void addPais(Pais pais){
        if (indice_pais==paises_part.length){
            paises_part= Arrays.copyOf(paises_part, indice_pais+1);
        }
        paises_part[indice_pais++]=pais;
    }

    public void quitarPais(Pais pais){
        for (int i = 0; i < indice_pais; i++) {
            if (paises_part[i].equals(pais)){
                for (int j = i; j < indice_pais-1; j++) {
                    paises_part[j]=paises_part[j+1];
                }
            }
        }
        indice_pais--;
        paises_part=Arrays.copyOf(paises_part, indice_pais);
    }



    @Override
    public int hashCode() {
        return 0;
    }

    public void addDeporte(Deporte deporte){
        if (indice_deportes==deportes.length){
            deportes= Arrays.copyOf(deportes, indice_deportes+1);
        }
        deportes[indice_deportes++]=deporte;
    }

    public void quitarDeporte(Deporte deporte){
        for (int i = 0; i < indice_deportes; i++) {
            if (deportes[i].equals(deporte)){
                for (int j = i; j < indice_deportes-1; j++) {
                    deportes[j]=deportes[j+1];
                }
            }
        }
        indice_deportes--;
        deportes=Arrays.copyOf(deportes, indice_deportes);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "anyo_celebracion=" + anyo_celebracion +
                ", sede='" + sede + '\'' +
                ", paises_part=" + Arrays.toString(paises_part) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }

    public void mostrarPaises(){
        Arrays.sort(paises_part, new ComparatorCantidadPart());
        System.out.println(Arrays.toString(paises_part));
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises_part);
        System.out.println(Arrays.toString(paises_part));
    }


}
