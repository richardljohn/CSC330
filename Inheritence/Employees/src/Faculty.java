//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Assignment: Basic Inheritance
//Date: March 5, 2021

public class Faculty extends UEmployee {

    //Private data members.
    private String deptName;

    //Constructors
    Faculty(){
        deptName = "Computer Science";
    }

    Faculty(String n, int s, String d){
        super(n, s);
        deptName = d;
    }

    //Accessor and Mutator Methods
    public void setDeptName(String d){
        deptName = d;
    }

    public String getDeptName() {
        return deptName;
    }

    //Display of a Faculty Object's information.
    public String toString() {
        return "\nName: " + getName() + "\nDepartment: " + getDeptName() + "\nSalary: " + getSalary() + "\n";
    }
}
