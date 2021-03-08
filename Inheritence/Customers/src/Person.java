//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Date: March 8, 2021
//Assignment: Customers Inheritance

public class Person {

    //Private data members.
    private String name;
    private String address;
    private String phoneNumber;

    //Constructors
    Person(){
        name = "Anthony";
        address = "100 Bogard Street";
        phoneNumber = "6465238439";
    }

    Person(String n, String a, String p){
        name = n;
        address = a;
        phoneNumber = p;
    }


    //Public Data Members. Accessors and Mutators.
    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String a){
        address = a;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String p){
        phoneNumber = p;
    }

    //Display of each Person's information.
    public String toString(){
        return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber();
    }

}
