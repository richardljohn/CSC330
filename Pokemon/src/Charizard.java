import java.util.ArrayList;
import java.util.Scanner;

public class Charizard extends Pokemon {

    Charizard() {
        super("Charizard", "Fire", "Flying", 210);
    }

    @Override
    public ArrayList<Attack> giveMoves() {
        ArrayList<Attack> cAttacks = new ArrayList<Attack>();
        Attack flamethrower = new Attack("Flamethrower", "Fire", 30, 10);
        Attack tackle = new Attack();
        Attack solarBlaze = new Attack("Solar Beam", "Grass", 60, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10);
        cAttacks.add(flamethrower);
        cAttacks.add(tackle);
        cAttacks.add(solarBlaze);
        cAttacks.add(dragonPulse);
        return cAttacks;
    }

    @Override
    public void attack(Pokemon other) {
        Scanner input = new Scanner(System.in);
        super.displayMoves();
        System.out.print("Enter 1-4: ");
        int choice = input.nextInt();
        System.out.println(getName() + " used " + selectAttack(choice-1).getName() + "!");
        other.takeDamage(selectAttack(choice-1));
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }

    @Override
    public void takeDamage(Attack move) {
        if((move.getType().equals("Water")) || (move.getType().equals("Electric"))){
            if(getHp() - move.getPower() * 2 < 0){
                setHp(0);
            }
            setHp(getHp() - move.getPower() * 2);
        }
        if(move.getType().equals("Rock")){
            if(getHp() - move.getPower() * 4 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower() * 4);
            }
        }
        if((move.getType().equals("Bug")) || (move.getType().equals("Fire"))) {
            if(getHp() - move.getPower() / 2 < 0){
                setHp(0);
            }
            else {
                setHp(getHp() - move.getPower());
            }
        }
        if((move.getType().equals("Ground"))){
            System.out.println("It didn't have any effect.");
        }
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
