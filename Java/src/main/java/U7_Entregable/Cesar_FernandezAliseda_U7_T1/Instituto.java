package U7_Entregable.Cesar_FernandezAliseda_U7_T1;

import java.io.*;
import java.util.*;

public class Instituto {
    private Map<Unidad, Set<AlumnoEntr>> alumnado;
    //Constructor
    public Instituto(Map<Unidad, Set<AlumnoEntr>> alumnado) {
        setAlumnado(alumnado);
    }
    //Get and Set
    public Map<Unidad, Set<AlumnoEntr>> getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(Map<Unidad, Set<AlumnoEntr>> alumnado) {
        this.alumnado = alumnado;
    }

    //Metodos
    public void addAlumnoUnidad(Unidad u, AlumnoEntr a){
        if (alumnado.containsKey(u)){
            Set<AlumnoEntr> conjunto_alumnoEntrs = alumnado.get(u);
            conjunto_alumnoEntrs.add(a);
        }else{
            Set <AlumnoEntr> conjunto_alumnoEntrs = new HashSet<>();
            conjunto_alumnoEntrs.add(a);
            alumnado.put(u, conjunto_alumnoEntrs);
        }
    }

    public void mostrarAlumnosUnidad(Unidad u) {
        Set<AlumnoEntr> conjunto_alumnoEntrs =
                new TreeSet<AlumnoEntr>(
                        new Comparator<AlumnoEntr>(){
                            @Override
                            public int compare(AlumnoEntr o1, AlumnoEntr o2) {
                                return o1.getDNI().compareTo(o2.getDNI());
                            }
                        }
                );
        conjunto_alumnoEntrs.addAll(alumnado.get(u));
        System.out.println(conjunto_alumnoEntrs);
    }

    public void obtenerUnidadAlumno(int id_alumno){
        boolean flag = false;
        for (Unidad u : alumnado.keySet()){
            Set<AlumnoEntr> conjunto_alumnoEntr = alumnado.get(u);
            for (AlumnoEntr a : conjunto_alumnoEntr){
                if (a.getId() == id_alumno) {
                    System.out.println(a);
                    flag=true;
                }
            }
        }
        if (!flag){
            System.out.println("El alumno no se ha encontrado");
        }
    }

    public void mostrarTodosAlumnosOrdenados() {
        Set<AlumnoEntr> conjunto_alumnos = new HashSet<>();
        for (Unidad u : alumnado.keySet()) {
            conjunto_alumnos.addAll(alumnado.get(u));
        }
        TreeSet todos_alumnos_ord = new TreeSet(
                new Comparator<AlumnoEntr>(){
                    @Override
                    public int compare(AlumnoEntr o1, AlumnoEntr o2) {
                        return o1.getApellidos().compareTo(o2.getApellidos());
                    }
                });
        todos_alumnos_ord.addAll(conjunto_alumnos);
        System.out.println(todos_alumnos_ord);
    }
    public void guardarAlumnos() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ficheros//entregableU7_david.dat"));
            out.writeObject(alumnado);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarAlumnos(){
        Map<Unidad, Set<AlumnoEntr>> mapa = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ficheros//entregableU7_david.dat"));
            mapa = (Map<Unidad, Set<AlumnoEntr>>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(mapa);
    }
}
