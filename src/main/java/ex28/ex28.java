/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex28;

import java.util.Scanner;

public class ex28 {

    public static void main(String args[]) {

        int MaxNum = 5;
        double total = 0;
        Scanner userInput = new Scanner(System.in);

        for (int num1 = 0; num1 < MaxNum; num1++) {
            System.out.print("Please enter a number: ");
            total += userInput.nextInt();
        }

        System.out.println("The total is : " + (total));

    }



}
