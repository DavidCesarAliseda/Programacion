package U5.T1.Act4;

public class main {
    public static void main(String[] args) {
        HoraExacta hexact = new HoraExacta(23, 59, 50);
        System.out.println(hexact);
        for (int i = 1; i <=20 ; i++) {
            hexact.inc();
        }
        System.out.println(hexact.toString());

        HoraExacta hexact1 = new HoraExacta(23, 59, 50);
        HoraExacta hexact2 = new HoraExacta(23, 29, 50);
        HoraExacta hexact3 = new HoraExacta(23, 59, 50);
        System.out.println(hexact1.equals(hexact2));
        System.out.println(hexact1.equals(hexact3));
    }
}
