/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import static javax.swing.DropMode.INSERT;

public class DataBase {

    private Connection conn;
    private Statement statment;

    public Connection openConnection() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            String url = "jdbc:mysql://localhost/";
            String dbName = "Pizza";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";

            try {
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
                System.out.println(Messages.SQL_SUCCESFUL);
            } catch (ClassNotFoundException | SQLException sqle) {
                System.out.println(Messages.SQL_FAILER);
            }

        }
        return conn;

    }

    public void post(String type, String size, String deep, double calories) throws Exception {
        Connection con = openConnection();
        PreparedStatement posted = con.prepareStatement("INSERT INTO pizza(type,size,deep,calories) VALUES('" + type + "','" + size + "','" + deep + "','" + calories + "')");
        posted.executeUpdate();
    }
}
