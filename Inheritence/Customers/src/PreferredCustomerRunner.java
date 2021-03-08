//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Date: March 8, 2021
//Assignment: Preferred Customers Inheritance

import java.util.Scanner; //User input importation.
import java.util.prefs.PreferencesFactory;

public class PreferredCustomerRunner {
    public static void main(String[] args){

        //We make a default Preferred Customer.
        PreferredCustomer Timmothy = new PreferredCustomer();
        System.out.println(Timmothy);

        //User input.
        Scanner input = new Scanner(System.in);
        String name_, address_, phone, want;
        double cummulative, disc;
        boolean interested;
        int cNum = 2;
        System.out.print("Enter your name: "); //User's name.
        name_ = input.nextLine();
        System.out.print("Enter your address: "); //User's address,
        address_ = input.nextLine();
        System.out.print("Enter your phone number: "); //User's number.
        phone = input.nextLine();

        //Do you want to be put on the list my guy or girl?
        System.out.print("Are you interested in signing up for the waitlist? Enter y for yes and n for no: ");
        want = input.nextLine();
        //Determines if the user wants to be placed on the list.
        if(want.toLowerCase().equals("n")){
            interested = false;
        } else {
            interested = true;
        }
        System.out.print("Enter how much you spent: "); //How much did the user spent.
        cummulative = input.nextDouble();
        disc = 0.0;

        //Creating a new Preferred Customer.
        PreferredCustomer NotKaren = new PreferredCustomer(name_, address_, phone, cNum, interested, cummulative, 0.0);
        NotKaren.determineDiscount();

        //Displays Preferred Customer.
        System.out.println(NotKaren); //Obviously. We do not want a Karen.
    }
}

/*
Name: Anthony
Address: 100 Bogard Street
Phone Number: 6465238439
Customer Number: 1
Waitlist: Not Interested.
Cummulative Purchases: 0.0
Discount: 0.0
Enter your name: Bruce
Enter your address: 1 Wayne Manor Ave
Enter your phone number: 7182334023
Are you interested in signing up for the waitlist? Enter y for yes and n for no: y
Enter how much you spent: 10000
Name: Bruce
Address: 1 Wayne Manor Ave
Phone Number: 7182334023
Customer Number: 2
Waitlist: Interested.
Cummulative Purchases: 10000.0
Discount: 0.24000000000000007

Process finished with exit code 0

*/