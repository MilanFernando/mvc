/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBconnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Milan
 */
public class Customermodel {
    public String saveCustomer(CustomerDto customerDto)throws SQLException, ClassNotFoundException{
    Connection connection= DBconnection.getinstance().getConnection();
      String sql="insert into Customer values(?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement statment=connection.prepareStatement(sql);
      statment.setString(1,customerDto.getCustID());
      statment.setString(2,customerDto.getCustTitle());
      statment.setString(3,customerDto.getCustName());
      statment.setString(4,customerDto.getDOB());
      statment.setDouble(5,customerDto.getSalary());
      statment.setString(6,customerDto.getCustAddress());
      statment.setString(7,customerDto.getCity());
      statment.setString(8,customerDto.getProvince());
      statment.setString(9,customerDto.getPostalCode());
      
      if(statment.executeUpdate()>0){
      return "Success";
      }else{
      return "Fail";}
       }
}
