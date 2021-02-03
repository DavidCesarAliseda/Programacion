package U5.T1.Act2;

import U5.T1.Act1.Hora;

public class main {
    public static void main(String[] args) {
        Hora12 h12 = new Hora12(12, 30, Franja.PM);
        System.out.println(h12.toString());
        for (int i = 1; i <= 60; i++) {
            h12.inc();
        }
        System.out.println(h12.toString());
    }
}
