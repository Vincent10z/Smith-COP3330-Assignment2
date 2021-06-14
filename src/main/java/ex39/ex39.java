/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Smith
 */
package ex39;
import javax.naming.Name;
import java.util.*;
import java.util.stream.Collectors;

public class ex39 {
    public static void main(String[] args) {

        List<Company> list = new ArrayList<>();
        list.add(new Company("John", "Johnson", "Manager", "2016-12-31"));
        list.add(new Company("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.add(new Company("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        list.add(new Company("Jake", "Jacobson", "Programmer", " "));
        list.add(new Company("Jacquelyn", "Jackson", "DBA", " "));
        list.add(new Company("Sally", "Webber", "Web Developer", "2015-12-18"));

        // key = id, value - websites
        Map<String, Name> result1 = Name.stream(
                Collectors.toMap(Company::getfName));

        System.out.println("Result 1 : " + result1);

        // key = name, value - websites
        Map<String, Name> result2 = list.stream().collect(
                Collectors.toMap(Company::getPosition, Company::getSepDate));

        System.out.println("Result 2 : " + result2);




    }

}