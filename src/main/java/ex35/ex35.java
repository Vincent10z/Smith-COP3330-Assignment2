/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex35;
import java.util.Random;
import java.util.Scanner;

public class ex35 {

    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);

        String [] Names = new String[5];

        for(int i = 1; i <= Names.length; i++) {

            System.out.print("Enter a name: ");

            Names[i-1] = Userinput.nextLine();
        }
        Randomwinner(Names);
    }


    public static void Randomwinner(String[] Names){
        Random choice = new Random();
        int n = choice.nextInt(5);
        System.out.println("The winner is... "+Names[n]);


    }
}
