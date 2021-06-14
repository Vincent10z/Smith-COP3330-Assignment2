/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex34;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex34 {


    public static void main(String[] args) {

        List<String> Employees = new ArrayList<>();
        Employees.add("John_Smith");
        Employees.add("Jackie_Jackson");
        Employees.add("Chris_Jones");
        Employees.add("Amanda_Cullen");
        Employees.add("Jeremy_Goodwin");

        RemoveEmployee(Employees);

    }
    private static void RemoveEmployee(List<String> Employees) {
        Scanner userinput = new Scanner(System.in);
        int size = Employees.size();
        System.out.println("There are "+size + " employees.");
        for(String list: Employees)
        System.out.println(list);


        System.out.println("Enter an employee name to remove from the list: ");
        String remove = userinput.next();
        Employees.remove(remove);
        int sizeafterdelete = Employees.size();
        System.out.println("There are "+sizeafterdelete + " employees.");
        for(String list: Employees)
        System.out.println(list);




    }

    }








