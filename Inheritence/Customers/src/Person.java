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

    public String toString(){
        return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber();
    }

}
