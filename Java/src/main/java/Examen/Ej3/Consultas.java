package Examen.Ej3;

import Examen.ConexionBD;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {
    /*List<Office> MostrarOficinas() que devuelve una lista de oficina que se obtiene de la base de datos  y que será utilizada para mostrar toda
    esa información en formato JSON por pantalla.*/
    public static void main(String[] args) {

        Gson gson = new Gson();
        System.out.println(gson.toJson(mostrarOficinas()));

    }

    public static List<Office> mostrarOficinas(){
        ArrayList<Office> listaOficinas = new ArrayList<>();

        try {
            Connection con = ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);

            String sql = "SELECT * FROM offices";

            PreparedStatement sentencia = con.prepareStatement(sql);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                Office obj = new Office();

                obj.setOfficeCode(rs.getString("officeCode"));
                obj.setCity(rs.getString("city"));
                obj.setPhone(rs.getString("phone"));
                obj.setAddressLine1(rs.getString("addressLine1"));
                obj.setAddressLine2(rs.getString("addressLine2"));
                obj.setState(rs.getString("state"));
                obj.setCountry(rs.getString("country"));
                obj.setPostalCode(rs.getString("postalCode"));
                obj.setTerritory(rs.getString("territory"));

                listaOficinas.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return listaOficinas;
    }

}
