package U7.T3;

import java.util.*;

public class Act3 {
    /*Actividad 3.- Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas, de tal forma que se escriban los datos así:

La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".

La clave ... está asociada al nombre ....*/
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
        leerMap(m);
    }
    static Integer Calc_clave(String dni){
        Integer valor= 0;
        char[] aCaracteres = dni.toCharArray();
        for (int i = 0; i < aCaracteres.length-1; i++) { //menos uno para quitar la letra
            valor=valor+ Character.getNumericValue(aCaracteres[i]);
        }
        return valor;
    }
    static void leerMap (Map m){
        Set<Map.Entry<Integer, String>> claves = m.entrySet();
        Iterator<Map.Entry<Integer, String>> it = claves.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> k = it.next();
            System.out.println("La clave "+k.getKey()+" está asociada al nombre "+k.getValue());
        }
    }
}
