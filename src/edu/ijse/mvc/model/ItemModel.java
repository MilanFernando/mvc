/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.db.DBconnection;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Milan
 */
public class ItemModel {
    public ItemDto searchItem(String id)throws Exception{
        Connection connection= DBconnection.getinstance().getConnection();
        
        String sql="select*from Item where ItemCode=?";
        PreparedStatement statment=connection.prepareStatement(sql);
        statment.setString(1,id);
        
        ResultSet rst=statment.executeQuery();
        
        ItemDto dto=null;
        while( rst.next()){
            
        dto=new ItemDto();
        dto.setId(rst.getString("ItemCode"));
        dto.setDescription(rst.getString("Description"));
        dto.setPack(rst.getString("PackSize"));
        dto.setUnitprice(rst.getDouble("UnitPrice"));
        dto.setQoh(rst.getInt("QtyOnHand"));
        }
    return dto;
    }}
