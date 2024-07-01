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
    public CustomerDto searchCustomer(String id)throws Exception{
        Connection connection= DBconnection.getinstance().getConnection();
        
        String sql="select*from customer where CustID=?";
        PreparedStatement statment=connection.prepareStatement(sql);
        statment.setString(1,id);
        
        ResultSet rst=statment.executeQuery();
        
        CustomerDto dto=null;
        while( rst.next()){
            
        dto=new CustomerDto();
        dto.setCustID(rst.getString("CustID"));
        dto.setCustTitle (rst.getString("CustTitle"));
        dto.setCustName(rst.getString("CustName"));
        dto.setDOB(rst.getString("DOB"));
        dto.setSalary(rst.getDouble("Salary"));
        dto.setCustAddress(rst.getString("CustAddress"));
        dto.setCity(rst.getString("City"));
        dto.setProvince(rst.getString("Province"));
        dto.setPostalCode(rst.getString("PostalCode"));
        }
    return dto;}
    public String updateCustomer(CustomerDto customerdto)throws Exception{
        Connection connection= DBconnection.getinstance().getConnection();
      String sql="update Customer set CustTitle=?, CustName=?, DOB=?, Salary=?, "
              + "CustAddress=?, City=?, Province=?, PostalCode=? where CustID=?";
      
      PreparedStatement statment=connection.prepareStatement(sql);
     
      statment.setString(1,customerdto.getCustTitle());
      statment.setString(2,customerdto.getCustName());
      statment.setString(3,customerdto.getDOB());
      statment.setDouble(4,customerdto.getSalary());
      statment.setString(5,customerdto.getCustAddress());
      statment.setString(6,customerdto.getCity());
      statment.setString(7,customerdto.getProvince());
      statment.setString(8,customerdto.getPostalCode());
      statment.setString(9,customerdto.getCustID());
      
      if(statment.executeUpdate()>0){
      return "Success";
      }else{
      return "Fail";}
       }
    public String deleteCustomer(String id)throws Exception{
     Connection connection= DBconnection.getinstance().getConnection();
      String sql="delete from customer where CustID=?";
      
      PreparedStatement statment=connection.prepareStatement(sql);
      statment.setString(1,id);
      
      if(statment.executeUpdate()>0){
      return "Success";
      }else{
      return "Fail";}
       }   
    }
    
    

