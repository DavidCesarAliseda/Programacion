package U4.T1.Act6;

public class Banco {
    /*Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. Los bancos tienen las siguientes restricciones:

a) Siempre tienen que tener un nombre, que no puede ser modificado

b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros al crearse.

c) El capital y la dirección de un banco son modificables.

Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que pertenece
(cambiar de banco, mostrar la info de la cuenta, incluídos los datos del banco si lo tiene vinculado).
Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún banco.*/

    final private String nombre;
    double capital = 5.2;
    String direccion;

    //Constructor
    public Banco(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Banco(String nombre, double capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public void Info() {
        System.out.println("Informacion del banco");
        System.out.println(" Banco: "+nombre);
        System.out.println(" Capital: "+capital+" millones de euros.");
        System.out.println(" Direccion: "+direccion);
        System.out.println();
    }


}
