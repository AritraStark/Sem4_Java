package com.aritrastark.java_assignments.assignment2_6;

import java.util.Scanner;

abstract class PERSON {
    private String name;
    private String address;
    private String email;
    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void init(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter name, address, email, phone");
        this.name = io.nextLine();
        this.address = io.nextLine();
        this.email = io.nextLine();
        this.phone = io.nextInt();
    }

    public void display(){
        System.out.println("Name :"+ this.getName());
        System.out.println("Email :"+ this.getEmail());
        System.out.println("Address :"+ this.getAddress());
        System.out.println("Phone :"+ this.getPhone());
    }
}
