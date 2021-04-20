package com.aritrastark.java_assignments.assignment2_6;

import java.util.Scanner;

public class STU extends PERSON{
    private int roll;
    private String course;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void init(){
        super.init();
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Roll, course");
        this.roll = io.nextInt();
        this.course = io.next();
    }

    @Override
    public void display(){
        System.out.println("Student:");
        System.out.println("Roll: "+this.getRoll());
        System.out.println("Course :"+ this.getCourse());
        super.display();
    }
}
