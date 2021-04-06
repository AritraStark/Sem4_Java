package com.aritrastark.java_assignments.assignment_5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

    public static void indexed(ArrayList<String> arr){
        TreeMap<String,ArrayList<Integer>> tm = new TreeMap<String,ArrayList<Integer>>();
        for(String a:arr){
            String[] line = a.split("\\s");
            for(String b:line){
                if(tm.containsKey(b)){
                    tm.get(b).add(arr.indexOf(a)+1);
                }
                else{
                    ArrayList<Integer> t = new ArrayList<Integer>();
                    t.add(arr.indexOf(a)+1);
                    tm.put(b,t);
                }
            }
        }
        System.out.println(tm);
    }
}
