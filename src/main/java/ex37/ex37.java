package ex37;

import java.util.ArrayList;
import java.util.Random;

public class ex37 {
    public static void main(String[] args) {

        ArrayList<Character> UpperCase = new ArrayList<Character>();
        ArrayList<Character> LowerCase = new ArrayList<Character>();
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        ArrayList<Character> Special = new ArrayList<Character>('/', '-', '.', '^', '&', '*', '_', '!',
                '@', '%', '=', '+', '>');
        int length = 10;
        String symbol = "-/.^&*_!@%=+>)";
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";


        String finalString = cap_letter + small_letter +
                numbers + symbol;

        Random random = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++)
        {
            password[i] =
                    finalString.charAt(random.nextInt(finalString.length()));

        }
        System.out.println(password);

    }
}
