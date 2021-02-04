package U5.T2.Act2;
/*Diseñar la clase Cliente con los siguientes atributos: dni, nombre, edad y saldo.
Implementar un constructor y los métodos toString() y equals() (este último basado en el dni).
Implementar la interfaz Comparable con un criterio de ordenación basado también en el dni*/

import java.util.Objects;

public class Cliente implements Comparable{
    private String dni;
    private String nombre;
    private int edad;
    private int saldo;

    //Constructor
    public Cliente(String dni, String nombre, int edad, int saldo) {
        setDni(dni);
        setNombre(nombre);
        setEdad(edad);
        setSaldo(saldo);
    }

    //Get an set
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //Metodos

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int compareTo(Object o) {
        int resultado;
        Cliente otro = (Cliente) o;

        return this.getDni().compareTo(otro.getDni());
    }
}
