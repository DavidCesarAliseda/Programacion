package U4.T1.Act3;

public class CuentaCorriente {
    /*Actividad 3: Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas, y la visibilidad de sus atributos para que:

-saldo y limite no sean visibles para otras clases

-nombre sea oúblico para cualquier clase

-dni solo sea visible por clases vecinas

(Comprueba la visibilidad desde el programa principal comentando cada acceso o intento de acceso)*/

    private double saldo;
    private double limite;
    public String nombre;
    String DNI;

    public CuentaCorriente(String nombre, String DNI) {
        setSaldo(0);
        setLimite(-50);
        setNombre(nombre);
        setDNI(DNI);
    }
    /*Primera parte: solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite de descubierto será 0 euros.*/
    public CuentaCorriente(double saldo) {
        setSaldo(saldo);
        setLimite(0);
    }
    /*Segunda parte: con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.*/
    public CuentaCorriente(double saldo, double limite, String DNI) {
        setSaldo(saldo);
        setLimite(limite);
        setDNI(DNI);
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
