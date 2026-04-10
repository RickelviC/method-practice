package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("what is your first name: ");
        String firstName = user.nextLine();

        System.out.println("what is your first name: ");
        String lastName = user.nextLine();
        String name= formatName(firstName, lastName);

        System.out.println("your full name is " + name);
    }
    public static String formatName(String first, String last){

        return last + " , " + first;
    }

}
