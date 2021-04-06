import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {
        Blastoise enemyBlastoise = new Blastoise();
        Charizard myCharizard = new Charizard();
        MaxPotion mP = new MaxPotion();
        MaxElixir mE = new MaxElixir();
        HumanPlayer You = new HumanPlayer(myCharizard, mP);
        ComputerPlayer Com = new ComputerPlayer(enemyBlastoise, mE);
        Scanner input = new Scanner(System.in);
        int com = 1;
        System.out.println("You encountered your rival.\nHe sent out a " + Com.getPokemon().getName() + "!");
        Com.getPokemon().speak();
        System.out.println();
        System.out.println("Go " + You.getPokemon().getName() + "!");
        You.getPokemon().speak();

        while ((myCharizard.getHp() != 0) && (enemyBlastoise.getHp() != 0)) {
            Random comChoice = new Random();
            System.out.println("\n" + You.getPokemon() + "\t\t\t\t\t" + Com.getPokemon());
            System.out.println("1. Fight");
            System.out.println("2. Use Item");
            System.out.println("3. Run");
            System.out.print("What would like to do?: ");
            int choice = input.nextInt();
            com = 1 + comChoice.nextInt(10);
            if (choice == 1) {
                You.getPokemon().attack(Com.getPokemon());
            }
            if (choice == 2) {
                You.getItem().use(You.getPokemon());
            }
            if (choice == 3) {
                System.out.println("No. There is no running in a Trainer Battle.");
            }
            System.out.println(You.getPokemon() + "\t\t\t\t\t" + Com.getPokemon());
            if (myCharizard.getHp() == 0) {
                System.out.println("Your " + You.getPokemon().getName() + " Fainted!\nYou whited out!!!");
                break;
            }
            if (enemyBlastoise.getHp() == 0) {
                System.out.println("The enemy's " + Com.getPokemon().getName() + " has fainted!\nYou win!!!!!!");
                break;
            }
            if (com > 0 && com <= 6) {
                Com.getPokemon().attack(myCharizard);
//                System.out.println(You.getPokemon() + "\t\t\t\t\t" + Com.getPokemon());
            }
            if (com > 7 && com <= 9) {
                Com.getItem().use(enemyBlastoise);
            }
            if (com == 10) {
                Com.run();
                break;
            }
            if (You.getPokemon().getHp() == 0) {
                System.out.println("Your " + You.getPokemon().getName() + " Fainted!\nYou whited out!!!");
                break;
            }
            if (Com.getPokemon().getHp() == 0) {
                System.out.println("The enemy's " + Com.getPokemon().getName() + " has fainted!\nYou win!!!!!!");
                break;
            }
        }
    }
}