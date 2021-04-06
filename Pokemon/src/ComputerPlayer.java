//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

public class ComputerPlayer extends Player {


    ComputerPlayer(Pokemon p, Item i){
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
        System.out.println("Computer fled.");
    }

}
