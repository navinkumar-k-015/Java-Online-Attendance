/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    Connection conn = null;
    public static Connection conDB()
    {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbone", "root", "navin600");
            return con;
        } catch (SQLException ex) {
            System.err.println("ConnectionUtil : "+ex.getMessage());
            ex.printStackTrace();
           return null; 
        }
    }
}
