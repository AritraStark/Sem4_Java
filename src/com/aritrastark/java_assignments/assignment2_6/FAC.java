package com.aritrastark.java_assignments.assignment2_6;

import java.util.Scanner;

public class FAC extends PERSON{
    private int facultyId;
    private String specialization;
    private String department;

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void init(){
        super.init();
        Scanner io = new Scanner(System.in);
        System.out.println("Enter faculty ID, specialization, department");
        this.facultyId = io.nextInt();
        this.department = io.nextLine();
        this.specialization =  io.nextLine();
    }

    @Override
    public void display(){
        System.out.println("Faculty:");
        System.out.println("Faculty ID :"+ this.getFacultyId());
        System.out.println("Specialization :"+ this.getSpecialization());
        System.out.println("Department :"+ this.getDepartment());
        super.display();
    }
}
