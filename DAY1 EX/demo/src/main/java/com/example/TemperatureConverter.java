package com.example;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is your temperature celcius or fahrenheit type c or f: ");
        String tempType = scanner.nextLine();
        if (tempType.equals("c")) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } else {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + celsius);
        }

    }
    
}
