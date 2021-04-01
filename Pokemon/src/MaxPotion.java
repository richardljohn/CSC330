public class MaxPotion implements Item{

    @Override
    public void use(Pokemon p) {
        System.out.println("Max Potion is being used.");
        int num = p.getMaxHp();
        if(p.getHp() == num){
            System.out.println("It had no effect.");
        }
        else {
            System.out.println(p.getName() + "'s was restored.");
            p.setHp(p.getMaxHp());
        }
    }
    
}
