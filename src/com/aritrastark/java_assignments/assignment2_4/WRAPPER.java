package com.aritrastark.java_assignments.assignment2_4;

import java.util.Scanner;

public class WRAPPER {
    private Integer a;
    private String b;
    private int c;
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void basToObj(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter basic value");
        this.c = io.nextInt();
        this.a = this.c;
        System.out.println("Result: "+ this.getC());
    }

    public void objToBas(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter object value");
        this.a = io.nextInt();
        this.c = this.a;
        System.out.println("Result: "+ this.getA());
    }

    public void basToStr(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter basic value");
        this.c = io.nextInt();
        this.b = String.valueOf(this.c);
        System.out.println("Result: "+ this.getB());
    }

    public void objToStr(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter object value");
        this.a = io.nextInt();
        this.b = Integer.toString(this.a);
        System.out.println("Result: "+ this.getB());
    }

    public void strToObj(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter string containing integer value");
        this.b = io.next();
        this.a = Integer.parseInt(this.b);
        System.out.println("Result: "+ this.getA());
    }
}
