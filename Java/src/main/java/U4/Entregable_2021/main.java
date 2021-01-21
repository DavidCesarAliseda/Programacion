package U4.Entregable_2021;

public class main {
    public static void main(String[] args) {
        Videojuegos partida1 = new Videojuegos();
        TipoEnemigos enemigos[] = {TipoEnemigos.Coconuts, TipoEnemigos.MotoBug, TipoEnemigos.BuzzBomber, TipoEnemigos.CrabMeat};
        Escenario esc2 = new Escenario(enemigos);
        Personaje Tails = new Personaje(TipoPersonajes.Tails);
        Videojuegos partida2 = new Videojuegos(esc2, Tails);
        esc2.generar_enemigo();
        esc2.generar_enemigo();
        esc2.generar_enemigo();
        esc2.generar_enemigo();
        esc2.generar_enemigo();
        System.out.println(partida2.toString());
        esc2.eliminar_enem(2);
        System.out.println(partida2.toString());
        esc2.mostrarnum_enem();













        /*Personaje Sonic = new Personaje();
        System.out.println(Sonic.toString());

        Enemigo e1 = new Enemigo(TipoEnemigos.Chopper);
        e1.restar_vida(110);
        System.out.println(e1.toString());

        TipoEnemigos[] tip1 = {TipoEnemigos.MotoBug, TipoEnemigos.Coconuts};
        Escenario esc1 = new Escenario(tip1);
        esc1.generar_enemigo();
        esc1.generar_enemigo();
        esc1.generar_enemigo();
        System.out.println(esc1.toString());
        esc1.eliminar_enem(1);
        System.out.println(esc1.toString());
        Videojuegos v1 = new Videojuegos();
        System.out.println(v1);
        v1.accedeIP();
        v1.modificarIP("2.658");
        v1.accedeIP();*/
    }
}
