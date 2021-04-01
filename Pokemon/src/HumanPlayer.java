public class HumanPlayer extends Player{

    private Pokemon pokemon;
    private Item item;

    public HumanPlayer(Pokemon p, Item i) {
        pokemon = p;
        item = i;
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
        System.out.print("I am running!");
    }

    public void setPokemon(Pokemon p){
        pokemon = p;
    }

    public void setItem(Item i) {
        item = i;
    }
}
