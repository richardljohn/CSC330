import java.util.ArrayList;

public abstract class Pokemon {

    private String name;
    private String type;
    private String typeTwo;
    private int hp;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    public abstract String getName();
    public abstract String getType();
    public abstract int getHp();
    public abstract int getMaxHp();
    public abstract void setHp(int h);
    public abstract void setMoves();

    public abstract void attack(Pokemon other);
    public abstract void speak();
}
