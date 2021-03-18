package U7.T3.Act4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Traductor {
    /*Actividad 4: Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo HashMap y se comporte de esta forma:

Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de un archivo de texto cuyo nombre se le pasará por parámetro al constructor.
Este archivo debe contener varias palabras en español y su traducción al inglés, de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor.
Por ejemplo:
                             hola, hello

                             mundo, world

                             gracias, thanks

                             adios, bye

Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.*/

    private HashMap <String, String> diccionario;

    public Traductor() {
        setDiccionario();
    }

    public HashMap getDiccionario() {
        return diccionario;
    }

    public void setDiccionario() {
        HashMap<String, String> m = new HashMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U7//T3//Act4//dicc.txt"));
            String[] adiccionario = new String[2];
            String linea = in.readLine();
            while (linea!=null){
                adiccionario=linea.split(", ");
                m.put(adiccionario[0], adiccionario[1]);
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.diccionario=m;
    }

    @Override
    public String toString() {
        return "Traductor{" +
                "diccionario=" + diccionario +
                '}';
    }

    public void traducirAIngles(String p){

        Set<Map.Entry<String, String>> claves = this.diccionario.entrySet();
        Iterator<Map.Entry<String, String>> it = claves.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> k = it.next();
            if (p.equals(k.getKey())){
                System.out.println(k.getValue());
                break;
            }
        }


    }
}
