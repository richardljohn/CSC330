//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Date: March 8, 2021
//Assignment: Customers Inheritance

public class Customer extends Person {

    //Private Data Members.
    private int custNum;
    private boolean waitList;

    //Constructors
    Customer(){
        custNum = 1;
        waitList = false;
    }

    Customer(String n, String a, String p, int c, boolean w){
        super(n, a, p);
        custNum = c;
        waitList = w;
    }

    //Public Data Members. Mutators and Accessors
    public int getCustNum(){
        return custNum;
    }

    public void setCustNum(int c){
        custNum = c;
    }

    public boolean getWait(){
        return waitList;
    }

    public void setWait(boolean w){
        waitList = w;
    }

    //Display of the Customer's informattion.
    public String toString() {

        //Finds out if Customer wants to join the special list.
        String interest;
        if(!getWait()){
            interest = "Not Interested.";
        } else {
            interest = "Interested.";
        }

        return super.toString() + "\nCustomer Number: " + getCustNum() + "\nWaitlist: " + interest;
    }

}
