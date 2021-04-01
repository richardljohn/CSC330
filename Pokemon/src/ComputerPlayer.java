public class ComputerPlayer extends Player {

    private Pokemon pokemon;
    private Item item;

    ComputerPlayer(Pokemon p, Item i){
        super(p, i);
    }

    @Override
    public Pokemon getPokemon() {
        return pokemon;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public void run() {
        System.out.println("Computer fled.");
    }

}
