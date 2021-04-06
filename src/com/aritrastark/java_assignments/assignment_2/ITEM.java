package com.aritrastark.java_assignments.assignment_2;

import java.util.Scanner;

public class ITEM {
    private int item_code;
    private String name;
    private int rate;
    private int quantity;

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity(){
        setQuantity(this.quantity+1);
    }

    public void decrementQuantity(){
        setQuantity(this.quantity-1);
    }

    public void show(){
        System.out.println("Item Code: "+ this.item_code);
        System.out.println("Item Name: "+ this.name);
        System.out.println("Item Rate: "+ this.rate);
        System.out.println("Item Quantity: "+ this.quantity);
    }
}
