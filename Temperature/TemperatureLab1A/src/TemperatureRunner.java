import java.util.Scanner; //Importing Scanner

public class TemperatureRunner{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double t = input.nextDouble();
        Temperature temp = new Temperature(t);
        System.out.println("Temperature in Farenheit is: " + temp.getFarenheit() + " F.");
        System.out.println("Temperature in Celsius is: " + temp.getCelsius() + " C.");
        System.out.println("Temperature in Kelvin is: " + temp.getKelvin() + " K.");
    }
}

/*
Output:
Enter a temperature: 42
Temperature in Farenheit is: 42.0 F.
Temperature in Celsius is: 5.555555555555555 C.
Temperature in Kelvin is: 278.55555555555554 K.

Process finished with exit code 0

Enter a temperature: 32
Temperature in Farenheit is: 32.0 F.
Temperature in Celsius is: 0.0 C.
Temperature in Kelvin is: 273.0 K.

Process finished with exit code 0
 */