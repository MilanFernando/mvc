/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBconnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author Milan
 */
public class OrderModel {
    public String placeOrder(OrderDto orderDto,ArrayList<OrderDetailDto>orderDetailDtos) throws Exception{
        Connection connection= DBconnection.getinstance().getConnection();
            try{
                connection.setAutoCommit(false);
                
                String orderSql="INSERT INTO Orders VALUES(?,?,?)";
                PreparedStatement orderStatment=connection.prepareStatement(orderSql);
                 orderStatment.setString(1,orderDto.getOrderId());
                 orderStatment.setString(2,orderDto.getOrderDate());
                 orderStatment.setString(3,orderDto.getCustId());
                 
                    boolean isOrderSaved=orderStatment.executeUpdate()>0;
                if(isOrderSaved){
                    boolean isOrderDetailSave=true;
                        String orderDetailSql="INSERT INTO orderdetail VALUES(?,?,?,?)";
                    for(OrderDetailDto orderDetailDto: orderDetailDtos){
                        PreparedStatement orderDetailStatment=connection.prepareStatement(orderDetailSql);
                        orderDetailStatment.setString(1, orderDto.getOrderId());
                        orderDetailStatment.setString(2, orderDetailDto.getItemId());
                        orderDetailStatment.setInt(3, orderDetailDto.getQty());
                        orderDetailStatment.setDouble(4, orderDetailDto.getDiscount());
                        
                        if(!(orderDetailStatment.executeUpdate()>0)){
                           isOrderDetailSave=false;}
                     }
                    if(isOrderDetailSave){
                         boolean isItemUpdated=true;
                         String itemSql= "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                        for(OrderDetailDto orderDetailDto: orderDetailDtos){
                        PreparedStatement itemStatment=connection.prepareStatement(itemSql);
                        itemStatment.setInt(1,orderDetailDto.getQty());
                        itemStatment.setString(2,orderDetailDto.getItemId());
                        
                        if(!(itemStatment.executeUpdate()>0)){
                            isItemUpdated=false;}
                        }
                        if(isItemUpdated){
                        connection.commit();
                        return "Succes";
                        }else{
                        connection.rollback();
                        return "item update Error";}
                    }else{
                        connection.rollback();
                        return "Order Detail save Error";}
                }else{
                        connection.rollback();
                        return "Order Save Error";}
            }catch(Exception e){
                connection.rollback();
                e.printStackTrace();
                return e.getMessage();      
            }finally{
                connection.setAutoCommit(true);
        }     
    }
}
    

