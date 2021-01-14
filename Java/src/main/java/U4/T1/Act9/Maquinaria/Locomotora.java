package U4.T1.Act9.Maquinaria;

import U4.T1.Act9.Personal.Mecanico;

public class Locomotora {

    private String matricula;
    private int potencia;
    private int anio;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anio, Mecanico mecanico) {
        setMatricula(matricula);
        setAnio(anio);
        setMecanico(mecanico);
        setPotencia(potencia);
    }
    //Get and Setter
    //Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //Potencia
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    //Año
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //Mecanico
    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    //Metodos
    public void infoLocomotora(){
        System.out.println("Informacion de la locomotora ");
        System.out.println("La matricula es "+this.matricula);
        System.out.println("La potencia es "+this.potencia);
        System.out.println("Del año "+this.anio);
        System.out.println("-----");
        mecanico.infoMecanico();

    }
}
