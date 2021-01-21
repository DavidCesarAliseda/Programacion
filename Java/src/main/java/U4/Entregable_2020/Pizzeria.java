package U4.Entregable_2020;

import java.util.Arrays;

public class Pizzeria {

    private Pedido[] pedidos;
    private int ind_pedidos;
    private final int tam_inicial=5;

    public Pizzeria() {

        setInd_pedidos(0);
        pedidos = new Pedido[0];

    }

    public int getCont_pedidos() {
        return ind_pedidos;
    }

    public void setInd_pedidos(int ind_pedidos) {
        this.ind_pedidos = ind_pedidos;
    }

    //Metodos
    //Añadir pedidos
    public void add_pedido(Pedido pedidos) {
        if (ind_pedidos <= 5) {
            this.pedidos = Arrays.copyOf(this.pedidos, this.pedidos.length+1);
        }
        this.pedidos[ind_pedidos++]=pedidos;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "pedidos=" + Arrays.toString(pedidos) +
                '}';
    }

    public void mostrar_numpedidos(){
        System.out.println("Se han realizado "+ind_pedidos+" pedidos.");
    }
}
