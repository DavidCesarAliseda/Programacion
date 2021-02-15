package U5.Examen2021;

import java.util.Objects;

public class Prenda implements Devolver, Doblar{
    /*Prendas de ropa viene identificadas por el precio, por el nombre,por su código de barras, su peso.*/
    private int precio;
    private String nombre;
    private long codigoBarras;
    private double peso;
    private static int contPrendas=0;

    public Prenda(int precio, String nombre, long codigoBarras, double peso) {
       setCodigoBarras(codigoBarras);
        setNombre(nombre);
        setPrecio(precio);
        setPeso(peso);
        contPrendas++;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void mostrarNumPrendas(){
        System.out.println("El numero de prendas es: "+contPrendas);
    }


    @Override
    public void devolver() {
        System.out.println("Devolviendo la prensa con nombre "+this.nombre+" y precio "+this.precio);
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.nombre+" se puede doblar");
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigoBarras=" + codigoBarras +
                ", peso=" + peso +
                '}';
    }
}

