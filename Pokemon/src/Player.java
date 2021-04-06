public abstract class Player {

    protected Pokemon pokemon;
    protected Item item;

    Player(Pokemon p, Item i){
        pokemon = p;
        item = i;
    }

    public abstract Pokemon getPokemon();
    public abstract Item getItem();
    public abstract void run();

}
