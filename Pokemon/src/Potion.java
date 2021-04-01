public class Potion implements Item {

    @Override
    public void use(Pokemon p){
        System.out.println("Potion is being used.");
        int num = p.getMaxHp();
        if(p.getHp() == num){
            System.out.println("It had no effect.");
        }
        else {
            System.out.println(p.getName() + "'s was restored.");
            if(num + 20 > p.getMaxHp()){
                p.setHp(p.getMaxHp());
            }
            else {
                p.setHp(p.getHp() + 20);
            }
        }
    }

}
