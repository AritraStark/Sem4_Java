package com.aritrastark.java_assignments.assignment_1;

import java.time.LocalDate;
import java.util.Scanner;

public class STUDENT {
    private int roll;
    private String name,course;
    private LocalDate admission;
    private int[] marks = new int[5];

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public LocalDate getAdmission() {
        return admission;
    }

    public int[] getMarks() {
        return marks;
    }

    public void input(){
        //Taking student details
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Name:");
        this.name = io.nextLine();
        System.out.println("Enter course:");
        this.course = io.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter marks for subject "+(i+1)+" :");
            try {
                this.marks[i] = io.nextInt();
            }
            catch (Exception e){
                System.out.println("Enter valid number");
            }
        }
        this.admission = java.time.LocalDate.now();
    }

    public void print(){
        System.out.println("Roll: "+this.roll+" , Name: "+this.name+" , Course: "+this.course);
    }

    public void marksheet(){
        //Generating student marksheet
        System.out.println("The marks of student in 5 subjects are :");
        for(int i=0;i<this.marks.length;i++){
            System.out.println("Subject "+(i+1)+" : "+ this.marks[i]);
        }
    }

    public int getMarksSum(){
        //Getting sum of marks
        int sum=0;
        for (int mark : this.marks) sum += mark;
        return sum;
    }
}
