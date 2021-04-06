//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Pokemon p, Item i) {
        super(p, i);
    }

    @Override
    public Pokemon getPokemon() {
        return super.pokemon;
    }

    @Override
    public Item getItem() {
        return super.item;
    }

    @Override
    public void run() {
        System.out.print("You got away safely.");
    }

    public void menu(Player enemy){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Fight");
        System.out.println("2. Use Item");
        System.out.println("3. Run");
        System.out.println("What would like to do?: ");
        int choice = input.nextInt();
        if(choice == 1){
            getPokemon().attack(enemy.getPokemon());
        }
        if(choice == 2){
            getItem().use(getPokemon());
        }
    }
}
