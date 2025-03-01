package com.example;
import java.util.Scanner;

public class SumAndAverageN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of values (N): ");
        int n = scanner.nextInt();
        
        double sum = 0;
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }
        
        double average = sum / n;
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        
        scanner.close();
    }
}