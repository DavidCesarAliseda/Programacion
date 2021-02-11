package U5.Examen2020.Examen2020_2.Materiales;

import U5.Examen2020.Examen2020_2.Material;

public class Metal extends Material implements Mezclar {
    private boolean esImantable;

    public Metal(String nombre, int masa, int capQuemarse, int capDiluirse, boolean esMovil, boolean esImantable) {
        super(nombre, masa, capQuemarse, capDiluirse, esMovil);
        setEsImantable(esImantable);
    }

    public boolean isEsImantable() {
        return esImantable;
    }

    public void setEsImantable(boolean esImantable) {
        this.esImantable = esImantable;
    }

    @Override
    public String toString() {
        return "Metal{" +
                "esImantable=" + esImantable +
                "} " + super.toString();
    }

    @Override
    public String MezclarConMaterial(Material otro) {
        String resultado="";
        if (otro instanceof Roca){
            resultado= "Metal rocoso";
        }else if (otro instanceof Metal){
            resultado="Metalica";
        }else if (otro instanceof Cristal){
            resultado="Metal cristalino";
        }
        return resultado;
    }
}
