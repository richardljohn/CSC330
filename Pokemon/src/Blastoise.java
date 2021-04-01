import java.util.ArrayList;

public class Blastoise extends Pokemon{
    private String name = "Blastoise";
    private String type = "Water";
    private String typeTwo = "None";
    private int hp = 300;
    private int maxHp = 300;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    Blastoise(){
        name = "Blastoise";
        type = "Water";
        typeTwo = "None";
        hp = 300;
        maxHp = 300;
        setMoves();
    }

    @Override
    public String getName() {
        return "Blastoise";
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMaxHp(){
        return maxHp;
    }

    @Override
    public void setHp(int h) {
        hp = h;
    }

    @Override
    public void setMoves() {
        Attack hydroPump = new Attack("Hydro Pump", "Water", 70, 5);
        Attack tackle = new Attack();
        Attack iceBeam = new Attack("Ice Beam", "Ice", 30, 10);
        Attack dragonPulse = new Attack("Dragon Pulse", "Dragon", 30, 10);
        attacks.add(hydroPump);
        attacks.add(tackle);
        attacks.add(iceBeam);
        attacks.add(dragonPulse);
    }

    @Override
    public void attack(Pokemon other) {
        System.out.println("Choose your attack...");
        for(int i = 0; i < attacks.size(); i++){
            System.out.println((i+1) + ". " + attacks.get(i));
        }
        System.out.print("Enter 1-4: ");
    }

    @Override
    public void speak() {
        System.out.println(getName() + "!!!!!");
    }
}
