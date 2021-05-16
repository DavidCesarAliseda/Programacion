package U9;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
        // Principal
        Consultas consulta1 = new Consultas();
        consulta1.DatosJefe();
    }

    // Método 1
    public void PagosCliente() {
        /*PagosCliente() que solicita al usuario un número de cliente (customerNumber) y muestre por pantalla el nombre del cliente (contactFirstName), su apellido (contactLastName),
        país (country)  y la suma de todos los pagos realizados por dicho cliente. Esta consulta será realizada con un Statement.*/

        try {
            Connection con = ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca un número de cliente:");
            int numCliente = sc.nextInt();

            // Consulta
            String sql =
                    "SELECT customers.customerNumber, customers.contactFirstName, customers.contactLastName,"
                            + " customers.country, SUM(payments.amount) AS pagos FROM payments INNER JOIN customers "
                            + "ON payments.customerNumber = customers.customerNumber WHERE customers.customerNumber =?";
            PreparedStatement sentencia1 = con.prepareStatement(sql);

            sentencia1.setInt(1, numCliente);

            ResultSet rs = sentencia1.executeQuery();

            // Recorremos el conjunto de resultados
            while (rs.next()) {
                // Obtenemos un campo cadena
                System.out.println("contactFirstName :" + rs.getString("contactFirstName"));
                // Obtenemos un campo cadena
                System.out.println("contactLastName :" + rs.getString("contactLastName"));
                // Obtenemos un campo cadena
                System.out.println("country :" + rs.getString("country"));
                // Tipo double
                System.out.println("amount :" + rs.getDouble("pagos"));
                System.out.println("-----------------");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Método 2
    public void InfoPedido() {
        try {
            Connection con = ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca un número de pedido:");
            int numPedido = sc.nextInt();

            // Consulta
            String sql =
                    "SELECT products.productName, orderdetails.priceEach, orderdetails.quantityOrdered, (orderdetails.priceEach* orderdetails.quantityOrdered) AS c_total FROM orderdetails INNER JOIN products ON products.productCode = orderdetails.productCode WHERE orderdetails.orderNumber = ?";
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, numPedido);

            ResultSet rs = sentencia.executeQuery();

            // Recorremos el conjunto de resultados
            while (rs.next()) {
                // Obtenemos un campo cadena
                System.out.println("productName :" + rs.getString("productName"));
                // Tipo double
                System.out.println("priceEach :" + rs.getDouble("priceEach"));
                // Obtenemos un campo int
                System.out.println("quantityOrdered :" + rs.getInt("quantityOrdered"));
                // Tipo double
                System.out.println("c_total :" + rs.getDouble("c_total"));
                System.out.println("-----------------");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Método 3
    public void DatosJefe() {
        try {
            Connection con = ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca un número de empleado:");
            int numEmpleado = sc.nextInt();

            // Consulta
            String sql =
                    "SELECT employees.firstName, employees.lastName FROM employees WHERE employees.employeeNumber = (SELECT employees.reportsTo FROM employees WHERE employees.employeeNumber = ?);";
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, numEmpleado);

            ResultSet rs = sentencia.executeQuery();

            // Recorremos el conjunto de resultados
            while (rs.next()) {
                // Obtenemos un campo cadena
                System.out.println("NombreJefe :" + rs.getString("firstName"));
                // Obtenemos un campo cadena
                System.out.println("Apellido Jefe :" + rs.getString("lastName"));
                System.out.println("-----------------");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}