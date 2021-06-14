/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex30;
public class ex30 {

    public static void main(String[] args) {
        int size= 12;
        Table(size);
}
    public static void Table(int size){
        System.out.format("");
        for(int i = 1; i <= size; ++i) {
            { for (int c = 1; c <= 12; ++c)
                System.out.format("%4d", i*c);
            }
            System.out.println();
        }
    }
}
