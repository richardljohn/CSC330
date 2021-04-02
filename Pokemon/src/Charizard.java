import java.util.ArrayList;

public class Charizard extends Pokemon {

    private String name = "Charizard";
    private String type = "Fire";
    private String typeTwo = "Flying";
    private int hp = 210;
    private int maxHp = 210;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    Charizard() {
        name = "Charizard";
        type = "Fire";
        typeTwo = "Flying";
        hp = 210;
        maxHp = 210;
        setMoves();
    }

    @Override
    public String getName() {
        return "Charizard";
    }

    @Override
    public String getType() {
        return "Fire/Flying";
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMaxHp() {
        return maxHp;
    }

    @Override
    public void setHp(int h) {
        hp = h;
    }

    @Override
    public void setMoves() {
        Attack flamethrower = new Attack("Flamethrower", "Fire", 30, 10);
        Attack tackle = new Attack();
        Attack solarBlaze = new Attack("Solar Blaze", "Grass", 90, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10);
        attacks.add(flamethrower);
        attacks.add(tackle);
        attacks.add(solarBlaze);
        attacks.add(dragonPulse);
    }

    @Override
    public void attack(Pokemon other) {
        System.out.println("Choose your attack...");
        for(int i = 0; i < attacks.size(); i++){
            System.out.println((i+1) + ". " + attacks.get(i));
        }
        System.out.print("Enter 1-4: ");
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }

    @Override
    public void takeDamage(Attack move) {
        if((move.getType().equals("Water")) || (move.getType().equals("Electric"))){
            int damage = move.getPower() * 2;
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
