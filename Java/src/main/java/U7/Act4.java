package U7;

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
        //convertir array de cadenas en lista
        List<String> palabras_list = Arrays.asList(palabras_separadas);
        //convertir lista en array list
        ArrayList<String> palabras_arraylist = new ArrayList<String>(palabras_list);
        System.out.println(palabras_arraylist);


        ArrayList<String> palabras_arraylist_temp=palabras_arraylist;
        ArrayList<String> palabras_norep=palabras_arraylist;
        Iterator<String> it = palabras_arraylist.iterator();
        Iterator<String> it2 = palabras_arraylist_temp.iterator();
        it2.next();
        while(it.hasNext()){
            while (it2.hasNext()){
                if (it.next().equals(it2.next())){
                    System.out.println(it.next()+"1");
                }else{
                    palabras_norep.add(it.next());
                }


            }

        }
        System.out.println(palabras_norep);



    }
}
