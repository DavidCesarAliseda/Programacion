package U5.T1.Act9;

import U4.Entregable_2021.CompararPrecioFinal;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico();
        //System.out.println(e);
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora(100, Tipo_Color.GRIS, Tipo_Consumo_Energetico.D, 60, 90);
        Lavadora l3 = new Lavadora(100, Tipo_Color.GRIS, Tipo_Consumo_Energetico.A, 200, 90);

        //System.out.println(l1.compareTo(l2));

        Lavadora[] lavadoras = new Lavadora[3];
        lavadoras[0]=l1;
        lavadoras[1]=l3;
        lavadoras[2]=l2;

        System.out.println(Arrays.toString(lavadoras));
        Arrays.sort(lavadoras);
        System.out.println(Arrays.toString(lavadoras));
        System.out.println();
        CompararPrecioFinal cpf = new CompararPrecioFinal();
        System.out.println(Arrays.toString(lavadoras));
        Arrays.sort(lavadoras, cpf);
        System.out.println(Arrays.toString(lavadoras));

        Arrays.sort(lavadoras, cpf.reversed());
        System.out.println(Arrays.toString(lavadoras));



    }
}
