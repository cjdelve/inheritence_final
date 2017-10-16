package com.inheritence.java;

public class residential extends Customer {
    private Boolean senior;

    public residential(String customer_name, String customer_phone,
                      String customer_address, Double square_feet,
                      Boolean senior){
        super(customer_name, customer_phone, customer_address, square_feet);
            this.senior = senior;
    }

    public void setSenior(Boolean senior){
        this.senior = senior;
    }

    public Boolean getSenior() {
        return senior;
    }

    public void calculate(){
        // price = sqft * price per sq ft.
        double price = this.square_feet * .006;
        // Determine pricing, display values.

        // Print standard information.
        // System.out.println("Customer Name: " + this.customer_name);
        // System.out.println("Customer Phone: " + this.customer_phone);
        // System.out.println("Customer Address: " + this.customer_address);
        // System.out.println("Total Square feet: " + this.square_feet);

        if(this.senior){

            // Display price with discount.
            double discount = (price * .15);
            price = price - discount;
            System.out.println("Price: $" + price);
        }
        else{
            // Display price without discount.
            System.out.println("Price: $" + price);
        }
    }
}
