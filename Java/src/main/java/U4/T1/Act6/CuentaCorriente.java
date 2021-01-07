package U4.T1.Act6;

public class CuentaCorriente {

    private double saldo;
    private double limite;
    public String nombre;
    String DNI;
    //static String nombre_banco = "Bancolega";
    Banco banco;//Banco de la cuenta

    public CuentaCorriente(String nombre, String DNI, Banco banco) {
        setSaldo(0);
        setLimite(-50);
        setNombre(nombre);
        setDNI(DNI);
        setBanco(banco);
    }

    public CuentaCorriente(String nombre, String DNI) {
        setSaldo(0);
        setLimite(-50);
        setNombre(nombre);
        setDNI(DNI);
    }

    /*Nombre Banco*/
    /*static void cambiarNombreBanco(String nuevo_banco){
        nombre_banco = nuevo_banco;

    }*/
    /*Banco*/

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
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

    void cambiarBanco(Banco banco){//Cambiar de banco
        setBanco(banco);
    }

    void mostrarInfo(){
        System.out.println("Informacion del banco");
        if(banco==null){//Si no tiene banco es valor null
            System.out.println("Esta cuenta corriente no esta asociada a un banco.");
        }else{//En caso de que si tenga llamamos a la info de la clase Banco
            banco.Info();
        }
        System.out.println("Informacion de la cuenta");
        System.out.println(" Titular: "+this.nombre);
        System.out.println(" DNI: "+this.DNI);
        System.out.println(" Saldo "+this.saldo);
        System.out.println(" Limite "+this.limite);
        System.out.println();
    }


}
