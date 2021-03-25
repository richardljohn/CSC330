public class Attack {

    private String name;
    private String type;
    private int power;
    private int pp;

    Attack(){
        name = "Tackle";
        type = "Normal";
        power = 50;
        pp = 35;
    }

    Attack(String n, String t, int p, int power_){
        name = n;
        type = t;
        power = p;
        pp = power_;
    }

    public String getName(){
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getPP(){
        return pp;
    }

    public String toString(){
        String a = getName() + "   " + getPower() + "\n" + getType() + "  " + getPP();
        return a;
    }
}
