package com.example;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] mark = {67, 67, 78, 89, 91, 77};
        int total = 0;
        double avg = 0.0;

        for(int x: mark) {
            total += x;
        }
        avg = total / mark.length;
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
    }
}
