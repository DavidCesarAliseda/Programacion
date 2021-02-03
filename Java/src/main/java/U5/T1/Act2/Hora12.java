package U5.T1.Act2;

import U5.T1.Act1.Hora;

public class Hora12 extends Hora {

    protected Franja franja;

    public Hora12(int hora, int minuto, Franja franja) {
        super(hora, minuto);
        setHora(hora);
        setFranja(franja);
    }

    //Getter and setter
    //Franja
    public Franja getFranja() {
        return franja;
    }

    public void setFranja(Franja franja) {
        this.franja = franja;
    }



    //Metodos
    @Override
    public void setHora(int hora) {
        if (1<=hora && hora<=12) {
            this.hora = hora;
        }else{
           this.hora=1;
        }

    }

    @Override
    public void inc(){
        super.inc();
        if (hora>12){
            hora=1;
            franja=franja==Franja.AM?Franja.PM:Franja.AM; //mayor=(x>y)?x:y;
        }
    }

    @Override
    public String toString() {
        String result;
        result = super.toString();
        result+= " "+franja;
        return result;
    }
}
