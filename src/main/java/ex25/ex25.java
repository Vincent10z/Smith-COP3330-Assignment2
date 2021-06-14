/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex25 {
    public static void printStrongNess(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLetter = false,
                hasDigit = false,
                specialChar = false;
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        System.out.print("The password "+input);
        if (hasDigit && hasLetter && specialChar
                && (n >= 8))
            System.out.print(" is a Very Strong Password");
        else if (hasLetter && hasDigit
                && (n >= 8))
            System.out.print(" is a Strong Password ");
        else if (hasLetter && (n<8))
            System.out.print(" is a Weak Password");
        else if (hasDigit && (n<8))
            System.out.print(" is a Very Weak Password");
        else
            System.out.print(" is Undetermined");
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String input1 = input.next();
        printStrongNess(input1);
    }










}

