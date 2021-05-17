package Examen.Ej4;

import Examen.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderModel {
    public static void insertOrder(Order order) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, order.getOrderNumber());
        sentencia.setString(2, (String) order.getOrderDate());
        sentencia.setString(3, (String) order.getRequiredDate());
        sentencia.setString(4, (String) order.getShippedDate());
        sentencia.setString(5, order.getStatus());
        sentencia.setString(6, order.getComments());
        sentencia.setInt(7, order.getCustomerNumber());

        sentencia.executeUpdate();
    }
}
