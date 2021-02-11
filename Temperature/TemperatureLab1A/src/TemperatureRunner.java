//Name: Richard John
//Class: CSC 330
//Instructor: Professor Richard Weir
//Assignment: Lab1a - Temperatures

import java.util.Scanner; //Importing Scanner

public class TemperatureRunner{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //User Input
        System.out.print("Enter a temperature: ");

        //First temperature...
        double t = input.nextDouble();
        Temperature temp = new Temperature(t);

        //Getting first temperature in Farenheit, Celsius, and Kelvin.
        System.out.println("Temperature in Farenheit is: " + temp.getFarenheit() + " F.");
        System.out.println("Temperature in Celsius is: " + temp.getCelsius() + " C.");
        System.out.println("Temperature in Kelvin is: " + temp.getKelvin() + " K.");
        System.out.print("Enter one more temperature: ");

        //Second temperature...
        double te = input.nextDouble();
        temp.setFarenheit(te);

        //Getting second temperature in Farenheit, Celsius, and Kelvin.
        System.out.println("Now the temperature in Farenheit is : " + temp.getFarenheit() + " F.");
        System.out.println("Now the temperature in Celsius is: " + temp.getCelsius() + " C.");
        System.out.println("Now the temperature in Kelvin is: " + temp.getKelvin() + " K.");
    }
}

/*
Output:
Enter a temperature: 30
Temperature in Farenheit is: 30.0 F.
Temperature in Celsius is: -1.1111111111111112 C.
Temperature in Kelvin is: 271.8888888888889 K.
Enter one more temperature: 15
Now the temperature in Farenheit is : 15.0 F.
Now the temperature in Celsius is: -9.444444444444445 C.
Now the temperature in Kelvin is: 263.55555555555554 K.

Process finished with exit code 0

Enter a temperature: 50000000000000000000000
Temperature in Farenheit is: 4.9999999999999996E22 F.
Temperature in Celsius is: 2.7777777777777777E22 C.
Temperature in Kelvin is: 2.7777777777777777E22 K.
Enter one more temperature: 1
Now the temperature in Farenheit is : 1.0 F.
Now the temperature in Celsius is: -17.22222222222222 C.
Now the temperature in Kelvin is: 255.77777777777777 K.

Process finished with exit code 0
 */