package U7.Cesar_FernandezAliseda_David_U7_Examen;

import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Categoria, Set<Atleta>> prueba;
    private static int dorsal=1;

    public Maraton(Map<Categoria, Set<Atleta>> prueba) {
        this.prueba = prueba;
    }

    public Map<Categoria, Set<Atleta>> getPrueba() {
        return prueba;
    }

    public void setPrueba(Map<Categoria, Set<Atleta>> prueba) {
        this.prueba = prueba;
    }

    public void inscribirAtleta(Atleta atleta){
        atleta.setDorsal(dorsal++);
        if (prueba.containsKey(atleta.getCategoria())){
            Set<Atleta> conjunto_atletas = prueba.get(atleta.getCategoria());
            conjunto_atletas.add(atleta);
        }else {
            Set<Atleta> conjunto_atletas = new HashSet<>();
            conjunto_atletas.add(atleta);
            prueba.put(atleta.getCategoria(), conjunto_atletas);
        }
    }

    public void guardarTiempo(Atleta atleta, int tiempo){
        atleta.setFinisher(true);
        atleta.setMarca(tiempo);
    }

    public void borrarAtleta(int num_dorsal){
        boolean flag = false;
        for (Categoria c : prueba.keySet()){
            Set<Atleta> conjunto_atletas = prueba.get(c);
            for (Atleta a : conjunto_atletas){
                System.out.println(a);
                if (a.getDorsal()==num_dorsal){
                    conjunto_atletas.remove(a);
                    flag=true;
                    System.out.println("El atleta "+a.getNombre()+" con dorsal "+num_dorsal+" ha sido borrado.");
                }
            }
        }
        if (!flag){
            System.out.println("El atleta no ha sido encontrado.");
        }
    }

    public void mostrarFinishers(){
        Set<Atleta> conjuntoAtletas_ordenados= new TreeSet<>(
                new Comparator<Atleta>() {
                    @Override
                    public int compare(Atleta o1, Atleta o2) {
                        return o1.getMarca().compareTo(o2.getMarca());
                    }
                }
        );
        for (Categoria c : prueba.keySet()){
            Set<Atleta> conjunto_atletas = prueba.get(c);
            for (Atleta a : conjunto_atletas){
                if (a.isFinisher()){
                    conjuntoAtletas_ordenados.add(a);
                }
            }
        }
        System.out.println(conjuntoAtletas_ordenados);
    }
    public void mostrarCategoria(Categoria cat){
        Set<Atleta> conjuntoAtletas_ordenados= new TreeSet<>(
                new Comparator<Atleta>() {
                    @Override
                    public int compare(Atleta o1, Atleta o2) {
                        return o1.getMarca()-o2.getMarca();
                    }
                }
        );
        conjuntoAtletas_ordenados.addAll(prueba.get(cat));
        System.out.println(conjuntoAtletas_ordenados);
    }
    public void participantesPorPais(String p){
        int contador_participantes=0;
        for (Categoria c : prueba.keySet()){
            Set<Atleta> conjunto_atletas = prueba.get(c);
            for (Atleta a : conjunto_atletas){
                if (p.equals(a.getPais())){
                    contador_participantes++;
                }
            }
        }
        System.out.println("Hay "+contador_participantes+" participantes de "+p);
    }

    public void guardarAtletas(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ficheros//examenU7_david.dat"));
            out.writeObject(prueba);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarAtletas(){
        Map<Categoria, Set<Atleta>> mapa = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ficheros//examenU7_david.dat"));
            mapa = (Map<Categoria, Set<Atleta>>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(mapa);
        prueba.clear();
        prueba.putAll(mapa);
    }
}
