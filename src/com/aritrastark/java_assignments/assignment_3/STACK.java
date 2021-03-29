package com.aritrastark.java_assignments.assignment_3;

public class STACK {
    private char[] arr = new char[1024];
    private int top = -1;

    public void push(char s){
        //Stack push
        if(!this.overflow()){
            this.top++;
            this.arr[this.top] = s;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public void pop(){
        //Stack pop
        if(!this.underflow())
            this.top--;
        else
            System.out.println("Stack Underflow");
    }

    public boolean overflow(){
        //Check overflow
        if(this.top>=1024)
            return true;
        else
            return  false;
    }

    public char getTopEl() {
            return this.arr[this.top];
    }//Get top element

    public boolean underflow(){
        //Get underflow
        if (this.top<=-1)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
    }
}
