//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

import java.util.ArrayList;

public class MaxElixir implements Item {

    //When a Max Elixir is used a Pokemon's moves have their PP fully restored.
    @Override
    public void use(Pokemon p){
        System.out.println("Max Elixir is being used.");
        System.out.println(p.getName() + "'s moves were restored!!");
        ArrayList<Attack> a = p.getAttacks();
        for(int i = 0; i < a.size(); i++){
            a.get(i).setPP(a.get(i).getMaxPP());
        }
        p.setMoves(a);
    }

}
