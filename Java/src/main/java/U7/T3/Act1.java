package U7.T3;

import java.util.HashMap;
import java.util.Scanner;

public class Act1 {
    /*Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
    La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma de sus dígitos.

46221877D -> 4+6+2+2+1+8+7+7=37

Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca un dni: ");
        String dni = null;

        //HashMap<Integer> m

        while (!dni.equals("fin")){
            dni = sc.nextLine();
            System.out.println(Calc_clave(dni));
            System.out.println("Introduzca un dni: ");
        }
    }
    static Integer Calc_clave(String dni){
        Integer valor= 0;
        char[] aCaracteres = dni.toCharArray();
        for (int i = 0; i < aCaracteres.length-1; i++) { //menos uno para quitar la letra
            valor=valor+ Character.getNumericValue(aCaracteres[i]);
        }
        return valor;
    }
}
