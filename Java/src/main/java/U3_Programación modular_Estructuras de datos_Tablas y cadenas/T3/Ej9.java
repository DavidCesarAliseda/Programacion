package U3.T3;

public class Ej9 {
    /*Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
    y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.*/
    public static void main(String[] args) {
        int x=6;
        int aciertos=0;
        int[] ganadora = {2, 3, 4, 5, 6, 7};
        int[] apuesta = {1, 3, 4, 7, 6, 5};

        System.out.println("El numero de aciertos es: "+comparacion_combi(ganadora, apuesta, x, aciertos));


    }
    public static int comparacion_combi (int[] ganadora, int[] apuesta, int x, int aciertos){
        int j = 0;
        for (int i = 0; i < x; i++) {
            j=i;
            if (ganadora[i]==apuesta[j]){
                aciertos++;
            }

        }
        return aciertos;
    }
}
