import java.util.ArrayList;

public class MaxElixir implements Item {

    @Override
    public void use(Pokemon p){
        System.out.println("Max Elixir is being used.");
        ArrayList<Attack> a = p.getAttacks();
        for(int i = 0; i < a.size(); i++){
            a.get(i).setPP(a.get(i).getMaxPP());
        }
        p.setMoves(a);
    }

}