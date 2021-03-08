//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Date: March 8, 2021
//Assignment: Customers Inheritance

import java.util.Scanner; //Importing Scanner for user input.

public class CustomerRunner {
    public static void main(String[] args){

        //Regular Customer.
        Customer Anthony = new Customer();
        System.out.println(Anthony);

        //User input and variables for input.
        Scanner input = new Scanner(System.in);
        String name_, address_, phone, want;
        boolean interested;
        int cNum = 2; //We start at 2 since we are already generating a Customer first.
        System.out.print("Enter your name: "); //User's name.
        name_ = input.nextLine();
        System.out.print("Enter your address: "); //User's address.
        address_ = input.nextLine();
        System.out.print("Enter your phone number: "); //User's phone number.
        phone = input.nextLine();

        //User's want to be placed on list or not.
        System.out.print("Are you interested in signing up for the waitlist? Enter y for yes and n for no: ");
        want = input.nextLine();

        //Checks to see if person wants to be placed on special list.
        if(want.toLowerCase().equals("n")){
            interested = false;
        } else {
            interested = true;
        }

        //Makes and displays new customer.
        Customer you = new Customer(name_, address_, phone, cNum, interested);
        System.out.print(you);

        cNum++; //And We increment!!
    }
}

/*
Output
Name: Anthony
Address: 100 Bogard Street
Phone Number: 6465238439
Customer Number: 1
Waitlist: Not Interested.
Enter your name: Terry
Enter your address: 100 Fatal Fury Ave
Enter your phone number: 6469123645
Are you interested in signing up for the waitlist? Enter y for yes and n for no: y
Name: Terry
Address: 100 Fatal Fury Ave
Phone Number: 6469123645
Customer Number: 2
Waitlist: Interested.
Process finished with exit code 0
*/