/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBconnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

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
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        Connection connection= DBconnection.getinstance().getConnection();
        String sql="select*from customer";
        PreparedStatement statment=connection.prepareStatement(sql);
        ResultSet rst=statment.executeQuery();
        
        ArrayList<CustomerDto> customerDtos=new ArrayList<>();
        
        while(rst.next()){
        CustomerDto dto=new CustomerDto();
        dto.setCustID(rst.getString("CustID"));
        dto.setCustTitle (rst.getString("CustTitle"));
        dto.setCustName(rst.getString("CustName"));
        dto.setDOB(rst.getString("DOB"));
        dto.setSalary(rst.getDouble("Salary"));
        dto.setCustAddress(rst.getString("CustAddress"));
        dto.setCity(rst.getString("City"));
        dto.setProvince(rst.getString("Province"));
        dto.setPostalCode(rst.getString("PostalCode"));
        
        customerDtos.add(dto);}
        return customerDtos;
    }
}
