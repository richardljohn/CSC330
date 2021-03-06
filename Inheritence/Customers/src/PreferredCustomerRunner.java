import java.util.Scanner;
import java.util.prefs.PreferencesFactory;

public class PreferredCustomerRunner {
    public static void main(String[] args){
        PreferredCustomer Timmothy = new PreferredCustomer();
        System.out.println(Timmothy);
        Scanner input = new Scanner(System.in);
        String name_, address_, phone, want;
        double cummulative, disc;
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
        System.out.print("Enter how much you spent: ");
        cummulative = input.nextDouble();
        disc = 0.0;
        PreferredCustomer NotKaren = new PreferredCustomer(name_, address_, phone, cNum, interested, cummulative, 0.0);
        NotKaren.determineDiscount();
        System.out.println(NotKaren);
    }
}

//    public double determineDiscount(double cummul){
//        double discount = 0.0;
//        if(cummul < 500){
//            discount = 0.0;
//        }
//        else if(cummul == 500){
//            discount = 0.05;
//        }
//        else {
//            double total = cummul - 500.0;
//            discount = 0.05;
//            while(total >= 500){
//                total = total - 500.0;
//                discount += 0.01;
//            }
//        }
//        return discount;
//    }
