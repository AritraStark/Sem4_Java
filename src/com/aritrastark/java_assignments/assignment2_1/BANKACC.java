package com.aritrastark.java_assignments.assignment2_1;

import java.util.Scanner;

public class BANKACC {
    private int accNo;
    private double balance;
    private static double interestRate = 4.0;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInt(){
        return this.balance*this.getInterestRate();
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account number and balance");
        this.accNo = sc.nextInt();
        this.balance = sc.nextDouble();
    }
}
