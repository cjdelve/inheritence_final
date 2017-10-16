package com.inheritence.java;

public class commercial extends Customer {
    private String property_name;
    private Boolean multiple_prop;

    public commercial(String customer_name, String customer_phone,
                      String customer_address, Double square_feet,
                      String property_name, Boolean multiple_prop){
        super(customer_name, customer_phone, customer_address, square_feet);
            this.property_name = property_name;
            this.multiple_prop = multiple_prop;
        }

    public void setProperty_name(String property_name){
        this.property_name = property_name;
    }

    public void setMultiple_prop(Boolean multiple_prop){
        this.multiple_prop = multiple_prop;
    }

    public String getProperty_name() {
        return property_name;
    }

    public Boolean getMultiple_prop() {
        return multiple_prop;
    }

    public void calculations(){
        // price = sqft * price per sq ft.
        double price = this.square_feet * .005;

        // Determine pricing, display values.
        // Print standard information.
        // System.out.println("Customer Name: " + this.customer_name);
        // System.out.println("Customer Phone: " + this.customer_phone);
        // System.out.println("Customer Address: " + this.customer_address);
        // System.out.println("Total Square feet: " + this.square_feet);

        // Print property name, specific to this child class.
        System.out.println("Property Name: " + this.property_name);

        if(multiple_prop){
            double discount = ((price) * .1);
            double discount_price = price - discount;

            // Display price with discount.
            System.out.println("Final Price: $" + discount_price);

        }
        else{
            // Display price without multiple property discount.
            System.out.println("Final Price: $" + price);

        }

    }
}

