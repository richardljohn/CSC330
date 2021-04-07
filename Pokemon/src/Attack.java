//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Class: CSC 330
//Assignment: Pokemon Lab
//Date: April 5, 2021

public class Attack {

    //An attack's information.
    private String name;
    private String type;
    private int power;
    private int pp;
    private int maxPP;

    //Default attack is Tackle.
    Attack(){
        name = "Tackle";
        type = "Normal";
        power = 50;
        pp = 35;
        maxPP = 35;
    }

    //Specific move constructor
    Attack(String n, String t, int p_, int pp_){
        name = n;
        type = t;
        power = p_;
        pp = pp_;
        maxPP = pp_;
    }

    //Public methods.
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
    public int getMaxPP() { return maxPP; }
    public void setPP(int p){
        pp = p;
    }

    //A way an attack is displayed.
    public String toString(){
        String a = getName() + "   Power:" + getPower() + "\n   Type: " + getType() + "  " + "PP: " + getPP() + "/" + getMaxPP();
        return a;
    }
}
