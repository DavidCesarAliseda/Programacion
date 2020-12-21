package U4.T1.Act6;

public class CuentaCorriente {
    /*Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
    Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
    Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)*/

    private double saldo;
    private double limite;
    public String nombre;
    String DNI;
    static String nombre_banco = "Bancolega";

    public CuentaCorriente(String nombre, String DNI) {
        setSaldo(0);
        setLimite(-50);
        setNombre(nombre);
        setDNI(DNI);
    }

    /*Nombre Banco*/
    static void cambiarNombreBanco(String nuevo_banco){
        nombre_banco = nuevo_banco;

    }

    /*Saldo*/
    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    /*Limite*/
    public double getLimite()
    {
        return limite;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }

    /*Nombre*/
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /*DNI*/
    public String getDNI()
    {
        return DNI;
    }

    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }

    /*Funciones*/
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
