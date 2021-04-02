public class HumanPlayer extends Player{

    private Pokemon pokemon;
    private Item item;

    public HumanPlayer(Pokemon p, Item i) {
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
        System.out.print("You got away safely.");
    }

    public void setPokemon(Pokemon p){
        pokemon = p;
    }

    public void setItem(Item i) {
        item = i;
    }
}
