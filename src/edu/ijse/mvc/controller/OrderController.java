/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;
import java.util.ArrayList;

/**
 *
 * @author Milan
 */
public class OrderController {
    private OrderModel orderModel;
    public OrderController(){
        this.orderModel=new OrderModel();
    }
    public String placeOrder(OrderDto orderDto,ArrayList<OrderDetailDto>orderDeatailDtos)throws Exception{
        return orderModel.placeOrder(orderDto,orderDeatailDtos);
        
    }
}
