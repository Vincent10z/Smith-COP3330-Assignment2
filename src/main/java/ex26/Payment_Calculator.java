/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex26;

import java.text.NumberFormat;
import java.util.Scanner;

public class Payment_Calculator {

    public static double CalculateMonthsUntilPaidOff(double balance, double apr, double Userpayment)
    {
        double result;
        double percrate = (apr / 100.0);
        double dailyrate = percrate/365;


        double power = Math.pow((dailyrate+dailyrate),30);
        result = -(1) * (Math.log(1+((balance*(1-power))/Userpayment)));

        result = result / 30;
        result = result / (Math.log(1+dailyrate));
        result = -(result);



        return result;
    }

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("What is your balance? ");
        double balance = UserInput.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        double apr = UserInput.nextDouble();
        System.out.println("What is the monthly payment you can make? ");
        double Userpayment = UserInput.nextDouble();

        double result = CalculateMonthsUntilPaidOff(balance, apr, Userpayment);

        System.out.println("It will take you " + result + " months to pay off this card." );

    }
}
