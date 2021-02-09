public class Temperature {

    //Our private data variables.
    private double ftemp;

    //Our public data variables.

    //Constructor.
    Temperature(double temp){
        ftemp = temp;
    }

    //Getting temp. in Farenheit.
    public double getFarenheit() {
        return ftemp;
    }

    //Altering temp. in Farenheit.
    public void setFarenheit(double temp){
        ftemp = temp;
    }

    //Getting temp. in Celsius.
    public double getCelsius() {
        double cel = ((5/9.0) * (ftemp - 32));
        return cel;
    }

    //Getting temp. in Kelvin.
    public double getKelvin() {
        return (getCelsius() + 273);
    }
}
