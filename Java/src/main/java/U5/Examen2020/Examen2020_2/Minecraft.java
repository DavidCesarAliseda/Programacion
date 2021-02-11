package U5.Examen2020.Examen2020_2;

import java.util.Arrays;

public class Minecraft{
    /*En relación al array de Materiales debo de tener en cuenta que:

En cualquier momento puedo añadir un Material pero nunca podré tener más de 10.
En el array de materiales nunca puedo tener un material que no tenga masa (la masa alcanza un valor menor o igual a cero). Si existe en la lista debo de actualizarla para borrarlo. Para ello, debo implementar el método borrarMaterialSinMasa().
Puedo mostrar el estado de todos los materiales por pantalla mediante el método mostrarEstado().
Puedo mostrar el array de materiales ordenados por defecto por masa, aunque adicionalmente puedo mostrarlos ordenados por capacidad de quemarse o de diluirse.
Debo de tener también un método ultimoMaterialQueQueda() que me diga, cuando hay un sólo (uno solo en todo el array) material sin masa, y que muestre toda su información por pantalla.*/
    Material[] materiales;
    private final int MatMax=10;
    private int indiceMateriales;

    public Minecraft() {
        materiales= new Material[MatMax];
        indiceMateriales=0;
    }

    //Metodos
    public void addMaterial(Material o){
        if (indiceMateriales < MatMax){
            this.materiales[indiceMateriales++]=o;
        }else{
            System.out.println("No es posible introducir mas materiales.");
        }

    }

    public void borrarMaterialSinMasa(){
        for (int i = 0; i < indiceMateriales; i++) {
            if (materiales[i].getMasa()<=0){
                for (int j = i; j < indiceMateriales-1; j++) {
                    materiales[j]=materiales[j+1];
                }
                indiceMateriales--;
            }
        }

    }

    public String mostrarEstado(){
        String resultado= "";
        for (int i = 0; i < indiceMateriales; i++) {
            resultado=resultado+(materiales[i].toString());
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Minecraft{" +
                "materiales=" + Arrays.toString(materiales) +
                '}';
    }

    public String ultimoMaterialQueQueda(){
        int cont=0;
        int pos=0;
        String resultado="";
        for (int i = 0; i < indiceMateriales; i++) {
            if (materiales[i].getMasa()==0){
                cont++;
                if (cont>1){
                    break;
                }
                pos=i;
            }
        }
        if (cont==1){
            resultado=materiales[pos].toString();
        }else if(cont>1){
            resultado="Hay mas de un material con masa 0. ";
        }else{
            resultado="No hay ningun material sin masa. ";
        }
        return resultado;

    }


}
