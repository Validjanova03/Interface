package SelsiyKelvin;

import java.util.Scanner;

public class Convertasion implements TemperatureConvert{



    public double convertKelvin(double celcius){
        return celcius + 273.15;
    }
    public double convertFahrenheit(double celcius){
        return (celcius * 9/5) + 32;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Convertasion con = new Convertasion();
        System.out.println("Enter the temperature in Celcius: ");
        double celcius = sc.nextDouble();
        double fahrenheit = con.convertFahrenheit(celcius);
        double Kelvin = con.convertKelvin(celcius);

        System.out.println("Celcius " + celcius +" to Fahrenheit: " + fahrenheit);
        System.out.println("Celcius " + celcius+ " to Kelvin: " + Kelvin);
    }
}
