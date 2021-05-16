package U9.model;

import U9.ConexionBD;
import U9.clases.Productline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductlineModel {
    public static void insertProductline(Productline productline) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO productlines VALUES (?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setString(1, productline.getProductLine());
        sentencia.setString(2, productline.getTextDescription());
        sentencia.setString(3, productline.getHtmlDescription());
        sentencia.setString(4, productline.getImage());

        sentencia.executeUpdate();
    }
}