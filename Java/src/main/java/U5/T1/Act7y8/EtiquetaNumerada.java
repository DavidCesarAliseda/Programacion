package U5.T1.Act7y8;

public class EtiquetaNumerada extends Etiqueta{
    private int num;

    public EtiquetaNumerada(String nombre_destinatario, String direccion, int num) {
        super(nombre_destinatario, direccion);
        setNum(num);
    }
    //Get and Set
    //Num
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
