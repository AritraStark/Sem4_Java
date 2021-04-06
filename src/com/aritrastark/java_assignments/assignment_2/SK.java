package com.aritrastark.java_assignments.assignment_2;

import java.util.Scanner;

public class SK extends USER{
    @Override
    public void display(){
        Scanner io = new Scanner(System.in);
        for(;;){
            System.out.println("Shopkeeper actions");
            System.out.print("Enter :\n1. Issue Item\n2. Receive Item\n3. Show All Items\n4. Exit\n");
            int c = io.nextInt();
            switch (c){
                case 1->{
                    this.issueItem();
                }
                case 2->{
                    this.recieveItem();
                }
                case 3->{
                    this.showItems();
                }
                case 4->{
                    return;
                }
                default -> {
                    System.out.println("Wrong Choice");
                }
            }
        }



    }
}
