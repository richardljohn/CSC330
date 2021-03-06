public class PreferredCustomer extends Customer {

    private double cummulativePurchases;
    private double discount;

    PreferredCustomer() {
        cummulativePurchases = 0.0;
        discount = 0.0;
    }

    PreferredCustomer(String n, String a, String p, int c, boolean w, double cu, double d){
        super(n, a, p, c, w);
        cummulativePurchases = cu;
        discount = d;
    }

    public double getCummulativePurchases(){
        return cummulativePurchases;
    }

    public void setCummulative(double c){
        cummulativePurchases = c;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double d){
        discount = d;
    }

    public void determineDiscount(){
        double discount = 0.0;
        if(cummulativePurchases < 500){
            discount = 0.0;
            setDiscount(discount);
        }
        else if(cummulativePurchases == 500){
            discount = 0.05;
            setDiscount(discount);
        }
        else {
            double total = getCummulativePurchases() - 500.0;
            discount = 0.05;
            while(total >= 500){
                total = total - 500.0;
                discount = discount + 0.01;

            }
            setDiscount(discount);
        }
    }

    public String toString() {
        return super.toString() +
                "\nCummulative Purchases: " + getCummulativePurchases() +
                "\nDiscount: " + getDiscount();
    }
    
}
