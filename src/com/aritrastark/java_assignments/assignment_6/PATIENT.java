package com.aritrastark.java_assignments.assignment_6;

import java.util.Scanner;

public class PATIENT extends PERSON{
    private int temp;
    private String bp;

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    private int docId;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    @Override
    public void getDeets(){
        System.out.println("Patient: ");
        super.getDeets();
        System.out.println("BP is : " + this.getBp() + " and Temperature is : " + this.getTemp() +"°F");
    }

}
