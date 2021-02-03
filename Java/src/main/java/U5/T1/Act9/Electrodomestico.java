package U5.T1.Act9;

public class Electrodomestico {
    protected int precio_base;
    protected Tipo_Color color;
    protected Tipo_Consumo_Energetico consumo_energetico;
    protected int peso;

    public Electrodomestico() {
        setPrecio_base(100);
        setColor(Tipo_Color.BLANCO);
        setConsumo_energetico(Tipo_Consumo_Energetico.F);
        setPeso(5);
    }

    public Electrodomestico(int precio_base, int peso) {
        setPrecio_base(precio_base);
        setPeso(getPeso());
        setColor(Tipo_Color.ROJO);
        setConsumo_energetico(Tipo_Consumo_Energetico.C);
    }

    public Electrodomestico(int precio_base, Tipo_Color color, Tipo_Consumo_Energetico consumo_energetico, int peso) {
        setPrecio_base(precio_base);
        setPeso(getPeso());
        setColor(color);
        setConsumo_energetico(consumo_energetico);
    }

    //Get and Set
    public int getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    public Tipo_Color getColor() {
        return color;
    }

    public void setColor(Tipo_Color color) {
        this.color = color;
    }

    public Tipo_Consumo_Energetico getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(Tipo_Consumo_Energetico consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Metodos

    int getPrecioFinal(){

        switch(consumo_energetico){
            case A:
                precio_base+=100;
                break;
            case B:
                precio_base+=80;
                break;
            case C:
                precio_base+=60;
                break;
            case D:
                precio_base+=50;
                break;
            case E:
                precio_base+=30;
                break;
            case F:
                precio_base+=10;
                break;
        }

        if(peso>=0 && peso<19){
            precio_base+=10;
        }else if(peso>=20 && peso<49){
            precio_base+=50;
        }else if(peso>=50 && peso<=79){
            precio_base+=80;
        }else if(peso>=80){
            precio_base+=100;
        }

        return precio_base;
    }

    @Override
    public String toString() {
        getPrecioFinal();
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                ", precio=" + precio_base +
                '}';
    }
}
