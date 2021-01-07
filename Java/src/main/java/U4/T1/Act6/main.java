package U4.T1.Act6;

public class main {
    /*Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. Los bancos tienen las siguientes restricciones:

a) Siempre tienen que tener un nombre, que no puede ser modificado

b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros al crearse.

c) El capital y la dirección de un banco son modificables.

Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que pertenece
(cambiar de banco, mostrar la info de la cuenta, incluídos los datos del banco si lo tiene vinculado).
Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún banco.*/
    public static void main(String[] args) {
        //Banco

        Banco Bancolega = new Banco ("Bancolega", "Calle Ratero N21");

        Banco Bankillo = new Banco ("Bankillo", 8, "Calle Ruina SN");

        Bancolega.Info();
        Bankillo.Info();

        //Cuentacorrienre

        CuentaCorriente c1 = new CuentaCorriente("Maria Dolores Fuertes", "565656");
        CuentaCorriente c2 = new CuentaCorriente("Alvaro Arbeloa", "468485", Bankillo);

        c1.ingreso(5000);

        c1.mostrarInfo();

        c1.cambiarBanco(Bancolega);

        c1.mostrarInfo();

    }

}
