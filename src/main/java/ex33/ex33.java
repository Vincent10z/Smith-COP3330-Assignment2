/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("What's your question? ");
        Userinput.nextLine();
        String[] Multiplechoices = {"Yes", "No", "Maybe", "Ask Again later"};
        RandomAnswer(Multiplechoices);

    }
    public static void RandomAnswer(String[] Multiplechoices){
        Random choice = new Random();
        int n = choice.nextInt(4);
        System.out.println(Multiplechoices[n]);


    }
}
