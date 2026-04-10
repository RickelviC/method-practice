package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a number");
        int number = user.nextInt();

        boolean even = isEven(number);

        double positive = isPositive(number);

        System.out.println(even);
        System.out.println(positive);


    }

    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public static double isPositive(double number){
        return Math.abs(number);
    }
}
