/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex32;

import java.util.Random;
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {

        Guesser();


    }

    public static void Guesser() {

        Scanner Userinput = new Scanner(System.in);
        Random rand = new Random();
        int UserGuess, i;
        int k = 100;
        int lvl1 = rand.nextInt((10 - 1) + 1) + 1;
        int lvl2 = rand.nextInt((100 - 1) + 1) + 1;
        int lvl3 = rand.nextInt((1000 - 1) + 1) + 1;
        System.out.println("Lets play Guess the Number! ");
        System.out.println("Enter the difficulty level (1, 2, or 3) ");
        int level = Userinput.nextInt();

        if (level == 1) {
            System.out.println("I have my number, what's your guess? ");

            for (i = 0; i < k; i++) {
                UserGuess = Userinput.nextInt();
                if (lvl1 == UserGuess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    System.out.println("Would you like to play again? Y/N ");
                    String next =   Userinput.next();
                    if( next.equals("Y"))
                    {
                        Guesser();
                    }else break;

                    break;
                } else if (lvl1 > UserGuess) {
                    System.out.println("Too low, guess again: " );
                } else if (lvl1 < UserGuess) {
                    System.out.println("Too high, guess again: ");
                }
            }
        } else if (level == 2) {
            System.out.println("I have my number, what's your guess? ");

            for (i = 0; i < k; i++) {
                UserGuess = Userinput.nextInt();
                if (lvl2 == UserGuess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    System.out.println("Would you like to play again? Y/N ");
                    String next =   Userinput.next();
                    if( next.equals("Y")){
                        Guesser();
                    }else break;
                } else if (lvl2 > UserGuess) {
                    System.out.println("Too low, guess again: ");
                } else if (lvl2 < UserGuess) {
                    System.out.println("Too high, guess again: ");
                }
            }
        } else if (level == 3) {
            System.out.println("I have my number, what's your guess? ");

            for (i = 0; i < k; i++) {
                UserGuess = Userinput.nextInt();
                if (lvl3 == UserGuess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    System.out.println("Would you like to play again? Y/N ");
                    String next =   Userinput.next();
                    if( next.equals("Y")){
                        Guesser();
                    }else break;
                } else if (lvl3 > UserGuess) {
                    System.out.println("Too low, guess again: ");
                } else if (lvl3 < UserGuess) {
                    System.out.println("Too high, guess again: ");
                }
            }

        }
    }

}