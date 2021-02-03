package U5.T1.Act9;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
        setCarga(35);
        setPrecio_base(100);
        setColor(Tipo_Color.BLANCO);
        setConsumo_energetico(Tipo_Consumo_Energetico.F);
        setPeso(5);
    }

    public Lavadora(int precio_base, int peso, int carga) {
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
}
