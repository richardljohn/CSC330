public class Customer extends Person {

    private int custNum;
    private boolean waitList;

    Customer(){
        custNum = 1;
        waitList = false;
    }

    Customer(String n, String a, String p, int c, boolean w){
        super(n, a, p);
        custNum = c;
        waitList = w;
    }

    public int getCustNum(){
        return custNum;
    }

    public void setCustNum(int c){
        custNum = c;
    }

    public boolean getWait(){
        return waitList;
    }

    public void setWait(boolean w){
        waitList = w;
    }

    public String toString() {
        String interest;
        if(!getWait()){
            interest = "Not Interested.";
        } else {
            interest = "Interested.";
        }
        return super.toString() + "\nCustomer Number: " + getCustNum() + "\nWaitlist: " + interest;
    }

}
