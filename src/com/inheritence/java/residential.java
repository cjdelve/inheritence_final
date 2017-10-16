package com.inheritence.java;

public class residential extends Customer {
    private Boolean senior;

    /**
     * residential: Takes information specific to residential customers.
     *
     * @param senior If the customer is a senior, they will recieve a
     *               discount
     */
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
