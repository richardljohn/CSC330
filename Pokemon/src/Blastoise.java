import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Blastoise extends Pokemon{

    Blastoise(){
        super("Blastoise", "Water", "None", 300);
    }

    @Override
    public ArrayList<Attack> giveMoves() {
        ArrayList<Attack> bAttacks = new ArrayList<Attack>();
        Attack hydroPump = new Attack("Hydro Pump", "Water", 50, 5);
        Attack tackle = new Attack();
        Attack iceBeam = new Attack("Ice Beam", "Ice", 30, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10);
        bAttacks.add(hydroPump);
        bAttacks.add(tackle);
        bAttacks.add(iceBeam);
        bAttacks.add(dragonPulse);
        return bAttacks;
    }

    @Override
    public void attack(Pokemon other) {
        Random decision = new Random();
//        super.displayMoves();
        int choice = decision.nextInt(4);
        System.out.println(getName() + " used " + selectAttack(choice).getName() + "!");
        other.takeDamage(selectAttack(choice));
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }

    @Override
    public void takeDamage(Attack move) {
        if((move.getType().equals("Grass")) || (move.getType().equals("Electric"))){
            if(getHp() - move.getPower()*2 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower());
            }
        }
        if((move.getType().equals("Ice")) || (move.getType().equals("Fire")) || (move.getType().equals("Water"))) {
            if(getHp() - move.getPower()/2 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower()/2);
            }
        }
        else {
            if(getHp() - move.getPower() < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower());
            }
        }
    }
}
