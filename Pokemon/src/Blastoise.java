//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Blastoise extends Pokemon{

    //Default Blastoise Information.
    Blastoise(){
        super("Blastoise", "Water", "None", 300);
    }

    //Blastoise's moves.
    @Override
    public ArrayList<Attack> giveMoves() {
        ArrayList<Attack> bAttacks = new ArrayList<Attack>();
        Attack hydroPump = new Attack("Hydro Pump", "Water", 50, 5, 5);
        Attack tackle = new Attack();
        Attack iceBeam = new Attack("Ice Beam", "Ice", 30, 10, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10, 10);
        bAttacks.add(hydroPump);
        bAttacks.add(tackle);
        bAttacks.add(iceBeam);
        bAttacks.add(dragonPulse);
        return bAttacks;
    }

    //Blastoise's way of attacking.
    @Override
    public void attack(Pokemon other) {
        Random decision = new Random();
        int choice = decision.nextInt(4);
        if(selectAttack(choice).getPP() == 0){
            System.out.println(selectAttack(choice).getName() + " has no more PP!");
            super.displayMoves();
            System.out.println("Enter 1-4: ");
            choice = decision.nextInt();
        }
        System.out.println(getName() + " used " + selectAttack(choice).getName() + "!");
        other.takeDamage(selectAttack(choice));
        selectAttack(choice).setPP(selectAttack(choice).getPP());
    }

    //Blastoise speaking
    @Override
    public void speak() {
        System.out.println(getName() + ":  " + getName() + "!!!!!");
    }

    //Blastoise's weaknesses and resistances.
    @Override
    public void takeDamage(Attack move) {

        //Super effective.
        if((move.getType().equals("Grass")) || (move.getType().equals("Electric"))){
            if(getHp() - move.getPower()*2 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower());
            }
        }

        //Not very effective.
        if((move.getType().equals("Ice")) || (move.getType().equals("Fire")) || (move.getType().equals("Water"))) {
            if(getHp() - move.getPower()/2 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower()/2);
            }
        }

        //Normally effective.
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
