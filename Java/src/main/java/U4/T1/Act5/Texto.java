package U4.T1.Act5;

public class Texto {
    /*Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.*/

    int maximo; //Dado
    char caracter; //Usuario
    String cadena; //Usuario
    int num_vocales; //Calcular
    String texto; //

//Constructor
    public Texto(int maximo) {
        setMaximo(maximo);
        //this.caracter = caracter;
        //this.cadena = cadena;
        //setNum_vocales(num_vocales);
        //this.texto = getTexto();

    }
//Texto
    /*public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if(this.texto.length()<=this.maximo){
            this.texto = texto;
        }

    }*/
//Maximo
    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
//Número vocales
    /*public int getNum_vocales() {
        return num_vocales;
    }

    public void setNum_vocales(int num_vocales) {
        //this.num_vocales = num_vocales;

        this.num_vocales = num_vocales(texto);

    }

    //Conteo Vocales
    private boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    private int num_vocales (String texto){
        int vocales = 0;
        for (int x = 0; x < texto.length(); x++) {
            char letraActual = texto.charAt(x);
            if (esVocal(letraActual)) num_vocales++;
        }
        return num_vocales;
    }*/

    /*//Añadir caracter
    //Al principio
    String caracter_inicio(char caracter){
        if (texto.length()+1<=this.maximo){//Para añadir caracter
            texto = caracter + texto;
        }
        return texto;
    }
    //Al final
    String caracter_final(char caracter){
        if (texto.length()+1<=this.maximo){//Para añadir caracter
            texto = texto+caracter;
        }
        return texto;
    }

    //Añadir cadena
    //Al inicio
    String cadena_inicio(String cadena){
        if (texto.length()+cadena.length()<=this.maximo){//Para añadir caracter
            texto = cadena + texto;
        }
        return texto;
    }

    //Al final
    String cadena_final(String cadena){
        if (texto.length()+cadena.length()<=this.maximo){//Para añadir caracter
            texto = texto + cadena;
        }
        return texto;
    }*/
}




