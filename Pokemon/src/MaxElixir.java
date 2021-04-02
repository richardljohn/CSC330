public class MaxElixir implements Item {

    @Override
    public void use(Pokemon p){
        System.out.println("Potion is being used.");
        if(p.getHp() == p.getMaxHp()){
            System.out.println("It had no effect.");
        }
        else {
            System.out.println(p.getName() + "'s was restored.");
            if(p.getHp() + 20 > p.getMaxHp()){
                p.setHp(p.getMaxHp());
            }
            else {
                p.setHp(p.getHp() + 20);
            }
        }
    }

}
