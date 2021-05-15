package _DUAL.segundodesafio.operators;

import java.util.Scanner;

/**
 * Esta clase define el objeto Pinball el cual representa una maquina para jugar al Pinball.
 * @author David Cesar Fernandez Aliseda
 * @version 14/05/21/A
 */

public class Pinball {
    private final static int RECORD = 0;
    private long score;
    private boolean isGaming;

    /**
     * Constructor para Pinball
     */

    public Pinball() {
        setScore(0);
        setGaming(false);
    }

    public static int getRECORD() {
        return RECORD;
    }

    public long getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isGaming() {
        return isGaming;
    }

    public void setGaming(boolean gaming) {
        isGaming = gaming;
    }

    /**
     * Metodo para jugar en la maqiona
     * @param player el parametro representa la persona que va a jugar
     */

    public void playGame(Person player){
        startGame(player);

        if (isGaming){
            gaming();
        }

    }
    //Comenzar la partida

    /**
     * Metodo para iniciar la partida
     * @param player el parametro representa la persona que va a jugar
     */

    private void startGame(Person player) {
        try {
            if (player instanceof Player){
                Scanner sc = new Scanner(System.in);
                System.out.println(player.getName()+" ¿Quiere comenzar la partida? s/n");
                String answer = sc.nextLine();

                if (answer.equals("s")) {
                    setGaming(true);
                    System.out.println("La partida a comenzado.");

                }else {
                    System.out.println("La partida no ha comenzado. Hasta pronto!!");
                }
            }else{
                System.out.println("Deja de jugar y a trabajar!!");
            }

        } catch (Exception e) {
            System.out.println("Entrada no valida.");
        }
    }
    //Jugando

    /**
     * Metodo con la evolucion del juego
     */

    private void gaming(){
        while(isGaming){
            midGame();
            showScore();
            botGame();
            showScore();
            topGame();
            showScore();
        }
        System.out.println("GAME OVER");
        System.out.println("Has conseguido "+score+", ¡Bien jugado!");
    }

    /**
     * Metodo con la parte superior del juego
     */

    private void topGame(){
       /* if (generateRandomNumber(0,100)){


        }*/
    }

    /**
     * Metodo con la parte central del juego
     */

    private void midGame(){
        int result = generateRandomNumber(0, 5);
        int maxPoint=500;
        int minPoint=200;

        if (result<=1){//20% posibilidad de caer
            System.out.println("+200");
           score+=minPoint;
           //insertar topgame
        }else if(result>=4){//80% posibilidad de caer
            score+=maxPoint;
            System.out.println("+500");
        }
    }

    /**
     * Metodo con la parte inferior del tablero
     */

    private void botGame(){
        int result = generateRandomNumber(0, 5);
        int maxPoint=250;
        int minPoint=40;
        String side ="";

        if (result<=4){//80% posibilidad de caer
            System.out.println("+40");
            score+=minPoint;
            //insertar topgame
        }else{
            System.out.println("+250");
            score+=maxPoint;
        }

        //Palancas
        result = generateRandomNumber(0, 1);
        side = (result<1?"izquierda":"derecha");//izquierda=0

        switch (side){
            case "izquierda":
                System.out.println("La bola viene por la izquierda.");
                break;
            case "derecha":
                System.out.println("La bola viene por la derecha.");
                break;
        }

        if (!playerReaction().equals(side) || generateRandomNumber(0, 5)<1) {
            setGaming(false);
            System.out.println("Has fallado!!");
        }else{
            int point = 0;
            for (int i = 0; i < generateRandomNumber(0, 10); i++) {
                point =+generateRandomNumber(0, 3)*5;
                score+=point;
                System.out.println("+"+point);
            }
            System.out.println("Le has dado!!");
        }


    }

    /**
     * Metodo para que el jugador accione las palancas
     * @return palanca que acciona
     */

    private String playerReaction(){
        String side = "";
        try {
            System.out.println("Inserte 0 para accionar la izquierda y 1 para accionar derecha.");
            Scanner sc = new Scanner(System.in);
            int dir = sc.nextInt();
            side = (dir<1?"izquierda":"derecha");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return side;
    }

    /**
     * Metodo para generar numeros enteros aleatorios entre dos limites dados
     * @param minNum Parametro que representa el limite inferior
     * @param maxNumber Parametro que representa el limite superior
     * @return numero entero aleatorio
     */

    private int generateRandomNumber(int minNum, int maxNumber){
        return (int)(Math.round((Math.random() * (maxNumber-minNum)+minNum)));
    }

    /**
     * Metodo para enseñar la puntuación de la partida al jugador
     */

    private void showScore(){
        System.out.println("Puntuacion: "+getScore());
    }
}
