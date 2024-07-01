/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.model.Customermodel;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.ArrayList;
/**
 *
 * @author Milan
 */
public class CustomerController {

private Customermodel customerModel;

public CustomerController(){
    customerModel=new Customermodel();
}

    public String SaveCustomer(CustomerDto customerDto) throws Exception{
    return customerModel.saveCustomer(customerDto);
    }
    public ArrayList<CustomerDto> getAllCustomer()throws Exception{
        return customerModel.getAllCustomer();
     }
    public CustomerDto searchCustomer(String id)throws Exception{
        return customerModel.searchCustomer(id);
    }
    public String updateCustomer(CustomerDto customerDto)throws Exception{
        return customerModel.updateCustomer(customerDto);
    }


    
    }
    

