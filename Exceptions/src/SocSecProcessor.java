import java.util.Scanner;

public class SocSecProcessor {
    public static void main(String[] args) throws SocSecException {

        char choice = 'y';
        String name = "Robert Roode", socNum = "000-00-0000";
        Scanner input = new Scanner(System.in);
        while(choice == 'y'){
            try {
                System.out.print("Enter a name: ");
                name = input.nextLine();
                System.out.print("Enter a social security number: ");
                socNum = input.nextLine();
                isValid(socNum);
            }
            catch (SocSecException sse) {
                System.out.println(sse);
            }
            if(isValid(socNum)){
                System.out.println(name + " " + socNum + " is valid.");
                System.out.print("Would you like to continue? Enter (y/n): ");
                choice = input.next().toLowerCase().charAt(0);
            }
            else {
                System.out.print("Would you like to continue? Enter (y/n): ");
                choice = input.next().toLowerCase().charAt(0);
            }
        }

    }

    public static boolean isValid(String ss) throws SocSecException {
        if(ss.length() != 11){
            throw new SocSecException("Invalid social security number, wrong number of " +
                    "\ncharacters");
        }
        for(int i = 0; i < ss.length(); i++){
            if(i == 3 || i == 6){
                if(ss.charAt(i) != '-'){
                    throw new SocSecException("Invalid social security number, no dash in "
                            + "\nexpected space.");
                }
            }
            if(i != 3 && i != 6) {
                if (ss.charAt(i) < 48 && ss.charAt(i) > 57) {
                    throw new SocSecException("Invalid social security number, contains a " +
                            "\ncharacter that is not a digit");
                }
            }
        }
        return true;
    }

}
