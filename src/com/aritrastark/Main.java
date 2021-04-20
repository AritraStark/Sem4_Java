//Write a program Parentheses.java that reads in a text stream from standard input and uses a stack to determine
//        whether or not its parentheses are properly balanced. For example, your program should print true for
//        [()]{}{[()()]()} and false for [(]). You need to implement the stack class by yourself.

package com.aritrastark;

import com.aritrastark.java_assignments.assignment2_1.BANKACC;
import com.aritrastark.java_assignments.assignment2_2.METRIC;
import com.aritrastark.java_assignments.assignment2_3.WORD;
import com.aritrastark.java_assignments.assignment2_4.WRAPPER;
import com.aritrastark.java_assignments.assignment2_5.CUST;
import com.aritrastark.java_assignments.assignment2_6.FAC;
import com.aritrastark.java_assignments.assignment2_6.STU;
import com.aritrastark.java_assignments.assignment_1.DEPT_INTER;
import com.aritrastark.java_assignments.assignment_2.SEO;
import com.aritrastark.java_assignments.assignment_2.SK;
import com.aritrastark.java_assignments.assignment_2.USER;
import com.aritrastark.java_assignments.assignment_3.PARENTHESES;
import com.aritrastark.java_assignments.assignment_4.QUOTES;
import com.aritrastark.java_assignments.assignment_6.HOSPITAL;
import com.aritrastark.java_assignments.assignment_6.PERSON;

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

    public static void ex_as_7(){
        Scanner inout = new Scanner(System.in);
        ArrayList<BANKACC> arr = new ArrayList<BANKACC>();
        for(;;){
            System.out.println("Enter:\n1. To create account\n2. To update Interest Rate\n3. To get Interest Rate\n4. To get interest amount\n5. To get Balance\n6. To exit");
            int c = inout.nextInt();
            switch(c){
                case 1->{
                    BANKACC temp = new BANKACC();
                    temp.init();
                    arr.add(temp);
                }
                case 2->{
                    if(arr.isEmpty()){
                        System.out.println("List empty, enter atleast one account");
                    }
                    else {
                        System.out.println("Enter new Interest Rate:");
                        double ir = inout.nextDouble();
                        arr.get(0).setInterestRate(ir);
                    }
                }
                case 3->{
                    boolean check = false;
                    System.out.println("Enter Account Number:");
                    int a = inout.nextInt();
                    for(BANKACC t:arr){
                        if(t.getAccNo()==a){
                            System.out.println("Interest Rate: "+t.getInterestRate());
                            check = true;
                            break;
                        }
                    }
                    if(!check)
                        System.out.println("Id not found");
                }
                case 4->{
                    boolean check = false;
                    System.out.println("Enter Account Number:");
                    int a = inout.nextInt();
                    for(BANKACC t:arr){
                        if(t.getAccNo()==a){
                            System.out.println("Interest Amount: "+ t.calcInt());
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
                }
                case 5->{
                    boolean check = false;
                    System.out.println("Enter Account Number:");
                    int a = inout.nextInt();
                    for(BANKACC t:arr){
                        if(t.getAccNo()==a){
                            System.out.println("Balance Amount: "+ t.getBalance());
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
                }
                case 6->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Incorrect option! Try again.");
                }
            }
        }
    }

    public static void ex_as_8(){
        METRIC a = new METRIC();
        Scanner inout = new Scanner(System.in);
        for(;;){
            System.out.println("Enter:\n1. To convert Kilometer to Miles\n2. To convert Miles to Kilometer\n3. To Exit");
            int c = inout.nextInt();
            switch (c){
                case 1->{
                    System.out.println("Enter Kilometer Value:");
                    double km = inout.nextDouble();
                    a.setKm(km);
                    a.convertToMile();
                    System.out.println("Converted Miles value is: "+ a.getMi());
                }
                case 2->{
                    System.out.println("Enter Miles Value:");
                    double mi = inout.nextDouble();
                    a.setMi(mi);
                    a.convertToKm();
                    System.out.println("Converted Kilometer value is: "+ a.getKm());
                }
                case 3->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Incorrect option! Try again.");
                }
            }
        }
    }

    public static void ex_as_9() {
        WORD a = new WORD();
        Scanner inout = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter:\n1. Enter String\n2. To get number of times a occurs\n3. To get number of times and occurs\n4. To get if it starts with The\n5. To convert string to char\n6. To split string into tokens\n7. To exit");
            int c = inout.nextInt();
            switch (c) {
                case 1->{
                    Scanner io = new Scanner(System.in);
                    System.out.println("Enter string");
                    String s = io.nextLine();
                    a.setAp(s);
                }
                case 2->{
                    a.getA();
                }
                case 3->{
                    a.getAnd();
                }
                case 4->{
                    System.out.println("Check result is "+ a.checkThe());
                }
                case 5->{
                    a.toCharArr();
                }
                case 6->{
                    a.tokenGen();
                }
                case 7->{
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }
    public static void ex_as_10(){
        WRAPPER a = new WRAPPER();
        Scanner inout = new Scanner(System.in);
        for(;;){
            System.out.println("Enter:\n1. To convert basic to object\n2. To convert object to basic\n3. To convert basic to string\n4. To convert string to object\n5.To convert object to string\n6. To exit");
            int c = inout.nextInt();
            switch (c){
                case 1->{
                    a.basToObj();
                }
                case 2->{
                    a.objToBas();
                }
                case 3->{
                    a.basToStr();
                }
                case 4->{
                    a.objToStr();
                }
                case 5->{
                    a.strToObj();
                }
                case 6->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Incorrect option! Try again.");
                }
            }
        }
    }

    public static void ex_as_11(){
        ArrayList<CUST> arr = new ArrayList<CUST>();
        Scanner inout = new Scanner(System.in);
        for(;;){
            System.out.println("Enter:\n1. To add a customer\n2. To initiate a loan\n3. To get credit limit\n4. To get current loan amount\n5. To exit");
            int c = inout.nextInt();
            switch (c){
                case 1->{
                    CUST temp = new CUST();
                    arr.add(temp);
                }
                case 2->{
                    boolean check = false;
                    System.out.println("Enter customer id:");
                    int id = inout.nextInt();
                    for(CUST i: arr){
                        if(i.getId()==id){
                            System.out.println("Enter loan amount");
                            int la = inout.nextInt();
                            i.startLoan(la);
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
                }
                case 3->{
                    boolean check = false;
                    System.out.println("Enter customer id:");
                    int id = inout.nextInt();
                    for(CUST i: arr){
                        if(i.getId()==id){
                            System.out.println("Credit limit of the customer is "+i.getCredLim());
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
                }
                case 4->{
                    boolean check = false;
                    System.out.println("Enter customer id:");
                    int id = inout.nextInt();
                    for(CUST i: arr){
                        if(i.getId()==id){
                            System.out.println("Current loan amount of the customer is "+i.getLoanAmt());
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
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

    public static void ex_as_12(){
        ArrayList<STU> arr1 = new ArrayList<STU>();
        ArrayList<FAC> arr2 = new ArrayList<FAC>();
        Scanner inout = new Scanner(System.in);
        for(;;){
            System.out.println("Enter:\n1. To add a Student\n2. To add a Faculty\n3. To get student details\n4. To get faculty details\n5. To exit");
            int c = inout.nextInt();
            switch (c){
                case 1->{
                    STU t = new STU();
                    t.init();
                    arr1.add(t);
                }
                case 2->{
                    FAC t = new FAC();
                    t.init();
                    arr2.add(t);
                }
                case 3->{
                    Boolean check = false;
                    System.out.println("Enter student roll:");
                    int id = inout.nextInt();
                    for(STU i: arr1){
                        if(i.getRoll()==id){
                            i.display();
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
                }
                case 4->{
                    Boolean check = false;
                    System.out.println("Enter faculty id:");
                    int id = inout.nextInt();
                    for(FAC i: arr2){
                        if(i.getFacultyId()==id){
                            i.display();
                            check = true;
                            break;
                        }
                    }
                    if (!check)
                        System.out.println("Id not found");
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
        System.out.print("Enter :\nAssignment 1:\n1. Problem 1:\n2. Problem 2:\n3. Problem 3:\n4. Problem 4:\n5. Problem 5:\n6. Problem 6:\nAssignment 2:\n7. Problem 1:\n8. Problem 2:\n9. Problem 3:\n10. Problem 4:\n11. Problem 5:\n12. Problem 6:");
        int c = io.nextInt();
        switch (c) {
            case 1 -> {
                System.out.println("Problem 1:");
                ex_as_1();
            }
            case 2 -> {
                System.out.println("Problem 2:");
                ex_as_2();
            }
            case 3 -> {
                System.out.println("Problem 3:");
                ex_as_3();
            }
            case 4 -> {
                System.out.println("Problem 4:");
                ex_as_4();
            }
            case 5 -> {
                System.out.println("Problem 5:");
                ex_as_5();
            }
            case 6 -> {
                System.out.println("Problem 6:");
                ex_as_6();
            }
            case 7->{
                System.out.println("Problem 1:");
                ex_as_7();
            }
            case 8->{
                System.out.println("Problem 2:");
                ex_as_8();
            }
            case 9->{
                System.out.println("Problem 3:");
                ex_as_9();
            }
            case 10->{
                System.out.println("Problem 4:");
                ex_as_10();
            }
            case 11->{
                System.out.println("Problem 5:");
                ex_as_11();
            }
            case 12->{
                System.out.println("Problem 6:");
                ex_as_12();
            }
            default -> System.out.println("Wrong Input");
        }
    }
}
