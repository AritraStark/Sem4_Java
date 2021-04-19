package com.aritrastark.java_assignments.assignment2_3;

public class WORD {
    private String ap;

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public void tokenGen(){
        String[] arr = ap.split("[\s@.]+");
        System.out.println("Split Array:");
        for(String i:arr)
            System.out.println(i);
    }

    public void getA(){
        int count=0;
        for(int i=0;i<ap.length();i++){
            if(ap.charAt(i)=='a')
                count++;
        }
        System.out.println("The number of occurrences of a is "+ count);
    }

    public void getAnd(){
        int count=0;
        String[] arr = this.ap.split("[\s@.]+");
        for(String i:arr){
            if(i.equals("and"))
                count++;
        }
        System.out.println("The number of occurrences of and is "+ count);
    }

    public void toCharArr(){
        char[] arr = this.ap.toCharArray();
        System.out.println("Character Array:");
        for(char i:arr)
            System.out.print(i+" ");
    }

    public boolean checkThe(){
        if(this.ap.startsWith("The"))
            return true;
        else
            return false;
    }
}
