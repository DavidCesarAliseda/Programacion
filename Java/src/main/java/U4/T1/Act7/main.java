package U4.T1.Act7;

public class main {
    /*Actividad 7: Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
     concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down) la
     frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
     Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al inicio,
     el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se sobrepasa uno de los
     dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario. Escribir un pequeño
     programa principal para probar su funcionamiento.*/
    public static void main(String[] args) {

        SintonizadorDigital s1 = new SintonizadorDigital();

        s1.display();
        s1.down();
        s1.display();
        s1.up();
        s1.display();
    }
}
