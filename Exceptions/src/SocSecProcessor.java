import java.util.Scanner;

public class SocSecProcessor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        while(!input.nextLine().toLowerCase().equals("n")){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            System.out.print("Enter a social security number: ");
            String socNum = input.nextLine();
            if(!isValid(socNum)){
                System.out.println(name + " " + socNum + " is valid.");
                System.out.println("Would you like to continue? Enter (y/n): ");
            }
            else {
                System.out.println("Would you like to continue? Enter (y/n): ");
            }
        }

    }

    public static boolean isValid(String ss) throws SocSecException {
        if(ss.length() != 11){
            throw new SocSecException("Invalid social security number, wrong number of characters");
        }
        for(int i = 0; i < ss.length(); i++){
            if(ss.charAt(i) < 48 && ss.charAt(i) > 57){
                throw new SocSecException("Invalid social security number")
            }
        }
        return false;
    }
}
