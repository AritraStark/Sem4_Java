//Write a program Parentheses.java that reads in a text stream from standard input and uses a stack to determine
//        whether or not its parentheses are properly balanced. For example, your program should print true for
//        [()]{}{[()()]()} and false for [(]). You need to implement the stack class by yourself.

package com.aritrastark;

import com.aritrastark.java_assignments.assignment_1.DEPT_INTER;
import com.aritrastark.java_assignments.assignment_2.SEO;
import com.aritrastark.java_assignments.assignment_2.SK;
import com.aritrastark.java_assignments.assignment_2.USER;
import com.aritrastark.java_assignments.assignment_3.PARENTHESES;
import com.aritrastark.java_assignments.assignment_4.QUOTES;
import com.aritrastark.java_assignments.assignment_6.HOSPITAL;

import static com.aritrastark.java_assignments.assignment_5.FILE.readTextFromFile;
import static com.aritrastark.java_assignments.assignment_5.SEARCH.findPerson;
import static com.aritrastark.java_assignments.assignment_5.SEARCH.printAll;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    @Override
    // finalize method is called on object once
    // before garbage collection
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }

    public static void ex_as_1(){
        //For executing the program of ASSIGNMENT 1
        DEPT_INTER a = new DEPT_INTER();
        for(;;){
            Scanner io = new Scanner(System.in);
            if(!a.isEmpty())
                System.out.println("Current Department: "+ a.getCurDept());
            System.out.print("Enter :\n1. For Adding department:\n2. For Adding Student in current department\n3. For sorting students in current department\n4. For getting student mark-sheet:\n5. Remove a student in department\n6. Change Department\n7. Get number of students in department\n8. To check free memory\n9. For exit:\n");
            int c = io.nextInt();
            switch (c){
                case 1:{
                    a.addDept();
                    break;
                }
                case 2:{
                    a.addStu();
                    break;
                }
                case 3:{
                    a.sortStu();
                    break;
                }
                case 4:{
                    a.genStuMark();
                    break;
                }
                case 5:{
                    a.remStu();
                    break;
                }
                case 6:{
                    a.changeDept();
                    break;
                }
                case 7:{
                    a.getStuCount();
                    break;
                }
                case 8:{
                    System.gc();
                    System.out.println("Cleanup completed...");
                    break;
                }
                case 9:{
                    System.out.println("Exiting...");
                    return;
                }
                default:{
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
    }

    public static void ex_as_2(){
        Scanner io = new Scanner(System.in);
        for (;;){
            System.out.print("Enter :\n1. For entering as shopkeeper:\n2. For entering as stock entry operator\n3. For exit:\n");
            int c = io.nextInt();
            switch (c){
                case 1:{
                    SK a = new SK();
                    a.display();
                    break;
                }
                case 2:{
                    SEO a = new SEO();
                    a.display();
                }
                case 3:{
                    System.out.println("Exiting...");
                    return;
                }
                default:{
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
    }

    public static void ex_as_3(){
        //For executing the program of ASSIGNMENT 3
        PARENTHESES a = new PARENTHESES();
        for(;;){
            Scanner io = new Scanner(System.in);
            System.out.print("Enter :\n1. For entering the parentheses input:\n2. For displaying the result\n3. For exit:\n");
            int c = io.nextInt();
            switch (c){
                case 1:{
                    a.readData();
                    break;
                }
                case 2:{
                    System.out.println("The result is : "+ a.genRes());
                }
                case 3:{
                    System.out.println("Exiting...");
                    return;
                }
                default:{
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
    }

    public static void ex_as_4(){
        //For executing the program of ASSIGNMENT 4
        QUOTES a = new QUOTES();
        for(;;){
            Scanner io = new Scanner(System.in);
            System.out.print("Enter :\n1. For generating quote of the day:\n2. For exit:\n");
            int c = io.nextInt();
            switch (c){
                case 1:{
                    System.out.println("The quote is:");
                    System.out.println(a.generate());
                    break;
                }
                case 2:{
                    System.out.println("Exiting...");
                    return;
                }
                default:{
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
    }

    public static void ex_as_5() throws FileNotFoundException {
        Scanner inout = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        readTextFromFile(arr);
//        for(;;){
//            System.out.println("=== Menu ===\n1. Find a person\n2. Print all people\n0. Exit");
//            int c = inout.nextInt();
//            switch(c){
//                case 0:{
//                    System.out.println("Bye!");
//                    return;
//                }
//                case 1:{
//                    findPerson(arr);
//                    break;
//                }
//                case 2:{
//                    printAll(arr);
//                    break;
//                }
//                default:{
//                    System.out.println("Incorrect option! Try again.");
//                    break;
//                }
//            }
//        }
    }

    public static void ex_as_6(){
        Scanner inout = new Scanner(System.in);
        HOSPITAL a = new HOSPITAL();
        for(;;){
            System.out.println("Enter: \n1. To enter as Doctor\n2. To enter as Patient\n3. Show Doctors available\n4. Show Patients available\n5. Exit");
            int c = inout.nextInt();
            switch(c){
                case 1->{
                    a.docEntry();
                }
                case 2->{
                    a.patientEntry();
                }
                case 3->{
                    a.showdocs();
                }
                case 4->{
                    a.showpats();
                }
                case 5->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Incorrect option! Try again.");
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter :\n1. Assignment 1:\n2. Assignment 2:\n3. Assignment 3:\n4. Assignment 4:\n5. Assignment 5:\n6. Assignment 6:\n");
        int c = io.nextInt();
        switch (c) {
            case 1 -> {
                System.out.println("Assignment 1:");
                ex_as_1();
            }
            case 2 -> {
                System.out.println("Assignment 2:");
                ex_as_2();
            }
            case 3 -> {
                System.out.println("Assignment 3:");
                ex_as_3();
            }
            case 4 -> {
                System.out.println("Assignment 4:");
                ex_as_4();
            }
            case 5 -> {
                System.out.println("Assignment 5:");
                ex_as_5();
            }
            case 6 -> {
                System.out.println("Assignment 6:");
                ex_as_6();
            }
            default -> System.out.println("Wrong Input");
        }
    }
}
