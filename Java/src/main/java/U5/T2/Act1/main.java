package U5.T2.Act1;

public class main {
    public static void main(String[] args) {
        PilaLista pl = new PilaLista();

        for (int i = 1; i < 11; i++) {
            pl.apilar(i);
        }

        for (int i = 0; i < 10; i++) {
            pl.desapilar();
        }

        System.out.println("<----------------------->");
        PilaTabla pt = new PilaTabla();

        for (int i = 1; i < 11; i++) {
            pt.apilar(i);
        }

        for (int i = 1; i < 11; i++) {
            pt.desapilar();
        }


    }
}
