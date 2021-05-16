package U9;

import U9.clases.Payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CrearObjeto {
    public static void main(String[] args) {
        consulta();

    }
    public static  void consulta(){
        try {
            Connection con = ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);

            String consulta= "SELECT * FROM payments WHERE checkNumber=?";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1,"PT550181");

            ResultSet rs = sentencia.executeQuery();
            Payment obj =new Payment();
            while (rs.next()){

                obj.setCustomerNumber(rs.getInt("customerNumber"));
                obj.setCheckNumber(rs.getString("checkNumber"));
                obj.setPaymentDate(rs.getDate("paymentDate"));
                obj.setAmount(rs.getDouble("amount"));

            }
            System.out.println(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
