/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */

package ex36;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<Integer>();
        try {
            while (true) {
                int x = userInput.nextInt();
                aList.add(x);
            }
        }
        catch (Exception e) {
            return;
        }
        for (int element : aList)
            System.out.println(element);





        var operation = userInput.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = Calcs.Average(ele);
                break;
            case "-":
                result = Calcs.Minimum(d1, d2);
                break;
            case "*":
                result = Calcs.Maximum(d1, d2);
                break;
            case "/":
                result = Calcs.StdDeviation(d1, d2);
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " + result);
    }

