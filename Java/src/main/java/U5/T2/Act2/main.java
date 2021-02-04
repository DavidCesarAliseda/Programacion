package U5.T2.Act2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("53698754C", "Federico", 28, 952);
        Cliente c2 = new Cliente("53698754A", "Pepe", 46, 895);
        Cliente c3 = new Cliente("54961434A", "Marta", 18, 895);
        Cliente c4 = new Cliente("71426416B", "Jose", 92, 895);
        Cliente c5 = new Cliente("58498455Z", "Pablo", 17, 895);

        Cliente[] clientes = new Cliente[5];

        clientes[0]=c1;
        clientes[1]=c2;
        clientes[2]=c3;
        clientes[3]=c4;
        clientes[4]=c5;
        System.out.println(Arrays.toString(clientes));
        System.out.println();

        System.out.println("DNI");
        Arrays.sort(clientes);
        System.out.println(Arrays.toString(clientes));
        System.out.println();

        ComparadorNombre cn = new ComparadorNombre();
        System.out.println("Nombre");
        Arrays.sort(clientes, cn);
        System.out.println(Arrays.toString(clientes));
        System.out.println();

        ComparadorEdad ce = new ComparadorEdad();
        System.out.println("Edad");
        Arrays.sort(clientes, ce);
        System.out.println(Arrays.toString(clientes));




    }
}
