package U4.Entregable_2020;

import java.util.Date;

public class Pedido {
    private Pizza pizza;
    private Date fecha = new Date();

    public Pedido(Pizza pizza) {
        setPizza(pizza);
        setFecha(fecha);
    }

    //Getter and setter
    //Pizza
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    //Fecha
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Metodos

    @Override
    public String toString() {
        return "Pedido{" +
                "pizza=" + pizza +
                ", fecha=" + fecha +
                '}';
    }
}
