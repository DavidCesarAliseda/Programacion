package U4.T1.Act8;

public class main {
    public static void main(String[] args) {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();

        b1.encender();
        //Una y una
        System.out.println("b1: "+b1.estado());
        System.out.println("b2: "+b2.estado());
        System.out.println();
        //Interuptos apagado, una y una.
        Bombilla.interruptorGeneral = false;
        System.out.println("Se apaga el interruptor general. ");
        System.out.println("b1: "+b1.estado());
        System.out.println("b2: "+b2.estado());
        System.out.println();
        //Una y una
        Bombilla.interruptorGeneral=true;
        System.out.println("Se enciende el interruptor general. ");
        System.out.println("b1: "+b1.estado());
        System.out.println("b2: "+b2.estado());
        System.out.println();
        //Dos encendidas
        b2.encender();
        System.out.println("b1: "+b1.estado());
        System.out.println("b2: "+b2.estado());
        System.out.println();
        //Dos apagadas
        b1.apagar();
        b2.encender();
        System.out.println("b1: "+b1.estado());
        System.out.println("b2: "+b2.estado());
    }
}
