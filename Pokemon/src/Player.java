public abstract class Player {

    private Pokemon pokemon;
    private Item item;

    Player(Pokemon p, Item i){
        pokemon = p;
        item = i;
    }

    public abstract Pokemon getPokemon();
    public abstract Item getItem();
    public abstract void run();

}
