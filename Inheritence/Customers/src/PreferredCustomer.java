//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Date: March 8, 2021
//Assignment: Preferred Customers Inheritance

public class PreferredCustomer extends Customer {

    //Private data members.
    private double cummulativePurchases;
    private double discount;

    //Constructors.
    PreferredCustomer() {
        cummulativePurchases = 0.0;
        discount = 0.0;
    }

    PreferredCustomer(String n, String a, String p, int c, boolean w, double cu, double d){
        super(n, a, p, c, w);
        cummulativePurchases = cu;
        discount = d;
    }

    //This will help determine how much of a discount the customer has.
    public void determineDiscount(){
        double discount = 0.0;
        if(cummulativePurchases < 500){
            discount = 0.0;
            setDiscount(discount);
        }
        else if(cummulativePurchases == 500){
            discount = 0.05;
            setDiscount(discount);
        }
        else {
            double total = getCummulativePurchases() - 500.0;
            discount = 0.05;
            while(total >= 500){
                total = total - 500.0;
                discount = discount + 0.01;

            }
            setDiscount(discount);
        }
    }

    //Public data members. Accessors and Mutators.
    public double getCummulativePurchases(){
        return cummulativePurchases;
    }

    public void setCummulative(double c){
        cummulativePurchases = c;
    }

    //Adds more money to total cummulative purchases.
    public void makePurchase(double price){
        cummulativePurchases = cummulativePurchases + price;
        determineDiscount();
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double d){
        discount = d;
    }



    //Displays the Preferred Customer's information.
    public String toString() {
        return super.toString() +
                "\nCummulative Purchases: " + getCummulativePurchases() +
                "\nDiscount: " + getDiscount();
    }
    
}
