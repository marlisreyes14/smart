/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class conector {
    static Statement sentencia;
public static final String URL = "jdbc:mysql://localhost:3306/proyecto";
    public static final String USER = "root";
    public static final String CLAVE = "";
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(URL, USER, CLAVE);
            sentencia= con.createStatement();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
}
}
