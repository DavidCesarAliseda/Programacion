package U5.Entregable2021;

public class main {
    public static void main(String[] args) {





        Juego j1 = new Juego(2019, "Sevilla");

        Pais Espana = new Pais("España", 25);
        Pais China = new Pais("China", 14);
        Pais Japon = new Pais("Japon", 4);

        j1.addPais(Espana);
        j1.addPais(China);
        j1.addPais(Japon);
        //Mostrar paises
        j1.mostrarPaises();
        //Mostrar paises ceremonia
        j1.mostrarPaisesParaCeremonia();

        //Mostrar por edad
        Atletismo a1 = new Atletismo("Atli", "Municipal", 4);

        Atleta at1 = new Atleta("Cain", 18, "Prueba1");
        Atleta at2 = new Atleta("Moises", 34, "Prueba3");
        Atleta at3 = new Atleta("Abel", 19, "Prueba2");
        System.out.println(at1.hacerjuramento());

        a1.addParticipante(at1);
        a1.addParticipante(at2);
        a1.addParticipante(at3);

        a1.mostrarParticipantes();

        //Mostrar por altura
        Baloncesto b1 = new Baloncesto("Baloncesto", "Olimpico");

        Jugador_Baloncesto Jordan = new Jugador_Baloncesto("Jordan", 23, 2.2);
        Jugador_Baloncesto Gasol = new Jugador_Baloncesto("Gasol", 32, 2.1);
        Jugador_Baloncesto Alfonso = new Jugador_Baloncesto("Alfonso", 28, 2.0);
        System.out.println(Gasol.hacerjuramento());

        b1.addParticipante(Jordan);
        b1.quitarParticipantes(Jordan);
        b1.addParticipante(Gasol);
        b1.addParticipante(Alfonso);
        b1.mostrarJugadoresBaloncestoPorAltura();

        System.out.println();

        Judoka ju1 = new Judoka("aaa", 23, 90);
        ju1.luchar();
        at1.correr();
        Alfonso.encestar();









    }
}
