package U4.T1.Act4;

public class main {
    /*Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y DNI del titular.
    Las operaciones típicas con una cuenta corriente son:

-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros.

-Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano que indique lo mismo.

-Ingresar dinero: se incrementa el saldo.

-Mostrar información: muestra la información de la cuenta corriente.*/
    public static void main(String[] args) {

        CuentaCorriente c1 = new CuentaCorriente("Armando Distancia", "5353");
        CuentaCorriente c2 = new CuentaCorriente("Shu Primo", "6467");

        System.out.println("El nombre del banco es "+CuentaCorriente.nombre_banco);
        CuentaCorriente.cambiarNombreBanco("Unicaja");
        System.out.println("El nuevo banco es "+CuentaCorriente.nombre_banco);
        CuentaCorriente.nombre_banco = "LaCaja";
        System.out.println("El nuevo nombre del banco es "+CuentaCorriente.nombre_banco);


        



    }
}
