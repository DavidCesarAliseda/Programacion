package U4.T1.Act8;

public class Bombilla {
    /*Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente. Para ello hacer una clase Bombilla con una variable privada que indique si está encencida o apagada,
    así como un método que nos diga el estado de la bombilla. Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas se muestran como apagadas.
    Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se apagan individualmente, pero solo responde si su interruptor particular
    está activado y además hay luz general.*/

    public static boolean interruptorGeneral = true; //static pq es común a todas las bombillas
    private boolean interruptor; //estado de cada bombilla

//Constructor Bombilla
    public Bombilla() {
        setInterruptor(interruptor);
    }

//Interruptor
    public boolean isInterruptor() {
        return interruptor;
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = false;
    }

//Funciones
//Encendido
    public void encender(){
        interruptor=true;
    }
//Apagado
    public void apagar(){
        interruptor=false;
    }
//Estado
    public String estado(){
        String estado;
        if(interruptor && interruptorGeneral){
            estado="Encendida.";
        }else{
            estado="Apagada.";
        }
        return estado;
    }
    //No indica que bombilla, habria que introducir a cada bombilla un ID
    /*public void estado(){
        if(interruptor && interruptorGeneral){
            System.out.println("Encendida");
        }else{
            System.out.println("Apagada");
        }
    }*/
}
