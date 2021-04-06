package com.aritrastark.java_assignments.assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class USER {
    protected ArrayList<ITEM> arr = new ArrayList<ITEM>();

    protected void initItem(ITEM temp){
        Scanner io = new Scanner(System.in);
        try {
            temp.setItem_code(this.arr.size()+1);
        }
        catch (NullPointerException e){
            temp.setItem_code(1);
        }
        System.out.println("Enter item name:");
        String name =io.nextLine();
        temp.setName(name);
        System.out.println("Enter item rate:");
        int rate = io.nextInt();
        temp.setRate(rate);
        temp.setQuantity(1);
    }

    public void recieveItem(){
        ITEM temp = new ITEM();
        this.initItem(temp);
        try {
            for(ITEM i:this.arr)
                if(temp.getName()==i.getName()){
                    i.incrementQuantity();
                    System.out.println("Item quantity incremented");
                    return;
                }
            this.arr.add(temp);
        }
        catch (NullPointerException e){
            this.arr.add(temp);
            System.out.println("Item added");
        }

    }

    public void showItems(){
        try {
            System.out.println("Items List:");
            for(ITEM i:arr){
                i.show();
                System.out.println("");
            }

        }
        catch (NullPointerException e){
            System.out.println("NO Items");
        }
    }

    public void issueItem(){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter item code");
        int code = io.nextInt();
        try{
            for (ITEM j: arr)
                if(j.getItem_code()==code){
                    if(j.getQuantity()<=0) {
                        System.out.println("Insufficient item quantity");
                        return;
                    }
                    else {
                        j.decrementQuantity();
                        System.out.println("Item issued");
                        return;
                    }
                }
            System.out.println("Item not found");
        }
        catch (NullPointerException e){
            System.out.println("NO Items");
        }
    }

    abstract void display();
}
