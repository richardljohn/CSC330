//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pokemon {

    //Private variables.
    private String name;
    private String type;
    private String typeTwo;
    private int hp;
    private int maxHp;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    //Only One constructor. Since there is no default Pokemon class.
    Pokemon(String n, String t, String tt, int h){
        name = n;
        type = t;
        typeTwo = tt;
        hp = h;
        maxHp = h;
        setMoves(giveMoves());
    }


    //Public methods
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
    public ArrayList<Attack> getAttacks(){
        return attacks;
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
    public void setMoves(ArrayList<Attack> pkmnAttacks){
        attacks.clear();
        for(int i = 0; i < pkmnAttacks.size(); i++){
            attacks.add(pkmnAttacks.get(i));
        }
    }

    //Displays Each Pokemon's attacks
    public void displayMoves(){
        System.out.println("Choose your attack...");
        for(int i = 0; i < attacks.size(); i++) {
            System.out.println((i+1) + ". " + attacks.get(i));
        }
    }

    //Selects an attack from a Pokemon's moveset.
    public Attack selectAttack(int choice){
        return attacks.get(choice);
    }

    //How every Pokemon will be displayed.
    public String toString(){
        String a = getName() + "    Health: " + getHp() + "/" + getMaxHp();
        return a;
    }

    //Abstract methods.
    public abstract ArrayList<Attack> giveMoves();
    public abstract void attack(Pokemon other);
    public abstract void speak();
    public abstract void takeDamage(Attack move);
}
