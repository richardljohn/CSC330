import java.lang.reflect.GenericArrayType;

public class PokemonBattle {
    public static void main(String[] args){
        Blastoise enemyBlastoise = new Blastoise();
        Charizard myCharizard = new Charizard();
        MaxPotion mP = new MaxPotion();
        Potion p = new Potion();
        HumanPlayer You = new HumanPlayer(myCharizard, mP);
        ComputerPlayer Com = new ComputerPlayer(enemyBlastoise, p);
        enemyBlastoise.attack(myCharizard);
        System.out.println();
        myCharizard.attack(enemyBlastoise);
    }
}

