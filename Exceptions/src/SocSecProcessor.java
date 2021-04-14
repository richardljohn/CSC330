//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: Computer Science 330
//Date: April 14, 2021
//Assignment: SocSecProcessor

import java.util.Scanner;

public class SocSecProcessor {
    public static void main(String[] args) throws SocSecException {

        //Initalized values for user input.
        char choice = 'y';
        String name = "Joseph Joestar";
        String socNum = "000-00-0000";
        Scanner input = new Scanner(System.in);

        //While loop that will let user continue if he or she wants to.
        while(choice == 'y'){
            try {
                System.out.print("Enter a name: ");
                name = input.nextLine();
                System.out.print("Enter a social security number: ");
                socNum = input.nextLine();
                isValid(socNum); //Call of SocSecException Thrower Method
                if(isValid(socNum) == true){
                    System.out.println(name + " " + socNum + " is valid.");
                }
            }
            catch (SocSecException sse) {
                System.out.println(sse.getMessage());
            }
            finally { //Would the user like to continue? We may never know. Unless he or she enters a y or n.
                System.out.print("Would you like to continue? Enter (y/n): ");
                choice = input.nextLine().toLowerCase().charAt(0);
            }
        }

    }

    //Method to check if a Social Security Number is valid.
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
                if (!Character.isDigit(ss.charAt(i))) {
                    throw new SocSecException("Invalid social security number, contains a " +
                            "\ncharacter that is not a digit");
                }
            }
        }
        return true;
    }

}

//Output
/*
Enter a name: Robert Roode
Enter a social security number: 523-65-1979
Robert Roode 523-65-1979 is valid.
Would you like to continue? Enter (y/n): y
Enter a name: Thomas Wayne
Enter a social security number: 033+43+4321
Invalid social security number, no dash in
expected space.
Would you like to continue? Enter (y/n): y
Enter a name: Nia Jax
Enter a social security number: 000000000000
Invalid social security number, wrong number of
characters
Would you like to continue? Enter (y/n): y
Enter a name: Edge
Enter a social security number: O02-21-1243
Invalid social security number, contains a
character that is not a digit
Would you like to continue? Enter (y/n): y
Enter a name: Joseph Joestar
Enter a social security number: 324-21-2134
Joseph Joestar 324-21-2134 is valid.
Would you like to continue? Enter (y/n): n
Process finished with exit code 0
 */