import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
import java.util.Random;

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
        int com = 1;
        while((myCharizard.getHp() != 0) && (enemyBlastoise.getHp() != 0)){
            Random comChoice = new Random();
            System.out.println("1. Fight");
            System.out.println("2. Use Item");
            System.out.println("3. Run");
            System.out.print("What would like to do?: ");
            int choice = input.nextInt();
            com = 1+comChoice.nextInt(10);
            if(choice == 1){
                You.getPokemon().attack(enemyBlastoise);
            }
            if(choice == 2){
                mP.use(myCharizard);
            }
            if(choice == 3){
                System.out.println("No. There is no running in a Trainer Battle.");
            }
            System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
            if(myCharizard.getHp() == 0){
                System.out.println("Your Charizard Fainted!\nYou whited out!!!");
                break;
            }
            if(enemyBlastoise.getHp() == 0){
                System.out.println("The enemy's Blastoise fainted!\nYou win!!!!!!");
                break;
            }
            if(com > 0 && com <= 6){
                enemyBlastoise.attack(myCharizard);
                System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
            }
            if(com > 7 && com <= 9){
                mE.use(enemyBlastoise);
                System.out.println(myCharizard + "\t\t\t\t\t" + enemyBlastoise);
            }
            if(com == 10){
                Com.run();
                break;
            }
            if(myCharizard.getHp() == 0){
                System.out.println("Your Charizard Fainted!\nYou whited out!!!");
                break;
            }
            if(enemyBlastoise.getHp() == 0){
                System.out.println("The enemy's Blastoise fainted!\nYou win!!!!!!");
                break;
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

