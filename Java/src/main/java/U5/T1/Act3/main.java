package U5.T1.Act3;

public class main {
    public static void main(String[] args) {
        HoraExacta hexact = new HoraExacta(23, 59, 50);
        System.out.println(hexact);
        for (int i = 1; i <=20 ; i++) {
            hexact.inc();
        }
        System.out.println(hexact.toString());
    }
}
