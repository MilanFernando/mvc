/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

/**
 *
 * @author Milan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static DBconnection dBconnection;
    private Connection connection;
    private DBconnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "1234");
 }
    public static DBconnection getinstance() throws SQLException, ClassNotFoundException{
        if (dBconnection==null){
            dBconnection=new DBconnection();
        }
            return dBconnection;
    }
    public Connection getConnection(){
        return connection;
    }
}


