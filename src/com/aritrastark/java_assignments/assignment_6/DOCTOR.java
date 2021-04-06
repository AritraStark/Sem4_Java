package com.aritrastark.java_assignments.assignment_6;

import com.aritrastark.java_assignments.assignment_2.SEO;
import com.aritrastark.java_assignments.assignment_2.SK;

import java.util.ArrayList;
import java.util.Scanner;

public class DOCTOR extends PERSON{
    //protected ArrayList<Integer> patient_ids = new ArrayList<Integer>();

    public void updateBP(PATIENT a){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter new BP:");
        String bp = io.nextLine();
        a.setBp(bp);
    }
    public void updateTemp(PATIENT a){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter new Temperature in Fahrenheit:");
        int tp = io.nextInt();
        a.setTemp(tp);
    }

    @Override
    public void getDeets(){
        System.out.println("Doctor: ");
        super.getDeets();
    }

}
