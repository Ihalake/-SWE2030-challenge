/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

import java.util.Scanner;

/**
 *
 * @author Issene Halake
 */
public class Tempconversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // a program that asks the user for input on the temprature  conversion they would like then takes in the data 
    //converts to either farenheint degrees celcius or kelvin.
    Scanner s = new Scanner(System.in);
 
   

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");

        int choice = s.nextInt();

        double temperature, convertedTemperature;
        String fromUnit, toUnit;

        switch (choice) {
            case 1:
                fromUnit = "Fahrenheit";
                toUnit = "Celsius";
                System.out.print("Enter the temperature in Fahrenheit: ");
                temperature = s.nextDouble();
                convertedTemperature = (temperature - 32) * 5 / 9;
                break;
            case 2:
                fromUnit = "Celsius";
                toUnit = "Fahrenheit";
                System.out.print("Enter the temperature in Celsius: ");
                temperature = s.nextDouble();
                convertedTemperature = temperature * 9 / 5 + 32;
                break;
            case 3:
                fromUnit = "Celsius";
                toUnit = "Kelvin";
                System.out.print("Enter the temperature in Celsius: ");
                temperature = s.nextDouble();
                convertedTemperature = temperature + 273.15;
                break;
            case 4:
                fromUnit = "Kelvin";
                toUnit = "Celsius";
                System.out.print("Enter the temperature in Kelvin: ");
                temperature = s.nextDouble();
                convertedTemperature = temperature - 273.15;
                break;
            case 5:
                fromUnit = "Fahrenheit";
                toUnit = "Kelvin";
                System.out.print("Enter the temperature in Fahrenheit: ");
                temperature = s.nextDouble();
                convertedTemperature = (temperature - 32) * 5 / 9 + 273.15;
                break;
            case 6:
                fromUnit = "Kelvin";
                toUnit = "Fahrenheit";
                System.out.print("Enter the temperature in Kelvin: ");
                temperature = s.nextDouble();
                convertedTemperature = (temperature - 273.15) * 9 / 5 + 32;
                break;
            default:
                System.out.println("Invalid choice.");
               
                return;
        }

        System.out.println("The temperature in " + fromUnit + " is " + temperature);
        System.out.println("Converted to " + toUnit + ": " + convertedTemperature);

        
    }
}

    
    
    

