package com.inheritence.java;

import java.util.Scanner;

public class Customer  {

    String customer_name;
    String customer_phone;
    String customer_address;
    Double square_feet;

    public Customer(String customer_name, String customer_phone, String customer_address, Double square_feet) {

        this.customer_name = customer_name;
        this.customer_phone = customer_phone;
        this.customer_address = customer_address;
        this.square_feet = square_feet;

    }

    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public void setSquare_feet(Double square_feet) {
        this.square_feet = square_feet;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public Double getSquare_feet() {
        return square_feet;
    }


    // If there is a non specific customer, print that info.
    public void display_standard_data(){

        System.out.println("Customer Name: " + this.customer_name);
        System.out.println("Customer Phone: " + this.customer_phone);
        System.out.println("Customer Address: " + this.customer_address);
        System.out.println("Total Square feet: " + this.square_feet);
    }


}
