package U4.T2.Act2;
/*Actividad 2: Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan) y se retiran (se desapilan) siguiendo la norma de que el último que se apila será el primero en desapilarse, como ocurre con una pila de platos. Se llama cima de la pila al último elemento apilado (o al primero en desapilar). Las funciones fundamentales de una pila son, por tanto, apilar() y desapilar().

Implementar la clase PilaTabla para números Integer, donde se usa una tabla para guardar los elementos apilados
*/
public class main {
    public static void main(String[] args) {
        Pila p1 = new Pila();
        Pila p2 = new Pila();
        p1.cima();
        p1.apilar(6);
        p1.apilar(9);
        p1.cima();
        p1.desapila();
        p1.desapila();
        p1.desapila();





    }
}
