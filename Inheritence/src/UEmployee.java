public class UEmployee {
    private String name;
    private int salary;

    UEmployee() {
        name = "Tim";
        salary = 60000;
    }

    UEmployee(String n, int s){
        name = n;
        salary = s;
    }

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

    public String toString() {
        return "\nName: " + getName() + "\nSalary: " + getSalary() + "\n";
    }
}
