package com.inheritence.java;

import java.util.Scanner;

public class Main {

    /**
     * Main will send and retrieve all data regarding customers.
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Print main menu.
        while (0 == 0) {
            System.out.println("\n Please select an option:");

            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Exit");

            int menu_choice = input.nextInt();
            input.nextLine();

            // Before retrieving information, check to see if the user wants
            // to exit the program.
            if(menu_choice == 3){
                System.exit(0);
            }

            System.out.println("Customer name:");
            String customer_name = input.nextLine();

            System.out.println("Customer Phone:");
            String customer_phone = input.nextLine();

            System.out.println("Customer Address:");
            String customer_address = input.nextLine();

            System.out.println("Square feet:");
            Double square_feet = input.nextDouble();

            // Send off standard data
            Customer standard = new Customer(customer_name, customer_phone, customer_address,
                    square_feet);


            switch (menu_choice) {
                case 1:
                    String property_name;
                    String mult_prop;

                    System.out.println("Property name:");
                    input.nextLine();
                    property_name = input.nextLine();

                    System.out.println("Multiple Properties Y/N");
                    mult_prop = input.next();

                    // Display standard information.
                    standard.display_standard_data();

                    if (mult_prop.toLowerCase().equals("y")) {
                        commercial customer = new commercial(customer_name, customer_phone, customer_address,
                                square_feet, property_name, true);
                        customer.calculations();
                    } else {
                        commercial customer = new commercial(customer_name, customer_phone, customer_address,
                                square_feet, property_name, false);

                        customer.calculations();

                    }

                    break;

                case 2:
                    String senior;

                    senior = input.nextLine();

                    // Display standard information
                    standard.display_standard_data();

                    if (senior.toLowerCase().equals("y")) {
                        residential customer = new residential(customer_name, customer_phone, customer_address,
                                square_feet, true);

                        customer.calculate();


                    } else {
                        residential customer = new residential(customer_name, customer_phone, customer_address,
                                square_feet, false);

                        customer.calculate();
                    }
                    break;

            }

        }
    }
}

