//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {

        //Initializing two Pokemon and two players
        Blastoise enemyBlastoise = new Blastoise();
        Charizard myCharizard = new Charizard();
        MaxPotion mP = new MaxPotion();
        MaxElixir mE = new MaxElixir();
        HumanPlayer You = new HumanPlayer(myCharizard, mP);
        ComputerPlayer Com = new ComputerPlayer(enemyBlastoise, mE);

        //User input. Driving the battle. Pokemon Battle Start!!!
        Scanner input = new Scanner(System.in);
        int com = 1;
        System.out.println("You encountered a Computer Player.\nHe sent out a " + Com.getPokemon().getName() + "!");
        Com.getPokemon().speak();
        System.out.println();
        System.out.println("Go " + You.getPokemon().getName() + "!");
        You.getPokemon().speak();
        System.out.println();

        //While loop will keep running until a Pokemon faints or the computer runs.
        while ((myCharizard.getHp() != 0) && (enemyBlastoise.getHp() != 0)) {

            Random comChoice = new Random(); //Computer randomizer

            //Menu system
            System.out.println(You.getPokemon() + "\t\t\t\t\t" + Com.getPokemon());
            System.out.println("1. Fight");
            System.out.println("2. Use Item");
            System.out.println("3. Run");
            System.out.print("What would like to do?: ");

            //Your choices.
            int choice = input.nextInt();
            com = 1 + comChoice.nextInt(10);
            if (choice == 1) {
                You.getPokemon().attack(Com.getPokemon());
            }
            if (choice == 2) {
                You.getItem().use(You.getPokemon());
            }

            //Except. You can't run. And if you do attempt to you lose your turn.
            if (choice == 3) {
                System.out.println("No. There is no running in a Trainer Battle.");
            }

            //Pokemon HP bars displayed again.
            System.out.println(You.getPokemon() + "\t\t\t\t\t" + Com.getPokemon());

            //If your Pokemon fainted or the computer's Pokemon fainted, the battle ends.
            if (myCharizard.getHp() == 0) {
                System.out.println("Your " + You.getPokemon().getName() + " Fainted!\nYou whited out!!!");
                break;
            }
            if (enemyBlastoise.getHp() == 0) {
                System.out.println("The enemy's " + Com.getPokemon().getName() + " has fainted!\nYou win!!!!!!");
                break;
            }

            //Computer choices.
            //60% of Computer attacking you.
            if (com > 0 && com <= 6) {
                Com.getPokemon().attack(myCharizard);
            }

            //30% of Computer using item.
            if (com > 7 && com <= 9) {
                Com.getItem().use(enemyBlastoise);
            }
            //10% of Computer running.
            if (com == 10) {
                Com.run();
                break;
            }

            //If a Pokemon faints because of the enemies move. The battle ends.
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

//Sample battles.
//Output 1
/*
You encountered a Computer Player.
He sent out a Blastoise!
Blastoise:  Blastoise!!!!!

Go Charizard!
Charizard:  Charizard!!!!!

Charizard    Health: 210/210					Blastoise    Health: 300/300
1. Fight
2. Use Item
3. Run
What would like to do?: 1
Choose your attack...
1. Flamethrower   Power:30
   Type: Fire  PP: 10/10
2. Tackle   Power:50
   Type: Normal  PP: 35/35
3. Solar Beam   Power:60
   Type: Grass  PP: 10/10
4. Dragon Pulse   Power:30
   Type: Dragon  PP: 10/10
Enter 1-4: 1
Charizard used Flamethrower!
Charizard    Health: 210/210					Blastoise    Health: 285/300
Computer fled.

Process finished with exit code 0
*/

//Output 2
/*
You encountered a Computer Player.
He sent out a Blastoise!
Blastoise:  Blastoise!!!!!

Go Charizard!
Charizard:  Charizard!!!!!

Charizard    Health: 210/210					Blastoise    Health: 300/300
1. Fight
2. Use Item
3. Run
What would like to do?: 1
Choose your attack...
1. Flamethrower   Power:30
   Type: Fire  PP: 10/10
2. Tackle   Power:50
   Type: Normal  PP: 35/35
3. Solar Beam   Power:60
   Type: Grass  PP: 10/10
4. Dragon Pulse   Power:30
   Type: Dragon  PP: 10/10
Enter 1-4: 3
Charizard used Solar Beam!
Charizard    Health: 210/210					Blastoise    Health: 180/300
Blastoise used Tackle!
Charizard    Health: 160/210					Blastoise    Health: 180/300
1. Fight
2. Use Item
3. Run
What would like to do?: 2
Max Potion is being used.
Charizard's health was restored.
Charizard    Health: 210/210					Blastoise    Health: 180/300
Blastoise used Tackle!
Charizard    Health: 160/210					Blastoise    Health: 180/300
1. Fight
2. Use Item
3. Run
What would like to do?: 1
Choose your attack...
1. Flamethrower   Power:30
   Type: Fire  PP: 10/10
2. Tackle   Power:50
   Type: Normal  PP: 35/35
3. Solar Beam   Power:60
   Type: Grass  PP: 9/9
4. Dragon Pulse   Power:30
   Type: Dragon  PP: 10/10
Enter 1-4: 3
Charizard used Solar Beam!
Charizard    Health: 160/210					Blastoise    Health: 60/300
Charizard    Health: 160/210					Blastoise    Health: 60/300
1. Fight
2. Use Item
3. Run
What would like to do?: 3
No. There is no running in a Trainer Battle.
Charizard    Health: 160/210					Blastoise    Health: 60/300
Blastoise used Ice Beam!
Charizard    Health: 130/210					Blastoise    Health: 60/300
1. Fight
2. Use Item
3. Run
What would like to do?: 2
Max Potion is being used.
Charizard's health was restored.
Charizard    Health: 210/210					Blastoise    Health: 60/300
Blastoise used Dragon Pulse!
Charizard    Health: 180/210					Blastoise    Health: 60/300
1. Fight
2. Use Item
3. Run
What would like to do?: 1
Choose your attack...
1. Flamethrower   Power:30
   Type: Fire  PP: 10/10
2. Tackle   Power:50
   Type: Normal  PP: 35/35
3. Solar Beam   Power:60
   Type: Grass  PP: 8/8
4. Dragon Pulse   Power:30
   Type: Dragon  PP: 10/10
Enter 1-4: 2
Charizard used Tackle!
Charizard    Health: 180/210					Blastoise    Health: 10/300
Blastoise used Hydro Pump!
Charizard    Health: 30/210					Blastoise    Health: 10/300
1. Fight
2. Use Item
3. Run
What would like to do?: 1
Choose your attack...
1. Flamethrower   Power:30
   Type: Fire  PP: 10/10
2. Tackle   Power:50
   Type: Normal  PP: 34/34
3. Solar Beam   Power:60
   Type: Grass  PP: 8/8
4. Dragon Pulse   Power:30
   Type: Dragon  PP: 10/10
Enter 1-4: 1
Charizard used Flamethrower!
Charizard    Health: 30/210					Blastoise    Health: 0/300
The enemy's Blastoise has fainted!
You win!!!!!!

Process finished with exit code 0
 */

//Output 3
/*
You encountered a Computer Player.
He sent out a Blastoise!
Blastoise:  Blastoise!!!!!

Go Charizard!
Charizard:  Charizard!!!!!

Charizard    Health: 210/210					Blastoise    Health: 300/300
1. Fight
2. Use Item
3. Run
What would like to do?: 3
No. There is no running in a Trainer Battle.
Charizard    Health: 210/210					Blastoise    Health: 300/300
Computer fled.

Process finished with exit code 0
 */
