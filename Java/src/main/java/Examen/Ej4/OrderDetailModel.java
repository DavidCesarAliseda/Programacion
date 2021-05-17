package Examen.Ej4;

import Examen.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailModel {
    public static void insertOrderDetail(OrderDetail orderdetail) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, orderdetail.getOrderNumber());
        sentencia.setString(2, orderdetail.getProductCode());
        sentencia.setInt(3, orderdetail.getQuantityOrdered());
        sentencia.setDouble(4, orderdetail.getPriceEach());
        sentencia.setInt(5, orderdetail.getOrderLineNumber());

        sentencia.executeUpdate();
    }
}
