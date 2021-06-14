/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex24;
import java.util.Scanner;


public class ex24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams ");
        System.out.println("Enter the first string: ");
        String input1 = input.next();
        System.out.println("Enter the second string: ");
        String input2 = input.next();
        if(isAnagram(input1, input2))
            System.out.println(input1 + " and " + input2 + " are anagrams");
        else
            System.out.println(input1 + " and " + input2 + " are not anagrams");

    }

    public static boolean isAnagram(String s1, String s2){
            if(s1.length() != s2.length()) return false;
            int [] recur = new int[26];
            for(int i = 0 ; i<s1.length(); i++)
            {
                recur[s1.charAt(i) - 'a']++;
                recur[s2.charAt(i) - 'a']--;
            }
            for (int x : recur){
                if (x!=0) return false;
            }
            return true;

        }

    }







