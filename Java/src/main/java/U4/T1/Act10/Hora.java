package U4.T1.Act10;

public class Hora {
    private int hora;
    private int min;
    private int sec;

    public Hora(int hora, int min, int sec) {
        setHora(hora);
        setMin(min);
        setSec(sec);
    }
    //Get an Setter
    //Hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora>=0 && hora<24){
            this.hora = hora;
        }else{
            this.hora=0;
        }
    }
    //Min
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(0 <= min && min <=60){
            this.min = min;
        }else{
            this.min=0;
        }
    }
    //Sec
    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if(0 <= sec && sec <=60){
            this.sec = sec;
        }else{
            this.sec=0;
        }
    }

    public void sumaSegundos(){
        sec++;
        if (sec == 60){
            sec=0;
            min++;
            if(min==60){
                min=0;
                hora++;
                if (hora == 24){
                    hora=0;
                }
            }
        }
    }
    public void muestraHora(){
        System.out.println("Son las: "+this.hora+":"+this.min+":"+this.sec);
    }
}
