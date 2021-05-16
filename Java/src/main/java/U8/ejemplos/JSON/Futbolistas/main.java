package U8.Ejemplos.JSON.Futbolistas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //PRIMERA PARTE.

        ArrayList<String> portero = new ArrayList<>();
        portero.add("Portero");
        ArrayList<String> sergio = new ArrayList<>();
        sergio.add("Lateral derecho");
        sergio.add("Medio Centro");
        ArrayList<String> andres = new ArrayList<>();
        andres.add("Extremo derecho");
        andres.add("Mediocampo");

        Futbolista casillas = new Futbolista(1, "Casillas", portero, "Real de Madrid");
        Futbolista ramos = new Futbolista(15, "Gramos", sergio, "Real de Madrid");
        Futbolista iniesta = new Futbolista(6, "Iniesta", andres, "Barcelona");

        ArrayList<Futbolista> seleccion = new ArrayList<>();
        seleccion.add(casillas);
        seleccion.add(ramos);
        seleccion.add(iniesta);

        //Creamos el objeto GSON que se encarga de las conversiones
        Gson gson = new Gson();

        //Convertimos el objeto GSON en JSON y lo mostramos por pantalla
        System.out.println(gson.toJson(seleccion));

        //SEGUNDA PARTE.
        String json_completo=gson.toJson(casillas);

        Futbolista nuevo_casillas = gson.fromJson(json_completo, Futbolista.class);
        System.out.println(nuevo_casillas);

        //Si queremos transformar sólo un array de JSON a ArrayList
        String json_array=gson.toJson(seleccion);

        Type ListType = new TypeToken<ArrayList<Futbolista>>() {}.getType();
        ArrayList<Futbolista> array_de_json=gson.fromJson(json_array,ListType);

        System.out.println(array_de_json);
    }
}
