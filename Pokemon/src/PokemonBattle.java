import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args){
        Blastoise enemyBlastoise = new Blastoise();
        Charizard myCharizard = new Charizard();
        MaxPotion mP = new MaxPotion();
        MaxElixir mE = new MaxElixir();
        HumanPlayer You = new HumanPlayer(myCharizard, mP);
        ComputerPlayer Com = new ComputerPlayer(enemyBlastoise, mE);
        System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
        Scanner input = new Scanner(System.in);
        while((myCharizard.getHp() != 0) && (enemyBlastoise.getHp() != 0)){
            System.out.println("1. Fight");
            System.out.println("2. Use Item");
            System.out.println("3. Run");
            System.out.print("What would like to do?: ");
            int choice = input.nextInt();
            if(choice == 1){
                You.getPokemon().attack(enemyBlastoise);
            }
            if(choice == 2){
                You.getItem().use(You.getPokemon());
            }
            if(choice == 3){
                System.out.println("No. There is no running in a Trainer Battle.");
            }
            System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
            if(myCharizard.getHp() == 0){
                System.out.println("Your Charizard Fainted!");
            }
            if(enemyBlastoise.getHp() == 0){
                System.out.println("The enemy's Blastoise fainted!");
            }
        }
        //System.out.println(Com.getItem());
//        System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
//        enemyBlastoise.attack(myCharizard);
//        System.out.println();
//        System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
//        myCharizard.attack(enemyBlastoise);
//        System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
    }
}

