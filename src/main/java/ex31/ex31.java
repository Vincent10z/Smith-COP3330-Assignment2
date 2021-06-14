/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        int age=0;
        int restingrate=0;

        do {
            System.out.println("Please enter your age: ");
            try {
                age = Userinput.nextInt();
            } catch (InputMismatchException e) {
                Userinput.next();
                System.out.println("Sorry that's not a valid input! ");
            }
        }while (!(age>0));

        do {
            System.out.println("Please enter your resting heart rate: ");

            try {
                restingrate = Userinput.nextInt();
            } catch (InputMismatchException e) {
                Userinput.next();
                System.out.println("Sorry that's not a valid input! ");
            }
        }while (!(restingrate>0));

        HRcalc(age, restingrate);


    }

    public static void HRcalc(int age, int restingrate){
        System.out.println("Resting Pulse: " +restingrate + " Age: "+age);
        System.out.println("Intensity     Rate ");
        for (int i =55; i<=95;i+=5){
            int targetheartrate = (int)Math.round((((220-age)-restingrate)*(i/100.0))+restingrate);
            System.out.println(i+"%           "+targetheartrate+"bpm");
            }


    }
}


