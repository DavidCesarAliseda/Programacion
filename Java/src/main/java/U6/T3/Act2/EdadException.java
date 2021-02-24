package U6.T3.Act2;

public class EdadException extends Exception{
    private Integer edad;

    public EdadException(Integer edad) {
        super();
        this.edad = edad;
    }

    @Override
    public String getMessage() {

        String mensaje = "";

        if (edad < 0 || edad > 100) {
            mensaje = "Error, la edad es " + edad + " y no puede ser menor de cero o mayor de 100";
        } else if (edad < 18) {
            mensaje = "Error, la edad es menor";
        }

        return mensaje;
    }
}
