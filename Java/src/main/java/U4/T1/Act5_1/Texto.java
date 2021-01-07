package U4.T1.Act5_1;

public class Texto {
    /*Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.*/

    int maximo;
    String texto;

    //Constructor
    public Texto(int maximo) {
        setMaximo(maximo);
        setTexto("");
    }
    //Maximo
    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    //Texto
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Añadir caracter
    //Al principio
    void caracter_inicio(char caracter){
        if (texto.length()+1<=this.maximo){//Para añadir caracter
            texto = caracter + texto;
        }
    }

    //Al final
    void caracter_final(char caracter){
        if (texto.length()+1<=this.maximo){//Para añadir caracter
            texto = texto+caracter;
        }
    }

    //Añadir cadena
    //Al inicio
    void cadena_inicio(String cadena){
        if (texto.length()+cadena.length()<=this.maximo){//Para añadir caracter
            texto = cadena + texto;
        }
    }

    //Al final
    void cadena_final(String cadena){
        if (texto.length()+cadena.length()<=this.maximo){//Para añadir caracter
            texto = texto + cadena;
        }
    }

    //Conteo Vocales
    private boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    int num_vocales (){
        int num_vocales=0;
        for (int x = 0; x < texto.length(); x++) {
            char letraActual = texto.charAt(x);
            if (esVocal(letraActual)) num_vocales++;
        }
        return num_vocales;
    }
}