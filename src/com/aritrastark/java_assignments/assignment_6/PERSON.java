package com.aritrastark.java_assignments.assignment_6;

import java.util.Scanner;

abstract public class PERSON {
    private int id;
    private String name;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDeets(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = io.nextLine();
    }

    protected void getDeets(){
        System.out.println("Name is : " +  this.getName() + " ID: " + this.getId());
    }

}
