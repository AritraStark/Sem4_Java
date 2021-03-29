package com.aritrastark.java_assignments.assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

public class SEARCH {
    public static void findPerson(ArrayList<String> arr){
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people.");
        String p = inout.next();
        int res = -1;
        for(String s:arr){
            String temp = s.toLowerCase();
            String check = p.toLowerCase();
            if(temp.contains(check)){
                System.out.println(s);
                res++;
            }
        }
        if(res==-1)
            System.out.println("No matching people found.");

    }

    public static void printAll(ArrayList<String> arr){
        System.out.println("=== List of people ===");
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}
