package U5.T2.Act3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*Crea un array de FigurasGeometricas de 5 posiciones.*/
        PoligonoRegular[] poligonoRegulars =new PoligonoRegular[5];
        Triangulo t1 = new Triangulo(2, Color.AZUL);
        Triangulo t2 = new Triangulo(5, Color.ROJO);
        Triangulo t3 = new Triangulo(9, Color.AMARILLO);
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado(10, Color.VERDE);

        poligonoRegulars[0]=t1;
        poligonoRegulars[1]=t2;
        poligonoRegulars[2]=t3;
        poligonoRegulars[3]=c1;
        poligonoRegulars[4]=c2;
        /*Deberás mostrar el contenido del array. (Fíjate en que se muestren los atributos correctos dependiendo de si es un Triangulo o un Cuadrado)*/
        System.out.println(Arrays.toString(poligonoRegulars));
        System.out.println();

        /*Muestra ahora el valor de la variable contadorPoligonos*/
        System.out.println("contadorPoligonos = "+PoligonoRegular.contadorPoligonos);
        System.out.println();

        /*Crea después un array de objetos Triangulo, y ordena el array con su ordenación por defecto. Muestra el array.*/

        t1 = new Triangulo(2, Color.AZUL);
        t2 = new Triangulo(5, Color.ROJO);
        t3 = new Triangulo(9, Color.AMARILLO);


        Triangulo[] triangulos = new Triangulo[3];
        triangulos[0]=t1;
        triangulos[1]=t2;
        triangulos[2]=t3;

        System.out.println("Compara por lado");
        System.out.println(Arrays.toString(triangulos));
        Arrays.sort(triangulos);
        System.out.println(Arrays.toString(triangulos));
        System.out.println();

        /*Ordénalo ahora por color. Muéstralo*/
        System.out.println("Compara por color");
        ComparaColorTriangulo cct = new ComparaColorTriangulo();
        System.out.println(Arrays.toString(triangulos));
        Arrays.sort(triangulos, cct);
        System.out.println(Arrays.toString(triangulos));














        /*Triangulo t1 = new Triangulo(2, Color.AZUL);
        Triangulo t2 = new Triangulo(5, Color.ROJO);
        Triangulo t3 = new Triangulo(9, Color.AMARILLO);
        Cuadrado c1 = new Cuadrado();

        Triangulo[] triangulos = new Triangulo[3];
        triangulos[0]=t1;
        triangulos[1]=t2;
        triangulos[2]=t3;

        System.out.println("Compara por lado");
        System.out.println(Arrays.toString(triangulos));
        Arrays.sort(triangulos);
        System.out.println(Arrays.toString(triangulos));

        System.out.println("Compara por color");
        ComparaColorTriangulo cct = new ComparaColorTriangulo();
        System.out.println(Arrays.toString(triangulos));
        Arrays.sort(triangulos, cct);
        System.out.println(Arrays.toString(triangulos));*/

        /*Color c1 = Color.AMARILLO;
        System.out.println(c1);

        String color = c1.toString();

        System.out.println(color);*/





    }


}
