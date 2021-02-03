package U5.T1.Act1;

public class main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23, 59);
        System.out.println(h1.toString());
        h1.inc();
        System.out.println(h1.toString());
        h1.inc();
        System.out.println(h1.toString());
    }
}
