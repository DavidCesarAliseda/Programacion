package Examen.Ej4;

import Examen.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class Transacciones {
    /*insertarPedido() que inserte los datos de un pedido que contenga al menos 2 productos diferentes.*/
    public static void main(String[] args) {
        insertarPedido();
    }

    public static void insertarPedido() {
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);
            OrderModel.insertOrder(
                    new Order(
                            10099,
                            "2003-01-10",
                            "2003-01-13",
                            "2003-01-10",
                            "Shipped",
                            "Check on availability",
                            363
                    )
            );
            System.out.println("Order insertada");

            OrderDetailModel.insertOrderDetail(
                    new OrderDetail(
                            10099,
                            "S18_1749",
                            25,
                            26.4,
                            2
                    )
            );
            System.out.println("Orderdetail insertada");
            OrderDetailModel.insertOrderDetail(
                    new OrderDetail(
                            10099,
                            "S18_4409",
                            10,
                            6.4,
                            3
                    )
            );
            System.out.println("Orderdetail insertada");
            con.commit();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            try {
                if (con != null) {
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
