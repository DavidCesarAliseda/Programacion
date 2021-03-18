package U7.T3;

import java.util.*;

public class Act1 {
    /*Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
    La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma de sus dígitos.

46221877D -> 4+6+2+2+1+8+7+7=37

Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.*/
    public static void main(String[] args) {
        boolean yaEsta=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca un dni: ");
        String dni = sc.nextLine();

        Map<Integer, String> m = new HashMap<>();

        while (!dni.equals("fin") || !nombre.equals("fin")) {
            m.put(Calc_clave(dni), nombre);
            System.out.println("Introduzca un nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca un dni: ");
            dni = sc.nextLine();
        }
        System.out.println(m);
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
