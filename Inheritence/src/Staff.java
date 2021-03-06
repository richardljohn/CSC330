//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Assignment: Basic Inheritance
//Date: March 5, 2021

public class Staff extends UEmployee {

    //Private Data Members
    private String jobTitle;

    //Constructors
    Staff(){
        jobTitle = "Teacher";
    }

    Staff(String n, int s, String j){
        super(n, s);
        jobTitle = j;
    }

    //Mutator and Accessor Methods
    public void setJobTitle(String j){
        jobTitle = j;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    //Display of a Staff Object's information.
    public String toString() {
        return "\nName: " + getName() + "\nDepartment: " + getJobTitle() + "\nSalary: " + getSalary() + "\n";
    }
}
