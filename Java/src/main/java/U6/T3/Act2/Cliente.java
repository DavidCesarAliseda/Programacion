package U6.T3.Act2;

public class Cliente {
    private int edad;
    private String dni;

    public Cliente(int edad, String dni) throws EdadException {
        setDni(dni);
        setEdad(edad);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadException {
        if (edad < 0 || edad > 100) {
            throw new EdadException(edad, dni);
        } else if (edad < 18) {
            throw new EdadException(edad, dni);
        }
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
