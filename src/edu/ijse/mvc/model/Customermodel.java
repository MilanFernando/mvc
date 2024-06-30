/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBconnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Prepaired;

/**
 *
 * @author Milan
 */
public class Customermodel {
    public String saveCustomer(CustomerDto customerDto)throws SQLException, ClassNotFoundException{
    Connection connection= DBconnection.getinstance().getConnection();
      String sql="insert into Customer values(?,?,?,?,?,?,?,?,?,?)";
      
      PrepairedStatment statment=connection.prepareStatement(sql);
       }
}
