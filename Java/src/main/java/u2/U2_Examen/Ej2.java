package u2.U2_Examen;

public class Ej2 {
    /*Realiza un programa que pinte por pantalla diez líneas formadas por carac-
teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/
    static public void main (String [] args) {

        for(int l=1; l<=10; l++) {
            double c = Math.random() *40+1;

            for (int i = 1; i <= c; i++) {
                double r = Math.random()*10;
                if (r<=1.7) {
                    System.out.print("*");
                } else if (r<=3 && r>1.7) {
                    System.out.print("-");
                } else if (r<=5 && r>3) {
                    System.out.print("=");
                } else if (r<=6.2 && r>5) {
                    System.out.print(".");
                } else if (r<=7.8 && r>6.2) {
                    System.out.print("|");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
