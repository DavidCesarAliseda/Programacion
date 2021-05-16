package U9.model;

import U9.ConexionBD;
import U9.clases.Order;

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
        sentencia.setDate(2, (Date) order.getOrderDate());
        sentencia.setDate(3, (Date) order.getRequiredDate());
        sentencia.setDate(4, (Date) order.getShippedDate());
        sentencia.setString(5, order.getStatus());
        sentencia.setString(5, order.getComments());
        sentencia.setInt(7, order.getCustomerNumber());

        sentencia.executeUpdate();
    }
}
