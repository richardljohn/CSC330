//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

public class MaxPotion implements Item{

    @Override
    public void use(Pokemon p) {
        System.out.println("Max Potion is being used.");
        if(p.getHp() == p.getMaxHp()){
            System.out.println("It had no effect.");
        }
        else {
            System.out.println(p.getName() + "'s health was restored.");
            int max = p.getMaxHp();
            p.setHp(max);
        }
    }

}
