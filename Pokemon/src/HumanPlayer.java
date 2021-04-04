import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Pokemon p, Item i) {
        super(p, i);
    }

    @Override
    public Pokemon getPokemon() {
        Charizard C = new Charizard();
        return C;
    }

    @Override
    public Item getItem() {
        MaxPotion M = new MaxPotion();
        return M;
    }

    @Override
    public void run() {
        System.out.print("You got away safely.");
    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Fight");
        System.out.println("2. Bag");
        System.out.println("3. Run");
        System.out.println("What would like to do?: ");
        int choice = input.nextInt();
        if(choice == 1){
            getPokemon().displayMoves();
        }
    }
}
