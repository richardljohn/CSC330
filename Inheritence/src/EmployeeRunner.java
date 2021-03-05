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
        System.out.print("Enter what he or she does: ");
        String j = input.next();
        System.out.print("Enter how much they make: ");
        s = input.nextInt();
        Staff staff = new Staff(n, s, j);
        System.out.println("Employee Two" + staff);

        System.out.print("Enter a name: ");
        n = input.next();
        System.out.print("Enter where he or she works: ");
        String d = input.next();
        System.out.print("Enter how much they make: ");
        s = input.nextInt();
        Faculty faculty = new Faculty(n, s, d);
        System.out.print("Employee Three" + faculty);
    }
}
