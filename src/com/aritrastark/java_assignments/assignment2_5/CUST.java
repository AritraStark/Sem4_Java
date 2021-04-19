package com.aritrastark.java_assignments.assignment2_5;

import java.util.Scanner;

public class CUST {
    public char getPrivilege() {
        return privilege;
    }

    public int getCredLim() {
        return credLim;
    }

    public void setCredLim(int credLim) {
        this.credLim = credLim;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    private int id;
    private String name;
    private int loanAmt;
    private char privilege;
    private int credLim;
    private int phNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(int loanAmt) {
        this.loanAmt = loanAmt;
    }

    public char isPrivilege() {
        return privilege;
    }

    public void setPrivilege(char privilege) {
        this.privilege = privilege;
    }

    public void startLoan(int x){
        //System.out.println("Enter loan amount");
        if(x>this.credLim){
            System.out.println("Credit limit exceeded");
        }
        else{
            this.loanAmt = x;
            System.out.println("Loan approved");
        }
    }

    public CUST(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter id, name, phone");
        this.id = io.nextInt();
        this.name = io.nextLine();
        this.phNo = io.nextInt();
        System.out.println("Is the account privileged? Enter Y/N");

        if(io.next().charAt(0)=='Y'||io.next().charAt(0)=='y'){
            this.privilege = io.next().charAt(0);
            this.credLim = 100000;
        }
        else if(io.next().charAt(0)=='N'||io.next().charAt(0)=='n'){
            this.privilege = io.next().charAt(0);
            this.credLim = 150000;
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
