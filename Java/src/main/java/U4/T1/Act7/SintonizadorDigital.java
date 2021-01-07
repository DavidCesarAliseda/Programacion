package U4.T1.Act7;

public class SintonizadorDigital {
    /*Actividad 7: Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
     concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down) la
     frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
     Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al inicio,
     el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se sobrepasa uno de los
     dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario. Escribir un pequeño
     programa principal para probar su funcionamiento.*/

    private double frecuencia;

    public SintonizadorDigital() {
        setFrecuencia(frecuencia);//MHz
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = 80;
    }

    /*Funciones*/
    /*Up*/
    public double up (){
        frecuencia += 0.5; //Sube frecuencia
        comprobarRango();

        return frecuencia;
    }

    /*Down*/
    public double down (){
        frecuencia -= 0.5; //Sube frecuencia
        comprobarRango();

        return frecuencia;
    }

    /*Display*/
    public void display(){
        System.out.println("La frecuencia sintonizada es "+frecuencia+" MHz.");
    }


    /*Comprueba que no está fuera de los rangos*/
    private void comprobarRango(){
        if (frecuencia<80){
            frecuencia=108;
        }else if (frecuencia>108){
            frecuencia=80;
        }
    }
}
