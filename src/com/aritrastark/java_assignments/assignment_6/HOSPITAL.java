package com.aritrastark.java_assignments.assignment_6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HOSPITAL {
    protected ArrayList<DOCTOR> arr1 = new ArrayList<DOCTOR>();
    protected ArrayList<PATIENT> arr2 = new ArrayList<PATIENT>();

    protected void assignDoc(PATIENT a){
        Random random = new Random();
        if(arr1.isEmpty()){
            System.out.println("No doctors available");
            return;
        }
        int index = random.nextInt(arr1.size());
        a.setDocId(index);
        System.out.println("Doctor assigned: ");

        arr1.get(index).getDeets();
    }

    public void patientInit(){
        PATIENT temp = new PATIENT();
        temp.setDeets();
        if(arr2.isEmpty())
            temp.setId(1);
        else
            temp.setId(arr2.size()+1);
        this.assignDoc(temp);
        this.arr2.add(temp);
    }

    public void doctorInit(){
        DOCTOR temp = new DOCTOR();
        temp.setDeets();
        if(arr1.isEmpty())
            temp.setId(1);
        else
            temp.setId(arr1.size()+1);
        this.arr1.add(temp);
        System.out.println("Doctor entered");
    }

    public void docEntry(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Doctor code:");
        int i = io.nextInt();
        if(this.arr1.isEmpty()){
            System.out.println("Doctor not found, adding new Doctor");
            doctorInit();
            return;
        }
        for( DOCTOR a: arr1){
            if(a.getId()==i){
                displayDoctor(a);
                return;
            }
        }
        System.out.println("Doctor not found, adding new Doctor");
        doctorInit();
    }

    public void patientEntry(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Patient code:");
        int i = io.nextInt();
        if(this.arr2.isEmpty()){
            System.out.println("Patient not found, adding new patient");
            patientInit();
            return;
        }
        for( PATIENT a: arr2){
            if(a.getId()==i){
                displayPatient(a);
                return;
            }
        }
        System.out.println("Patient not found, adding new Patient");
        patientInit();
    }

    public void getAssDocDet(PATIENT a){
        for(DOCTOR i: arr1){
            if(i.getId()==a.getDocId()){
                i.getDeets();
                return;
            }
        }
    }

    public void displayPatient(PATIENT a){
        Scanner io = new Scanner(System.in);
        for(;;){
            System.out.println("Enter: \n1. Get patient details\n2.Get assigned doctor details\n3. Exit");
            int c = io.nextInt();
            switch (c){
                case 1->{
                    a.getDeets();
                }
                case 2->{
                    this.getAssDocDet(a);
                }
                case 3->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Wrong Input");

                }
            }
        }
    }

    public void setPatBp(DOCTOR b){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Patient code:");
        int i = io.nextInt();
        for( PATIENT a: arr2){
            if(a.getId()==i){
                b.updateBP(a);
                return;
            }
        }
        System.out.println("Patient not found");
    }

    public void setPatTemp(DOCTOR b){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Patient code:");
        int i = io.nextInt();
        for( PATIENT a: arr2){
            if(a.getId()==i){
                b.updateTemp(a);
                return;
            }
        }
        System.out.println("Patient not found");
    }

    public void displayDoctor(DOCTOR a){
        Scanner io = new Scanner(System.in);
        for(;;){
            System.out.println("Enter: \n1. Get doctor details\n2. Set patient BP\n3. Set patient Temp\n4. Exit");
            int c = io.nextInt();
            switch (c){
                case 1->{
                    a.getDeets();
                }
                case 2->{
                    setPatBp(a);
                }
                case 3->{
                    setPatTemp(a);
                }
                case 4->{
                    System.out.println("Exiting...");
                    return;
                }
                default->{
                    System.out.println("Wrong Input");

                }
            }
        }
    }

    public void showdocs(){
        if(arr1.isEmpty()){
            System.out.println("No doctors");
            return;
        }
        for(DOCTOR i: arr1)
            i.getDeets();
    }

    public void showpats(){
        if(arr2.isEmpty()){
            System.out.println("No patients");
            return;
        }
        for(PATIENT i: arr2)
            i.getDeets();
    }
}
