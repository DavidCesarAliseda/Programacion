package U2.EjEntregable;
import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print( "Por favor, introduzca la frase: ");
        String frase = teclado.nextLine();

        int contador = 0;
        String a = "a";
        String e = "e";
        String o = "o";
        String h = "h";
        String esp = " ";

        for (int n = 0; n <= frase.length(); n++) {

            String car = frase.substring(n);
            if (car.equals(a) || car.equals(e) || car.equals(o)) {
                contador++;
            }if (car.equals(h)) {
                contador++;
            }if (car.equals(esp)){
                contador++;
            }
        }
        System.out.println(contador);
    }
}



