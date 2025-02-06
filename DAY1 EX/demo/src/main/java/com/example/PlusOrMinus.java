package com.example;
import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number >= 0) ? "positive" : "negative";
        System.out.println("The number is " + result);

        scanner.close();   
    }
    
}
