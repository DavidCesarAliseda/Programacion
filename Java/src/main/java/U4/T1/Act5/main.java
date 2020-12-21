package U4.T1.Act5;

public class main {
    /*Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.*/
    public static void main(String[] args) {

        Texto t1 = new Texto(10);
        System.out.println(t1.maximo);


    }
}
