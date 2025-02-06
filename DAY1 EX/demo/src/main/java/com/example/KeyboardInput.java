package com.example;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=s.nextInt();
        System.out.println("The number you entered is: " + a);

    }
    
}
