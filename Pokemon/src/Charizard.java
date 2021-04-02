import java.util.ArrayList;
import java.util.Scanner;

public class Charizard extends Pokemon {

//    private String name = "Charizard";
//    private String type = "Fire";
//    private String typeTwo = "Flying";
//    private int hp = 210;
//    private int maxHp = 210;
    private ArrayList<Attack> cAttacks = new ArrayList<Attack>();
    private Scanner attackInput = new Scanner(System.in);

    Charizard() {
        super("Charizard", "Fire", "Flying", 210);
        setMoves();
    }

    @Override
    public void setMoves() {
        Attack flamethrower = new Attack("Flamethrower", "Fire", 30, 10);
        Attack tackle = new Attack();
        Attack solarBlaze = new Attack("Solar Blaze", "Grass", 90, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10);
        cAttacks.add(flamethrower);
        cAttacks.add(tackle);
        cAttacks.add(solarBlaze);
        cAttacks.add(dragonPulse);
    }

    @Override
    public void attack(Pokemon other) {
        System.out.println("Choose your attack...");
        for(int i = 0; i < cAttacks.size(); i++){
            System.out.println((i+1) + ". " + cAttacks.get(i));
        }
        System.out.print("Enter 1-4: ");
        int choice = attackInput.nextInt();
        other.takeDamage(cAttacks.get(choice - 1));
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }

    @Override
    public void takeDamage(Attack move) {
        if((move.getType().equals("Water")) || (move.getType().equals("Electric"))){
            int damage = (move.getPower()) * 2;
            setHp(getHp() - damage);
        }
        if(move.getType().equals("Rock")){
            int damage = move.getPower() * 4;
            setHp(getHp() - damage);
        }
        if((move.getType().equals("Bug")) || (move.getType().equals("Fire"))) {
            int damage = move.getPower() / 2;
            setHp(getHp() - damage);
        }
        if((move.getType().equals("Ground"))){
            int damage = 0;
        }
        else {
            setHp(getHp() - move.getPower());
        }
    }
}
