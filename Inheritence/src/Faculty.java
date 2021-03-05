public class Faculty extends UEmployee {
    private String deptName;

    Faculty(){
        deptName = "Computer Science";
    }

    Faculty(String n, int s, String d){
        super(n, s);
        deptName = d;
    }

    public void setDeptName(String d){
        deptName = d;
    }

    public String getDeptName() {
        return deptName;
    }

    public String toString() {
        return "\nName: " + getName() + "\nDepartment: " + getDeptName() + "\nSalary: " + getSalary() + "\n";
    }
}
