/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */

package ex40;

import ex39.Company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex40 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex39 app = new ex39();
        List<Company> list = app.getlist();
        app.pList(list);
        String sortMethod = app.howToSort();
        List<Company> sortedlist = app.getSortList(list, sortMethod);
        app.pList(sortedlist);
    }



    public List<Company> getlist(){
        Company[] companies = {
                new Company("John", "Johnson", "Manager", "2016-12-31");
        new Company("Tou", "Xiong", "Software Engineer", "2016-10-05");
        new Company("Michaela", "Michaelson", "District Manager", "2015-12-19");
        new Company("Jake", "Jacobson", "Programmer", " ");
        new Company("Jacquelyn", "Jackson", "DBA", " ");
        new Company("Sally", "Webber", "Web Developer", "2015-12-18");

        }
        return Arrays.asList(companies);

    }
    public void pList(List<Company> pList){
        System.out.printf("Name %18s Position %10sSeparation Date\n", "|", "|");
        System.out.println("----------------------|-------------------|------------------");
        pList().forEach(System.out::println);
    }
    public String howToSort() {
        System.out.print("\nHow would you like to sort by?\n-FirstName\n-LastName\n-Position\n-SeparationDate\ninput: ");
        return in.next();
    }
    public List<Company> getSortList(List<Company> list, String sort) {
        if(sort.equalsIgnoreCase("FirstName")){
            list.sort(new Company.firstNameSorter());
        }
        if(sort.equalsIgnoreCase("LastName")){
            list.sort(new Company.lastNameSorter()));
        }
        if(sort.equalsIgnoreCase("Position")){
            list.sort(new Company.positionSorter());
        }
        if(sort.equalsIgnoreCase("SeparationDate")){
            list.sort(new Company.positionSorter.separationDateSorter());
        }
        return list;
    }

}
}
