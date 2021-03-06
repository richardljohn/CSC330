//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Assignment: Basic Inheritance
//Date: March 5, 2021

public class UEmployee {

    //Private data members.
    private String name;
    private int salary;


    //Constructors
    UEmployee() {
        name = "Tim";
        salary = 60000;
    }

    UEmployee(String n, int s){
        name = n;
        salary = s;
    }


    //Mutator and Accessor Methods
    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s){
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getSalary(){
        return salary;
    }

    //Display of a UEmployee Object's information
    public String toString() {
        return "\nName: " + getName() + "\nSalary: " + getSalary() + "\n";
    }
}
