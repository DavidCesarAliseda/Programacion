package U7_Entregable.Cesar_FernandezAliseda_U7_T1;

import java.util.HashMap;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Unidad u1 = new Unidad("2A");
        Unidad u2 = new Unidad("3B");
        Unidad u3 = new Unidad("5C");
        AlumnoEntr a1 = new AlumnoEntr("David", "Cesar", "999A", u1);
        AlumnoEntr a4 = new AlumnoEntr("Ernesto", "Guevara", "632N", u1);
        AlumnoEntr a10 = new AlumnoEntr("Marta", "Ortega", "674Q", u1);
        AlumnoEntr a9 = new AlumnoEntr("Mar", "Garcia", "375G", u1);

        AlumnoEntr a3 = new AlumnoEntr("Adolfo", "Suarez", "564B", u2);
        AlumnoEntr a7 = new AlumnoEntr("Elena", "Muñoz", "741T", u2);
        AlumnoEntr a8 = new AlumnoEntr("Cristina", "Moreno", "456B", u2);

        AlumnoEntr a2 = new AlumnoEntr("Pepe", "Villuela", "654G", u3);
        AlumnoEntr a5 = new AlumnoEntr("Francisco", "Fernandez", "746N", u3);
        AlumnoEntr a6 = new AlumnoEntr("Alberto", "Rivera", "934F", u3);

        Instituto Alixar = new Instituto(new HashMap<Unidad, Set<AlumnoEntr>>());
        //Unidad u1
        Alixar.addAlumnoUnidad(u1, a1);
        Alixar.addAlumnoUnidad(u1, a4);
        Alixar.addAlumnoUnidad(u1, a10);
        Alixar.addAlumnoUnidad(u1, a9);

        //Unidad u2
        Alixar.addAlumnoUnidad(u2, a3);
        Alixar.addAlumnoUnidad(u2, a7);
        Alixar.addAlumnoUnidad(u2, a8);

        //Unidad u3
        Alixar.addAlumnoUnidad(u3, a2);
        Alixar.addAlumnoUnidad(u3, a5);
        Alixar.addAlumnoUnidad(u3, a6);

        Alixar.mostrarAlumnosUnidad(u1);

       /* Alixar.obtenerUnidadAlumno(a7.getId());

        Alixar.mostrarTodosAlumnosOrdenados();

        Alixar.guardarAlumnos();

        Alixar.cargarAlumnos();*/

    }
}
