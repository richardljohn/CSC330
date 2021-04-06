//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.util.Scanner;

public class HumanPlayer extends Player{

    //Constructor
    public HumanPlayer(Pokemon p, Item i) {
        super(p, i);
    }

    //Getting the Human player's Pokemon.
    @Override
    public Pokemon getPokemon() {
        return super.pokemon;
    }

    //Getting the Human player's Item.
    @Override
    public Item getItem() {
        return super.item;
    }

    //Human player attempting to run.
    @Override
    public void run() {
        System.out.print("You got away safely.");
    }
}
