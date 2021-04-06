package com.aritrastark.java_assignments.assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FILE {
    public static void readTextFromFile(ArrayList<String> arr) throws FileNotFoundException {
        String path = "D:\\Java\\JavaAssignments\\src\\com\\aritrastark\\java_assignments\\assignment_5\\data.txt";
        File file = new File(path);
        Scanner fio = new Scanner(file);
        while(fio.hasNext()) {
            String temp = fio.nextLine();
            arr.add(temp);
        }
        SEARCH.indexed(arr);
    }
}
