package U6.T2;

import U4.T1.Act9.Maquinaria.Locomotora;
import U4.T1.Act9.Maquinaria.Tren;
import U4.T1.Act9.Personal.Maquinista;
import U4.T1.Act9.Personal.Mecanico;
import U4.T1.Act9.Personal.tipo_especialidad;

import java.io.*;

public class Act9 {
    /* Crear un fichero binario e insertar varios objetos de tipo Tren. Cerrar el fichero y leerlo a continuación, mostrándo los objetos por pantalla*/
    public static void main(String[] args) throws IOException {
        Mecanico m = new Mecanico("pepe", 987654, tipo_especialidad.HIDRAULICA);
        Locomotora l = new Locomotora("987654", 75, 1996,m);
        Maquinista maq= new Maquinista("jose", "987654", 0.9,5);
        Tren t1 = new Tren(l, maq);
        Tren t2 = new Tren(l, maq);
        Tren t3 = new Tren(l, maq);
        Tren t4 = new Tren(l, maq);
        Act9.insertarTren(t1);
        Act9.readObject();

    }
    static void insertarTren(Tren t){
        ObjectOutputStream out = null;
        try{
            out= new ObjectOutputStream(new FileOutputStream("Ficheros//U6//T2//Act9//trenes.dat"));
            out.writeObject(t);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static void readObject() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("Ficheros//U6//T2//Act9//trenes.dat"));
            while (true){
                System.out.println(in.readObject());
            }
        } catch (EOFException ex){
            System.out.println("Fin del fichero");
            in.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
