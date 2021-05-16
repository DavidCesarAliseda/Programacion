package U9.model;

import U9.ConexionBD;
import U9.clases.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {
    public static void insertCustomer(Customer customer) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, customer.getCustomerNumber());
        sentencia.setString(2, customer.getCustomerName());
        sentencia.setString(3, customer.getContactLastName());
        sentencia.setString(4, customer.getContactFirstName());
        sentencia.setString(5, customer.getPhone());
        sentencia.setString(6, customer.getAddressLine1());
        sentencia.setString(7, customer.getAddressLine2());
        sentencia.setString(8, customer.getCity());
        sentencia.setString(9, customer.getState());
        sentencia.setString(10, customer.getPostalCode());
        sentencia.setString(11, customer.getCountry());
        sentencia.setInt(12, customer.getSalesRepEmployeeNumber());
        sentencia.setDouble(13, customer.getCreditLimit());

        sentencia.executeUpdate();
    }
}
