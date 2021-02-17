package U5.Examen2021;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Prenda prenda1 = new Prenda(12, "Camiseta", 789654, 1.2);
        Prenda prenda2 = new Prenda(12, "Abrigo", 7453128, 5);
        Prenda prenda3 = new Prenda(12, "Pantalon", 34272, 4);
        System.out.println(prenda1.toString());
        System.out.println("Prenda");
        //Devolver
        prenda1.devolver();
        //Doblar
        prenda2.doblar();
        Prenda.mostrarNumPrendas();
        System.out.println();

        PrendaColgada PC1 = new PrendaColgada(45, "Chaqueton", 89845, 1.5, 0.9);
        PrendaColgada PC2 = new PrendaColgada(45, "Chaqueton", 89845, 1.5, 1.0);
        PrendaColgada PC3 = new PrendaColgada(45, "Chaqueton", 89845, 1.5, 2.0);
        System.out.println(PC1.toString());
        System.out.println("PrendaColgada");
        //Devolver
        PC1.devolver();
        //Doblar
        PC3.doblar();
        //Colgar
        PC2.colgar();
        Prenda.mostrarNumPrendas();

        System.out.println();


        Conductor Chofer = new Conductor("Pepe", "Gomez", 789654312);
        System.out.println(Chofer.toString());;
        CamionCajas cc1 = new CamionCajas(789, 45, Chofer, 13);
        Caja c1 = new Caja(123);
        Caja c2 = new Caja(245);
        Caja c3 = new Caja(63);

        //Prendas y Cajas
        System.out.println(c1.toString());
        c1.addPrenda(prenda1);
        c1.addPrenda(prenda2);
        System.out.println(c1.toString());
        c1.quitarPrenda(prenda1);
        System.out.println(c1.toString());
        System.out.println();
        //C1 1 Prenda
        //C2 3 Prendas
        c2.addPrenda(prenda1);
        c2.addPrenda(prenda2);
        c2.addPrenda(prenda3);
        //c3 5 prendas
        c3.addPrenda(prenda3);
        c3.addPrenda(prenda3);
        c3.addPrenda(prenda3);
        c3.addPrenda(prenda3);
        c3.addPrenda(prenda3);
        System.out.println();
        System.out.println(c3.toString());

        //Cajas y camiones
        System.out.println("cc1"+cc1.toString());
        cc1.addCaja(c1);
        cc1.addCaja(c2);
        cc1.addCaja(c3);
        cc1.addCaja(c3);
        System.out.println(cc1.toString());
        cc1.quitarCaja(c2);
        System.out.println(cc1.toString());
        cc1.descargar();
        System.out.println();

        //PrendaColgada y Camiones
        CamionPerchas cp1 = new CamionPerchas(789, 45, Chofer, 13);
        cp1.addPrenda(PC1);
        cp1.addPrenda(PC1);
        cp1.addPrenda(PC2);
        cp1.addPrenda(PC3);
        cp1.quitarPrenda(PC1);
        System.out.println(cp1.toString());
        cp1.descargar();

        //Comparadores
        //CamionCaja por cajas
        CamionCajas cc2 = new CamionCajas(12, 55, Chofer, 23);
        cc2.addCaja(c3);

        CamionCajas cc3 = new CamionCajas(759, 15, Chofer, 1);
        cc3.addCaja(c3);
        cc3.addCaja(c3);
        cc3.addCaja(c3);

        Camion[] camionscaja = new Camion[3];
        camionscaja[0]=cc1;
        camionscaja[1]=cc2;
        camionscaja[2]=cc3;

        for (int i = 0; i < 3; i++) {
            System.out.println(camionscaja[i].toString());
        }

        Arrays.sort(camionscaja);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(camionscaja[i].toString());
        }

        Arrays.sort(camionscaja, new ComparatorPesoCamionCaja());

        for (int i = 0; i < 3; i++) {
            System.out.println(camionscaja[i].toString());
        }

        Camion[] camionp1 = new Camion[3];
        CamionPerchas cp2 = new CamionPerchas(789, 45, Chofer, 17);
        CamionPerchas cp3 = new CamionPerchas(41, 45, Chofer, 12);
        CamionPerchas cp4 = new CamionPerchas(759, 45, Chofer, 28);
        camionp1[0]=cp2;
        camionp1[1]=cp3;
        camionp1[2]=cp4;

        cp2.addPrenda(PC1);
        cp2.addPrenda(PC1);
        cp2.addPrenda(PC1);
        cp2.addPrenda(PC1);

        cp2.addPrenda(PC1);
        cp2.addPrenda(PC1);
        cp2.addPrenda(PC1);

        cp2.addPrenda(PC1);
















    }
}
