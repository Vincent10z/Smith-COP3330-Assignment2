/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex29 {

    public static void main(String[] args) {
        getinput();
    }

    public static double getinput(){

        Scanner userinput = new Scanner(System.in);
        double ratereturn = 0;

        do {
            System.out.print("What is the rate of return?: ");
            try {
                ratereturn = userinput.nextDouble();
            }catch (InputMismatchException e){
                userinput.next();
                System.out.println("Sorry that's not a valid input! ");
            }
        } while (!(ratereturn>0));

        if (ratereturn > 0) {
            double finalreturn = 72 / ratereturn;
            System.out.println("It will take " + finalreturn + " years to double your investment.");
        }
        return ratereturn;
    }
}