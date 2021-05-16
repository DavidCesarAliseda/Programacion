package U9.model;

import U9.ConexionBD;
import U9.clases.Payment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentModel {
    public static void insertPayment(Payment payment) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO payments VALUES (?,?,?,?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, payment.getCustomerNumber());
        sentencia.setString(2, payment.getCheckNumber());
        sentencia.setDate(3, (Date) payment.getPaymentDate());
        sentencia.setDouble(4, payment.getAmount());

        sentencia.executeUpdate();
    }
}
