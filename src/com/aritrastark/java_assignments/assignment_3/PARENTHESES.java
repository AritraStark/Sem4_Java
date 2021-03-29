package com.aritrastark.java_assignments.assignment_3;

import java.util.Scanner;

public class PARENTHESES {
    private STACK state = new STACK();
    private String data;

    public void readData(){
        System.out.println("Enter parentheses data:");
        Scanner io = new Scanner(System.in);
        this.data = io.nextLine();
        System.out.println(this.data);
    }

    public boolean genRes(){
        //Generating the result
        System.out.println(this.data);
        this.state.push(this.data.charAt(0));
        for(int i=1;i<this.data.length();i++){
            //Checking for bracket match
            if(this.state.isEmpty())
                if(this.data.charAt(i)==']'||this.data.charAt(i)=='}'||this.data.charAt(i)==')')
                    return false;
            if(this.data.charAt(i)==']'&&this.state.getTopEl()=='[')
                state.pop();
            else if(this.data.charAt(i)=='}'&&this.state.getTopEl()=='{')
                state.pop();
            else if(this.data.charAt(i)==')'&&this.state.getTopEl()=='(')
                state.pop();
            else
                state.push(this.data.charAt(i));
        }
        if(this.state.isEmpty())
            return true;
        else
            return false;
    }
}
