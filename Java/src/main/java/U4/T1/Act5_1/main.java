package U4.T1.Act5_1;

public class main {
    /*Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.*/
    public static void main(String[] args) {

        Texto t1 = new Texto(20);
        System.out.println("El limite es "+t1.maximo+" caracteres.");
//Prueba caracteres
        t1.caracter_inicio('l');
        t1.caracter_inicio('o');
        t1.caracter_final('a');
        t1.caracter_final(' ');
        System.out.println(t1.texto);

//Prueba cadena
        t1.cadena_final("cara");
        t1.cadena_final("cola");
        t1.cadena_inicio("!h");
        System.out.println(t1.texto);

//Prueba limite
        t1.cadena_inicio("Que pasa");
        System.out.println(t1.texto);

//Prueba conteo vocales
        System.out.println("Hay "+t1.num_vocales()+" vocales.");
    }
}
