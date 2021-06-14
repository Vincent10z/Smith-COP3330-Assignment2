/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex27;

import java.util.*;

public class ex27 {
    public static void main (String[] args)
    {
        EmployeeFirstname();
        EmployeeLastName();
        EmployeeZip();
        EmployeeID();



    }

    public static void EmployeeFirstname() {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fName = Userinput.next();

        if ( fName.length() < 2)
            System.out.println("The first name must be at least 2 characters long.");
        else if (fName.length() == 0)
            System.out.println("The first name must be filled in. ");


    }

    public static void EmployeeLastName() {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Enter the last name: ");
        String Lname = Userinput.next();

        if ( Lname.length() < 2)
            System.out.println("The last name must be at least 2 characters long.");
        else if (Lname.length() == 0)
            System.out.println("The last name must be filled in. ");
    }

    public static void EmployeeZip() {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Enter the ZIP code: ");
        String Zip = Userinput.next();

        if (Zip.length()>5)
            System.out.println("The zipcode must be a 5 digit number. ");


    }

    public static void EmployeeID() {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Enter the employee ID: ");
        String ID = Userinput.next();

        if (ID.length() >= 8)
            System.out.println("The employee ID must be in the format of AA-1234");
        else if(ID.length() ==0)
            System.out.println("The employee ID must be in the format of AA-1234");
        else
            System.out.println("There were no errors found");

    }












    }





