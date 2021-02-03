package U5.T1.Act1;

public class Hora{
    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    //Getter and setter
    //Hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora<24 && hora>=0) {
            this.hora = hora;
        }else{
            System.out.println("Hora no valida.");
        }
    }
    //Minuto
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto>=0 && minuto<60) {
            this.minuto = minuto;
        }else{
            System.out.println("Minutos no validos.");
        }
    }

    //Metodos
    //Incrementar en un min
    public void inc(){
        this.minuto++;
        if (minuto>=60){
            hora++;
            minuto=0;
            if (hora>=24){
                hora=0;
            }
        }
    }
    @Override
    public String toString() {
        return "Hora: " + hora + ":" + minuto;
    }
}
