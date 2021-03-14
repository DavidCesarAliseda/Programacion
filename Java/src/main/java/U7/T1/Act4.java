package U7.T1;

import java.util.*;

public class Act4 {
    /*Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
    Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que
    estén repetidas. A continuación, mostrar las que no lo estén.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = teclado.nextLine();

        //Convertir la cadena a array de cadena
        String[] palabras_separadas = frase.split( " ");

        /*//convertir array de cadenas en lista
        List<String> palabras_list = Arrays.asList(palabras_separadas);
        //convertir lista en array list
        ArrayList<String> palabras_arraylist = new ArrayList<String>(palabras_list);
        System.out.println(palabras_arraylist);*/

        ArrayList<String> palabras_arraylist = new ArrayList<String>(Arrays.asList(palabras_separadas));

        ArrayList<String> palabras_arraylist_temp=palabras_arraylist;
        TreeSet<String> rep = new TreeSet<>();
        Iterator<String> it = palabras_arraylist.iterator();


        while(it.hasNext()){
            String p1=it.next();
            int cont = 0;
            Iterator<String> it2 = palabras_arraylist_temp.iterator();
            while (it2.hasNext()){
                String p2=it2.next();
                if (p1.equals(p2)){
                    cont++;
                    if (cont>1){
                        rep.add(p1);
                    }
                }
            }
        }
        System.out.println("Repetidas: ");
        System.out.println(rep);
        System.out.println();
        System.out.println("No repetidas:");
        palabras_arraylist_temp.removeAll(rep);
        System.out.println(palabras_arraylist_temp);

    }
}
