package U6.T3.Act2;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EdadException extends Exception{
    private Integer edad;
    private String dni;

    public EdadException(Integer edad, String dni) {
        super();
        this.dni=dni;
        this.edad = edad;

    }

    @Override
    public String getMessage() {

        String mensaje = "";

        if (edad < 0 || edad > 100) {
            mensaje = "Error, la edad es " + edad + " y no puede ser menor de cero o mayor de 100";

        } else if (edad < 18) {

            mensaje = "Error, la edad es menor";
            System.out.println("Prueba2");
            logMenorEdad();
        }

        return mensaje;
    }

    public void logMenorEdad(){
        System.out.println("Prueba");
        BufferedWriter out = null;
        try {
            Date date = new Date();
            DateFormat meshora = new SimpleDateFormat("dd-MM-yy_HH.mm.ss");
            DateFormat mh = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            String nombre_archivo ="Ficheros//U6//T3//Act2//"+meshora.format(date)+".log";
            System.out.println(nombre_archivo);
            out=new BufferedWriter(new FileWriter(nombre_archivo));
            out.write(mh.format(date)+"-EX002 - MenorDeEdadException: Imposible crear el usuario con dni "+this.dni+".\n"+" El cliente no puede ser menor de edad (Edad indicada: 16)");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
