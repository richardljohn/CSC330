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

    public void setPokemon(Pokemon p){
        super.pokemon = p;
    }

    public void setItem(Item i) {
        super.item = i;
    }
}
