package _DUAL.segundodesafio.operators;

import java.util.Scanner;

/**
 * Esta clase define el objeto Pinball el cual representa una maquina para jugar al Pinball.
 * @author David Cesar Fernandez Aliseda
 * @version 14/05/21/A
 */

public class Pinball {
    private static long RECORD = 0;
    private long score;
    private boolean isGaming;

    /**
     * Constructor para Pinball
     */

    public Pinball() {
        setScore(0);
        setGaming(false);
    }

    public static long getRECORD() {
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
        setScore(0);
        startGame(player);

        if (isGaming){
            gaming();
            Player player1 = (Player) player;
            player1.setNewPersonalRecord(score);
        }
    }

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

        System.out.print("GAME OVER. ");
        System.out.println("Has conseguido: "+score+" puntos.");
        checkRecord();

    }

    /**
     * Metodo con la parte superior del juego
     */

    private void topGame(){
        int randomNum=generateRandomNumber(0,100);
        int maxPoint=50;
        int minPoint=25;

       if (randomNum<=75){
           score+=minPoint;
           System.out.println("+25");
       }else if(randomNum<=95){
           score+=maxPoint;
           System.out.println("+50");
       }else{
           int points;
           for (int i = 0; i < generateRandomNumber(0,50); i++) {
               points=generateRandomNumber(10,50);
               score+=points;
               System.out.println("+"+points);
           }
       }
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
        String side;

        if (result<=4){//80% posibilidad de caer
            System.out.println("+40");
            score+=minPoint;
            //insertar topgame
        }else{
            System.out.println("+250");
            score+=maxPoint;
        }
        showScore();
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
            int point;
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
            do{
                System.out.println("Inserte la palanca que desea accionar: izq/der");
                Scanner sc = new Scanner(System.in);
                side = sc.nextLine();
            }while(!side.equals("izq") && !side.equals("der"));
            side = (side.equals("izq")?"izquierda":"derecha");

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
        System.out.println("Puntuacion: "+score);
    }

    /**
     * Metodo para comprobar si se ha superado el record local
     * @return si ha superado o no el record.
     */
    private boolean checkRecord(){
        boolean newRecord = Boolean.FALSE;
        if (score>RECORD){
            newRecord= Boolean.TRUE;
            changeRecord(score);
            System.out.println("Has conseguido un nuevo record local!!!");
        }else{
            System.out.println("Te has quedado a "+(RECORD-score)+" puntos del record.");
        }

        return newRecord;
    }

    private static void changeRecord(long score){
        RECORD=score;
    }
}
