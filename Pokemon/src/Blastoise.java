import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Blastoise extends Pokemon{
    private String name = "Blastoise";
    private String type = "Water";
    private String typeTwo = "None";
    private int hp = 300;
    private int maxHp = 300;
    private ArrayList<Attack> bAttacks = new ArrayList<Attack>();
    private Scanner attackInput = new Scanner(System.in);

    Blastoise(){
        super("Blastoise", "Water", "None", 300);
        setMoves();
    }

    @Override
    public ArrayList<Attack> setMoves() {
        ArrayList<Attack> bAttacks = new ArrayList<Attack();
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
        System.out.println("Choose your attack...");
        for(int i = 0; i < bAttacks.size(); i++){
            System.out.println((i+1) + ". " + bAttacks.get(i));
        }
        System.out.print("Enter 1-4: ");
        int choice = attackInput.nextInt();
        other.takeDamage(bAttacks.get(choice - 1));
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }

    @Override
    public void takeDamage(Attack move) {
        if((move.getType().equals("Grass")) || (move.getType().equals("Electric"))){
            int damage = move.getPower() * 2;
            setHp(getHp() - damage);
        }
        if((move.getType().equals("Ice")) || (move.getType().equals("Fire")) || (move.getType().equals("Water"))) {
            int damage = move.getPower() / 2;
            setHp(getHp() - damage);
        }
        else {
            setHp(getHp() - move.getPower());
        }
    }
}
