package U9.model;
import U9.ConexionBD;
import U9.clases.Orderdetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderdetailModel {
    public static void insertOrderdetail(Orderdetail orderdetail) throws SQLException {
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
