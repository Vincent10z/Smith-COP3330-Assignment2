/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */

package ex38;

import java.util.*;

public class ex38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers separated by a space: ");

        String line = input.nextLine();
        String[] strArray = line.split(" ");
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);

        }
        filterEvenNumbers(numbers);
    }


    public static void filterEvenNumbers(int[] numbers){

        System.out.println("Even Numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

        }







