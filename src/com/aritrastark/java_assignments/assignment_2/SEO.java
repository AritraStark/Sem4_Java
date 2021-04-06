package com.aritrastark.java_assignments.assignment_2;

import java.util.Scanner;

public class SEO extends USER {

    public void updateRate(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter item code");
        int code = io.nextInt();
        try {
            for (ITEM j: arr)
                if(j.getItem_code()==code){
                    System.out.println("Enter new rate");
                    int nr = io.nextInt();
                    j.setRate(nr);
                    return;
                }
            System.out.println("Item not found");
        }
        catch (NullPointerException e){
            System.out.println("NO Items");
        }
    }

    public void getRateQuan(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter item code");
        int code = io.nextInt();
        try {
            for (ITEM j: arr)
                if(j.getItem_code()==code){
                    System.out.println("The rate item is:" + j.getRate() + " and the item quantity is:" + j.getQuantity());
                    return;
                }
            System.out.println("Item not found");
        }
        catch (NullPointerException e){
            System.out.println("NO Items");
        }
    }

    @Override
    public void display() {
        Scanner io = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Shopkeeper actions");
            System.out.print("Enter :\n1. Issue Item\n2. Receive Item\n3. Show All Items\n4. Get Item Rate and Quantity\n5. Update Rate\n6. Add Item\n7. Exit\n");
            int c = io.nextInt();
            switch (c) {
                case 1 -> {
                    this.issueItem();
                }
                case 2 -> {
                    this.recieveItem();
                }
                case 3 -> {
                    this.showItems();
                }
                case 4->{
                    this.getRateQuan();
                }
                case 5->{
                    this.updateRate();
                }
                case 6->{
                    ITEM temp = new ITEM();
                    this.initItem(temp);
                    this.arr.add(temp);
                }
                case 7 -> {
                    return;
                }
                default -> {
                    System.out.println("Wrong Choice");
                }
            }
        }
    }
}