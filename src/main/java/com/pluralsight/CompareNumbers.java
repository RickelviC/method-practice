package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a number");
        int number = user.nextInt();

        boolean even = isEven(number);

        boolean positive = isPositive(number);

        System.out.println("is " + number + " Even: " + even);
        System.out.println("is " + number + " positive: " + positive);


    }

    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public static boolean isPositive(double number){
        // return Math.abs(number);
        return number > 0;
    }
}
