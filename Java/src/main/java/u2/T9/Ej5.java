package u2.T9;

import java.util.Scanner;

public class Ej5 {
    /*Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con "Javalín, javalón",
    para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
    Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
    Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de Javalandia (en cualquiera de sus dialectos),
    y en caso afirmativo, nos muestre el mensaje sin muletillas.*/
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String muletilla_inicio = "Javalín, javalón";
        String muletilla_final = "javalén, len, len";

        System.out.println("Introduzca la frase para traducir: ");
        String frase = sc.nextLine();

        String mul_i_frase = frase.substring(0, muletilla_inicio.length());
        if (mul_i_frase.equals(muletilla_inicio)){
            System.out.println("Pertenece al primer dialecto.");
            String sin_muletillas = frase.substring(muletilla_inicio.length(), frase.length());
            System.out.println("Traducido: "+sin_muletillas);
        }

        int pos_inicio_mfinal = frase.length() - muletilla_final.length();
        String mul_f_frase = frase.substring(pos_inicio_mfinal, frase.length());
        if (mul_f_frase.equals(muletilla_final)) {
            System.out.println("Pertenece al segundo dialecto.");
            String sin_muletillas = frase.substring(0, pos_inicio_mfinal);
            System.out.println("Traducido: "+sin_muletillas);
        }
    }
}
