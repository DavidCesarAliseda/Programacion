package U4.Entregable_2020;

import java.util.Arrays;

public class Pizza {

    private int indice_ingrediente = 0;
    private Ingrediente[] ingredientes;
    private Size tamanyo;


    public Pizza() {
        setTamanyo(Size.FAMILIAR);
        setIndice_ingrediente(0);
        ingredientes = new Ingrediente[0];
    }

    public Pizza(Size tamanyo) {
        setIndice_ingrediente(0);
        setTamanyo(tamanyo);
        ingredientes = new Ingrediente[0];
    }



    //Getter and setter
    //INdice
    public int getIndice_ingrediente() {
        return indice_ingrediente;
    }

    public void setIndice_ingrediente(int indice_ingrediente) {
        this.indice_ingrediente = indice_ingrediente;
    }

    //Tamaño
    public Size getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(Size tamanyo) {
        this.tamanyo = tamanyo;
    }

    //Metodos
    public int num_ingredientes() {
        return indice_ingrediente;
    }

    public static void mostrar_tamanyos() {
        for (Size s : Size.values()) {
            System.out.println(s);
        }
    }

    public boolean add_ingrediente(Ingrediente ingredientes) {
        if (indice_ingrediente < 3) {
            this.ingredientes = Arrays.copyOf(this.ingredientes, this.ingredientes.length+1);
            this.ingredientes[indice_ingrediente++]=ingredientes;
        }
        return indice_ingrediente != 3;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "Los ingredientes son " + Arrays.toString(ingredientes) +
                ", tamanyo=" + tamanyo +
                '}';
    }
}
