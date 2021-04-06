//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

public class ComputerPlayer extends Player {

    //Computer Player information.
    ComputerPlayer(Pokemon p, Item i){
        super(p, i);
    }

    //Getting the computer player's Pokemon.
    @Override
    public Pokemon getPokemon() {
        return super.pokemon;
    }

    //Getting the computer player's Item.
    @Override
    public Item getItem() {
        return super.item;
    }

    //Computer running.
    @Override
    public void run() {
        System.out.println("Computer fled.");
    }

}
