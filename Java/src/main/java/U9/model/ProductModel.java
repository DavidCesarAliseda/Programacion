package U9.model;

import U9.ConexionBD;
import U9.clases.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductModel {
    public static void insertProduct(Product product) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setString(1, product.getProductCode());
        sentencia.setString(2, product.getProductName());
        sentencia.setString(3, product.getProductLine());
        sentencia.setString(4, product.getProductScale());
        sentencia.setString(5, product.getProductVendor());
        sentencia.setString(6, product.getProductDescription());
        sentencia.setInt(7, product.getQuantityInStock());
        sentencia.setDouble(8, product.getBuyPrice());
        sentencia.setDouble(9, product.getMSRP());

        sentencia.executeUpdate();
    }
}
