package U5.T1.Act7y8;

public class main {
    public static void main(String[] arga){
        Caja a = new CajaCarton(100,200,200);
        System.out.println(a);
        System.out.println(a.getVolumen());

        CajaCarton b = new CajaCarton(100, 200 ,200);
        CajaCarton c = new CajaCarton(100, 200 ,200);
        c.CartonTotal();
    }
}
