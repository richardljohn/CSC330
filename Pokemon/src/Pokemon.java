import java.util.ArrayList;

public abstract class Pokemon {

    private String name;
    private String type;
    private String typeTwo;
    private int hp;
    private ArrayList<String> attacks = new ArrayList<String>();

    public abstract void attack(Pokemon other);
    public abstract void speak();
}
