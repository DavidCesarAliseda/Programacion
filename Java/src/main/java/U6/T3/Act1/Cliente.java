package U6.T3.Act1;

public class Cliente {
    private int edad;

    public Cliente(int edad) throws EdadException {
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadException {
        if (edad < 0 || edad > 100) {
            throw new EdadException(edad);
        } else if (edad < 18) {
            throw new EdadException(edad);
        }
        this.edad = edad;
    }
}
