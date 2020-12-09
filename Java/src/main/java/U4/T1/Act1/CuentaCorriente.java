package U4.T1.Act1;

class CuentaCorriente {
    /*Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y DNI del titular.
    Las operaciones típicas con una cuenta corriente son:

-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros.

-Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano que indique lo mismo.

-Ingresar dinero: se incrementa el saldo.

-Mostrar información: muestra la información de la cuenta corriente.*/

    private double saldo;
    private double limite;
    private String nombre;
    private String DNI;

    void crear_cuenta(String DNI, String nombre){
        this.nombre = nombre;//this se refiere al del ambito general
        this.DNI = DNI;
        this.saldo=0;
        this.limite=-50;
    }

    boolean sacar_dinero(double cantidad){
        boolean operacion_posible=false;
        if (this.saldo-cantidad>=this.limite){
            this.saldo=this.saldo-cantidad;
            operacion_posible=true;
        }
        return operacion_posible;
    }

    void ingreso(double cantidad){
        if (cantidad>0) {
            this.saldo += cantidad;
        }
    }

    void informacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Dni: "+this.DNI);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
    }
}
