package u2.T4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Ej5 {
    //Escribe un programa que muestre la hora actual.
    public static void main ( String args[] ){
    Date date = new Date();
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        System.out.print("Son las "+hora.format(date)+".");




    /*También se podría con;
    importando: import java.time.LocalTime;
         localTime hora = LocalTime.now();
         System.out.print("Son las "+hora+".");
    */

    }
}



