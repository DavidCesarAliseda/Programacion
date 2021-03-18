package U7.T3;

import java.util.*;

public class Act2 {
    /*Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni, calculará la clave que ha de consultar, comprobará que dicha clave existe,
     y, en tal caso, mostrará el valor asociado a esa clave en el HashMap.*/
    public static void main(String[] args) {
        boolean yaEsta = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca un dni: ");
        String dni = sc.nextLine();

        Map<Integer, String> m = new HashMap<>();

        while (!dni.equals("fin") || !nombre.equals("fin")){
            m.put(Calc_clave(dni), nombre);
            System.out.println("Introduzca un nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca un dni: ");
            dni = sc.nextLine();
            Collection<Integer> claves = m.keySet();
            Iterator<Integer> it = claves.iterator();
            while (it.hasNext()){
                if (it.next().equals(Calc_clave(dni))){
                    System.out.println("La clave se repite. ");
                    yaEsta=true;
                    break;
                }
            }
            if (yaEsta){
                break;
            }
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
