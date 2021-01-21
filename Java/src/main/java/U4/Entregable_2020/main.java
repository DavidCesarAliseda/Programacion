package U4.Entregable_2020;

public class main {
    public static void main(String[] args) {
        System.out.println("Los tamaños de pizza son: ");
        Pizza.mostrar_tamanyos();
        System.out.println();

        /*Ingredientes*/
        Ingrediente Queso = new Ingrediente();
        Ingrediente Jamon = new Ingrediente("Jamon", 320);
        Ingrediente Atun = new Ingrediente("Atun", 300);
        Ingrediente Cebolla = new Ingrediente("Cebolla", 160);

        System.out.println("Los ingredientes son: ");
        System.out.println(Queso.toString());
        System.out.println(Jamon.toString());
        System.out.println(Atun.toString());
        System.out.println(Cebolla.toString());
        System.out.println();
        /*Pizzas*/
        Pizza estrella = new Pizza();
        estrella.add_ingrediente(Queso);
        estrella.add_ingrediente(Jamon);
        Pizza basica = new Pizza(Size.MEDIANDA);
        basica.add_ingrediente(Cebolla);
        basica.add_ingrediente(Jamon);
        basica.add_ingrediente(Queso);

        System.out.println("Las pizzas son: ");
        System.out.println(estrella);
        System.out.println(basica);
        System.out.println();
        /*Pedidos*/
        Pedido p1 = new Pedido(estrella);
        Pedido p2 = new Pedido(basica);

        System.out.println("Los pedidos son:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
        /*Pizzeria*/
        Pizzeria Pomodoro = new Pizzeria();
        Pomodoro.add_pedido(p1);
        Pomodoro.add_pedido(p2);

        System.out.println("Los pedidos de la pizzeria son: ");
        System.out.println(Pomodoro.toString());
        Pomodoro.mostrar_numpedidos();












        /*Mostrar tamaños disponibles
        System.out.println("Los tamaños de pizza son: ");
        Pizza.mostrar_tamanyos();
        System.out.println();

        Prueba mostrar info
        Ingrediente i1 = new Ingrediente();
        System.out.println(i1.toString());
        Ingrediente i2 = new Ingrediente("Jamon", 300);
        System.out.println(i2.toString());
        Ingrediente i3 = new Ingrediente("Atun", 75);

        Pizza p1 = new Pizza();
        p1.add_ingrediente(i1);
        p1.add_ingrediente(i2);
        System.out.println();
        Pizza p2 = new Pizza(Size.MEDIANDA);
        p2.add_ingrediente(i3);
        p2.add_ingrediente(i3);

        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());

        //Prueba pedidos

        Pedido pedido1 = new Pedido(p1);
        System.out.println(pedido1.toString());
        Pedido pedido2 = new Pedido(p2);
        Pizzeria pomodoro = new Pizzeria();
        pomodoro.add_pedido(pedido1);
        pomodoro.add_pedido(pedido2);
        System.out.println(pedido1.toString());
        System.out.println();

        System.out.println(pomodoro.toString());*/
    }
}
