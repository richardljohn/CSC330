import java.util.Scanner;

public class CustomerRunner {
    public static void main(String[] args){
        //Person Anthony = new Person();
        //System.out.print(Anthony);
        Customer Anthony = new Customer();
        System.out.println(Anthony);
        Scanner input = new Scanner(System.in);
        String name_, address_, phone, want;
        boolean interested;
        int cNum = 2;
        System.out.print("Enter your name: ");
        name_ = input.nextLine();
        System.out.print("Enter your address: ");
        address_ = input.nextLine();
        System.out.print("Enter your phone number: ");
        phone = input.nextLine();
        System.out.print("Are you interested in signing up for the waitlist? Enter y for yes and n for no: ");
        want = input.nextLine();
        if(want.toLowerCase().equals("n")){
            interested = false;
        } else {
            interested = true;
        }
        Customer you = new Customer(name_, address_, phone, cNum, interested);
        cNum++;
        System.out.print(you);
    }
}
