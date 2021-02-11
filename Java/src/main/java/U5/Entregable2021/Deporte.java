package U5.Entregable2021;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deporte {
    /*Nombre del deporte
    Nombre del pabellón en el que se a celebrar.
    La lista de los participantes inscritos. Deberé poder añadir y quitar participantes de dicha lista.*/

    private String nombre_dep;
    private String nombre_pab;
    protected Participante[] participantes;
    private int indice_participantes;

    public Deporte(String nombre_dep, String nombre_pab) {
        setIndice_participantes(0);
        setNombre_dep(nombre_dep);
        setNombre_pab(nombre_pab);
        setParticipantes();
    }

    public String getNombre_dep() {
        return nombre_dep;
    }

    public void setNombre_dep(String nombre_dep) {
        this.nombre_dep = nombre_dep;
    }

    public String getNombre_pab() {
        return nombre_pab;
    }

    public void setNombre_pab(String nombre_pab) {
        this.nombre_pab = nombre_pab;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes() {
        this.participantes = new Participante[this.indice_participantes];
    }

    public int getIndice_participantes() {
        return indice_participantes;
    }

    public void setIndice_participantes(int indice_participantes) {
        this.indice_participantes = indice_participantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deporte)) return false;
        Deporte deporte = (Deporte) o;
        return indice_participantes == deporte.indice_participantes && Objects.equals(nombre_dep, deporte.nombre_dep) && Objects.equals(nombre_pab, deporte.nombre_pab) && Arrays.equals(participantes, deporte.participantes);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "nombre_dep='" + nombre_dep + '\'' +
                ", nombre_pab='" + nombre_pab + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }

    public void addParticipante(Participante participante){
        if (indice_participantes==participantes.length){
            participantes= Arrays.copyOf(participantes, indice_participantes+1);
        }
        participantes[indice_participantes++]=participante;
    }

    public  void quitarParticipantes(Participante participante){
        for (int i = 0; i < indice_participantes; i++) {
            if (participantes[i].equals(participante)){
                for (int j = i; j < indice_participantes-1; j++) {
                    participantes[j]=participantes[j+1];
                }
            }
        }
        indice_participantes--;
        participantes=Arrays.copyOf(participantes, indice_participantes);
    }

    public void mostrarParticipantes(){
        Arrays.sort(participantes, new ComparatorPartEdad());
        System.out.println(Arrays.toString(participantes));
    }


}
