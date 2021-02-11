package U5.Examen2020.Examen2020_2.Materiales;

import U5.Examen2020.Examen2020_2.Material;

public abstract class Herramienta extends Material {

    public Herramienta(String nombre, int masa, int capQuemarse, int capDiluirse, boolean esMovil) {
        super(nombre, masa, capQuemarse, capDiluirse, esMovil);
    }

}
