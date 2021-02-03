package U5.T1.Act3;

import U5.T1.Act1.Hora;

public class HoraExacta extends Hora {

    protected int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        setSegundos(segundos);
    }

    //Getter and setter
    //Segundos
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos<60) {
            this.segundos = segundos;
        }
    }

    //Metodos
    @Override
    public void inc(){
        segundos++;
        if (segundos >= 60){
            segundos=0;
            super.inc();
        }
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += ":"+segundos;
        return result;

    }
}
