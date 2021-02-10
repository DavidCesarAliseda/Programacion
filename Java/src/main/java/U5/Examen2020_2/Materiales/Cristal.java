package U5.Examen2020_2.Materiales;

import U5.Examen2020_2.Material;

public class Cristal extends Material implements Mezclar {
    private Tipo_Cristal tipo_cristal;

    public Cristal(String nombre, int masa, int capQuemarse, int capDiluirse, boolean esMovil, Tipo_Cristal tipo_cristal) {
        super(nombre, masa, capQuemarse, capDiluirse, esMovil);
        setTipo_cristal(tipo_cristal);
    }


    //Get y Set
    public Tipo_Cristal getTipo_cristal() {
        return tipo_cristal;
    }

    public void setTipo_cristal(Tipo_Cristal tipo_cristal) {
        this.tipo_cristal = tipo_cristal;
    }
    //Metodos

    @Override
    public String toString() {
        return "Cristal{" +
                super.toString() +
                "tipo_cristal=" + tipo_cristal +
                '}';
    }

    @Override
    public String MezclarConMaterial(Material otro) {
        String resultado="";
        if (otro instanceof Roca){
            resultado= "Cristal rocoso";
        }else if (otro instanceof Metal){
            resultado="Cristal metalero";
        }else if (otro instanceof Cristal){
            resultado="Cristal blindado";
        }
        return resultado;
    }
}
