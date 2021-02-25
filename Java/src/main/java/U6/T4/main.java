package U6.T4;

public class main {
    public static void main(String[] args) {

        try {
            Libro l = new Libro("David Safier", "28 Dias");
            Libro l1 = new Libro("David Safier", "28 Dias");
            System.out.println(l.toString());
            System.out.println(l.equals(l1));
        } catch (ExcepcionAutor excepcionAutor) {
            excepcionAutor.printStackTrace();
        }


    }
}
