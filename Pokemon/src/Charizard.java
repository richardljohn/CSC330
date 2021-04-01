import java.util.ArrayList;

public class Charizard extends Pokemon {

    private String name = "Charizard";
    private String type = "Fire";
    private String typeTwo = "Flying";
    private int hp = 120;
    private int maxHp = 120;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

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

    }

    @Override
    public void attack(Pokemon other) {

    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }
}
