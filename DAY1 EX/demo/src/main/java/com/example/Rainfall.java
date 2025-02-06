package com.example;
import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dailyRainfall = new double[7];
        double sum = 0.0;

        System.out.println("Enter the rainfall in mm for 7 days:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            dailyRainfall[i] = scanner.nextDouble();
            sum += dailyRainfall[i];
        }

        double average = sum / 7.0;

        String classification;
        if (average <= 0) {
            classification = "No Rain";
        } else if (average < 10) {
            classification = "Light";
        } else if (average < 35.5) {
            classification = "Moderate";
        } else if (average < 64.4) {
            classification = "Rather Heavy";
        } else if (average < 124.4) {
            classification = "Heavy";
        } else {
            classification = "Very Heavy";
        }

        System.out.printf("\nAverage rainfall for the week: %.2f mm%n", average);
        System.out.println("Rainfall intensity classification: " + classification);
        
        scanner.close();
    }
}
