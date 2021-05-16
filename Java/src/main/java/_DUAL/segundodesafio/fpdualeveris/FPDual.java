package _DUAL.segundodesafio.fpdualeveris;

import _DUAL.segundodesafio.operators.City;
import _DUAL.segundodesafio.operators.Operator;
import _DUAL.segundodesafio.operators.Pinball;
import _DUAL.segundodesafio.operators.Player;

/**
 * Clase principal donde se ejecuta el programa.
 * @author David Cesar Fernandez Aliseda
 */

public class FPDual {
    public static void main(String[] args) {
        operatorsChallenge();
    }

    /**
     * Metodo para ejecutar el programa.
     */

    private static void operatorsChallenge(){
        Operator o1 = new Operator("Pepe",52, City.MALAGA);
        Player player1 = new Player("Dani",16);
        Pinball p1 = new Pinball();
        p1.playGame(o1);
        p1.playGame(player1);
        p1.playGame(player1);
    }
}
