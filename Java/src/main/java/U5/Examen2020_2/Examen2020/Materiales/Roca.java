package U5.Examen2020_2.Examen2020.Materiales;

import U5.Examen2020_2.Examen2020.Material;

public class Roca extends Material implements Mezclar {
    private int dureza;

    public Roca(String nombre, int masa, int capQuemarse, int capDiluirse, boolean esMovil) {
        super(nombre, masa, capQuemarse, capDiluirse, esMovil);
        setDureza(dureza);
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        if (dureza<=100 && dureza>0){
            this.dureza = dureza;
        }
    }

    @Override
    public String toString() {
        return "Roca{" +
                "dureza=" + dureza +
                "} " + super.toString();
    }

    @Override
    public String MezclarConMaterial(Material otro) {
        String resultado="";
        if (otro instanceof Roca){
            resultado= "Roca rocosa";
        }else if (otro instanceof Metal){
            resultado="Roca metalica";
        }else if (otro instanceof Cristal){
            resultado="Roca cristalina";
        }
            return resultado;
    }
}
