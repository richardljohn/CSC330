public class PreferredCustomer extends Customer {

    private double cummulativePurchases;
    private double discount;

    PreferredCustomer(){
        cummulativePurchases = 0.0;
        discount = 0.0;
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
        if(cummulativePurchases < 500){
            discount = 0.0;
        }
        else if(cummulativePurchases == 500){
            discount = 0.05;
        }
        else {
            double total = getCummulativePurchases() - 500.0;
            discount = 0.05;
            while(total >= 500){
                total = total - 500.0;
                discount += 0.01;
            }
        }
    }
    
}
