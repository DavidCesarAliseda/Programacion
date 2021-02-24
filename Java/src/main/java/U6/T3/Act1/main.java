package U6.T3.Act1;

public class main {
    public static void main(String[] args) {
        //
        try {
            Cliente c1 = new Cliente( 14);
        } catch (EdadException e) {
            System.out.println(e.getMessage());
        }
    }
}
