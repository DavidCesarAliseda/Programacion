package U5.T1.Act7y8;

public class CajaCarton extends Caja{

   private EtiquetaNumerada etiq;
   static double cartonTotal = 0;
   private double area;

    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidades.CM);
        area=2*(ancho*alto+ancho*fondo+alto*fondo);
        cartonTotal+=area;
    }
    //Get and Set
    public static double getCartonTotal() {
        return cartonTotal;
    }

    public static void setCartonTotal(double cartonTotal) {
        CajaCarton.cartonTotal = cartonTotal;
    }

    @Override
    double getVolumen() {
        double volumen;
        if (u == Unidades.M) {
            volumen = this.alto * this.ancho * this.fondo;

        } else {
            volumen = (this.alto * this.ancho * this.fondo)/100;
        }
        return volumen*0.8;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", u=" + u +
                '}';
    }

    void CartonTotal(){
        System.out.println(cartonTotal);
    }
}
