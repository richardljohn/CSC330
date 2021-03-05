public class Staff extends UEmployee {
    private String jobTitle;

    Staff(){
        jobTitle = "Teacher";
    }

    Staff(String n, int s, String j){
        super(n, s);
        jobTitle = j;
    }

    public void setJobTitle(String j){
        jobTitle = j;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return "\nName: " + getName() + "\nDepartment: " + getJobTitle() + "\nSalary: " + getSalary() + "\n";
    }
}
