import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pokemon {

    private String name;
    private String type;
    private String typeTwo;
    private int hp;
    private int maxHp;

    Pokemon(String n, String t, String tt, int h){
        name = n;
        type = t;
        typeTwo = tt;
        hp = h;
        maxHp = h;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getTypeTwo(){
        return typeTwo;
    }
    public int getHp(){
        return hp;
    }
    public int getMaxHp(){
        return maxHp;
    }

    public void setName(String n){
        name = n;
    }

    public void setType(String t){
        type = t;
    }

    public void setTypeTwo(String t){
        typeTwo = t;
    }

    public void setHp(int h){
        hp = h;
    }

    public void setMaxHp(int mh){
        maxHp = mh;
    }

    public abstract void setMoves();
    public abstract void attack(Pokemon other);
    public abstract void speak();
    public abstract void takeDamage(Attack move);
}
