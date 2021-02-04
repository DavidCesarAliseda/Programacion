package U5.T1.Act9;

public class Lavadora extends Electrodomestico implements Comparable{
    private int carga;

    public Lavadora() {
        setCarga(5);
        setPrecio_base(100);
        setColor(Tipo_Color.BLANCO);
        setConsumo_energetico(Tipo_Consumo_Energetico.F);
        setPeso(5);
    }

    public Lavadora(int precio_base, int peso) {
        super(precio_base, peso);
        setCarga(5);
        setColor(Tipo_Color.AZUL);
        setConsumo_energetico(Tipo_Consumo_Energetico.D);
    }

    public Lavadora(int precio_base, Tipo_Color color, Tipo_Consumo_Energetico consumo_energetico, int peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        setCarga(carga);
    }

    //Get and Set
    //Carga
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //Metodos
    @Override
    public int getPrecioFinal(){
        int precio_final=0;

        precio_final=super.getPrecioFinal();
        if (carga>30){
            precio_final+=50;
        }

        return precio_final;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio_base=" + this.precio_base +
                ", color=" + this.color +
                ", consumo_energetico=" + this.consumo_energetico +
                ", peso=" + this.peso +
                ", carga=" + this.carga +
                ", precio=" + this.getPrecioFinal() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int resultado;
        Lavadora otro = (Lavadora) o;
        if (this.carga > otro.carga){
            resultado=1;
        }else if (this.carga < otro.carga){
            resultado=-1;
        }else{
            resultado=0;
        }

        return resultado;
    }
}
