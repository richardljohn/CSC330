import javax.print.DocFlavor;
import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String n = input.next();
        System.out.print("Enter how much they make: ");
        int s = input.nextInt();
        UEmployee employee = new UEmployee(n, s);
        System.out.println("Employee One" + employee);

        System.out.print("Enter a name: ");
        n = input.next();
        System.out.print("Enter his or her job title: ");
        String j = input.next();
        System.out.print("Enter how much he or she makes: ");
        s = input.nextInt();
        Staff staff = new Staff(n, s, j);
        System.out.println("Employee Two" + staff);

        System.out.print("Enter a name: ");
        n = input.next();
        System.out.print("Enter the department he or she works in: ");
        String d = input.next();
        System.out.print("Enter how much he or she makes: ");
        s = input.nextInt();
        Faculty faculty = new Faculty(n, s, d);
        System.out.print("Employee Three" + faculty);
    }
}

/*
Output:
Enter a name: Jacob
Enter how much they make: 50000
Employee One
Name: Jacob
Salary: 50000

Enter a name: Jessica
Enter his or her job title: Teacher
Enter how much he or she makes: 60000
Employee Two
Name: Jessica
Department: Teacher
Salary: 60000

Enter a name: Andrew
Enter the department he or she works in: Psychology
Enter how much he or she makes: 80000
Employee Three
Name: Andrew
Department: Psychology
Salary: 80000

Process finished with exit code 0
*/