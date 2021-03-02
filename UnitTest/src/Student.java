//Name: Richard John
//Instructor: Professor Richard Weir
//Assignment: Lab 2 - Class Assignment
//Date: February 27, 2021

public class Student {

    //Private Data Members.
    private String firstName;
    private String lastName;
    private String concatenated;
    private double average;

    //Public Data Members

    //Constructors
    Student() {
        firstName = "Barry";
        lastName = "Allen";
        concatenated = lastName.toLowerCase() + firstName.toLowerCase();
        average = 0.0;
    }

    Student(String f, String l){
        firstName = f;
        lastName = l;
        concatenated = lastName.toLowerCase() + firstName.toLowerCase();
        average = 0.0;
    }

    //Mutator Functions
    public void setFirstName(String f){
        firstName = f;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public void setConcatenated(String c){
        concatenated = c;
    }

    public void setAverage(double a){
        average = a;
    }

    //Accessor Functions
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getConcatenated(){
        return concatenated;
    }

    public double getAverage() {
        return average;
    }

    //Displays a Student's name along with his or her test grade.
    public String toString() {
        return firstName + " " + lastName + ": " + average;
    }
}