import java.util.ArrayList;

public class Dragonite extends Pokemon{
    private String name = "Dragonite";
    private String type = "Dragon";
    private String typeTwo = "Flying";
    private int hp = 150;
    private int maxHp = 150;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    @Override
    public String getName() {
        return "Dragonite";
    }

    @Override
    public String getType() {
        return "Dragon/Flying";
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMaxHp(){
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
