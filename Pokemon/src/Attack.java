//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

public class Attack {

    private String name;
    private String type;
    private int power;
    private int pp;
    private int maxPP;

    Attack(){
        name = "Tackle";
        type = "Normal";
        power = 50;
        pp = 35;
        maxPP = 35;
    }

    Attack(String n, String t, int p_, int pp_, int mpp){
        name = n;
        type = t;
        power = p_;
        pp = pp_;
        maxPP = mpp;
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

    public void setPP(int p){
        pp = p;
    }

    public int getMaxPP() { return maxPP; }

    public String toString(){
        String a = getName() + "   Power:" + getPower() + "\n   Type: " + getType() + "  " + "PP: " + getPP() + "/" + getPP();
        return a;
    }
}
