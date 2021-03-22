package U7.Cesar_FernandezAliseda_David_U7_Examen;

import java.util.HashMap;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        //Crear atletas
        Atleta a1 = new Atleta("David", "España", Categoria.JUNIOR);
        Atleta a2 = new Atleta("Andrea", "Francia", Categoria.JUNIOR);
        Atleta a3 = new Atleta("Paco", "Mexico", Categoria.JUNIOR);
        Atleta a4 = new Atleta("Gustavo", "Francia", Categoria.JUNIOR);
        Atleta a5 = new Atleta("Jose", "España", Categoria.JUNIOR);

        Atleta a6 = new Atleta("Aida", "Mexico", Categoria.SENIOR);
        Atleta a7 = new Atleta("Carolina", "España", Categoria.SENIOR);
        Atleta a8 = new Atleta("Pablo", "Francia", Categoria.SENIOR);
        Atleta a9 = new Atleta("Pedro", "España", Categoria.SENIOR);
        Atleta a10 = new Atleta("Francisco", "Mexico", Categoria.SENIOR);

        Atleta a11 = new Atleta("Manuel", "Italia", Categoria.VETERANO);
        Atleta a12 = new Atleta("Marta", "España", Categoria.VETERANO);
        Atleta a13 = new Atleta("Sandra", "Mexico", Categoria.VETERANO);
        Atleta a14 = new Atleta("Pepe", "España", Categoria.VETERANO);
        Atleta a15 = new Atleta("Sara", "Francia", Categoria.VETERANO);
        //Crear maraton
        Maraton maraton = new Maraton(new HashMap<Categoria, Set<Atleta>>());
        //Inscribir atletas
        maraton.inscribirAtleta(a1);
        maraton.inscribirAtleta(a2);
        maraton.inscribirAtleta(a3);
        maraton.inscribirAtleta(a4);
        maraton.inscribirAtleta(a5);
        maraton.inscribirAtleta(a6);
        maraton.inscribirAtleta(a7);
        maraton.inscribirAtleta(a8);
        maraton.inscribirAtleta(a9);
        maraton.inscribirAtleta(a10);
        maraton.inscribirAtleta(a11);
        maraton.inscribirAtleta(a12);
        maraton.inscribirAtleta(a13);
        maraton.inscribirAtleta(a14);
        maraton.inscribirAtleta(a15);
        //Guardar tiempos
        maraton.guardarTiempo(a1, 250);
        maraton.guardarTiempo(a2, 450);
        maraton.guardarTiempo(a9, 213);
        maraton.guardarTiempo(a8, 199);
        maraton.guardarTiempo(a4, 263);
        maraton.guardarTiempo(a7, 365);
        maraton.guardarTiempo(a3, 450);
        maraton.guardarTiempo(a14, 580);
        maraton.guardarTiempo(a12, 1890);
        maraton.guardarTiempo(a15, 450);

        maraton.mostrarFinishers();
        System.out.println();
        maraton.mostrarCategoria(Categoria.JUNIOR);
        System.out.println();
        maraton.participantesPorPais("Mexico");
        System.out.println();
        maraton.guardarAtletas();
        System.out.println();
        maraton.borrarAtleta(1);
        System.out.println();
        //Cargar fichero a nuevo maraton
        Maraton m2 = new Maraton(new HashMap<Categoria, Set<Atleta>>());
        m2.cargarAtletas();
    }
}
