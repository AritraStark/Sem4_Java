package com.aritrastark.java_assignments.assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DEPARTMENT extends STUDENT{
    private String dept;
    ArrayList arr = new ArrayList<STUDENT>();

    public String getDept() {
        return dept;
    }

    public void addStudent(){
        //Adding new student
        STUDENT temp = new STUDENT();
        temp.setRoll(arr.size()+1);
        System.out.println("Enter data for new student");
        temp.input();
        arr.add(temp);
        System.out.println("Student added successfully");
    }

    public void removeStudent(int roll){
        //Removing student by roll
        for(int i =0;i<arr.size();i++){
            STUDENT temp = (STUDENT) this.arr.get(i);
            if(temp.getRoll()==roll){
                arr.remove(i);
                System.out.println("Deleted");
                break;
            }
        }
    }

    public int nofStudents(){
        return this.arr.size();
    }

    public void sortStudents(int[] arr){
        //Insertion sort
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void input(){
        //Overriding input of super class
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Department : ");
        this.dept = io.nextLine();
    }

    public void listAll(){
        for(int i=0;i<arr.size();i++){
            STUDENT temp = (STUDENT) this.arr.get(i);
            temp.print();
        }
    }

    public void getMarksh(int r){
        //Getting marksheet of student by roll
        for(int i =0;i<arr.size();i++){
            STUDENT temp = (STUDENT) this.arr.get(i);
            if(temp.getRoll()==r){
                temp.print();
                temp.marksheet();
                return;
            }
        }
        System.out.println("Not found");
    }

    public void parseMarks(int[] arr){
        //Parsing marks sum to array
        for(int i=0;i<arr.length;i++) {
            STUDENT temp = (STUDENT) this.arr.get(i);
            arr[i] = temp.getMarksSum();
        }
    }

    public void printSorted(int[] arr){
        //Print sorted list
        for(int i:arr){
            for(int j =0;j<this.arr.size();j++){
                STUDENT temp = (STUDENT) this.arr.get(j);
                if(temp.getMarksSum()==i){
                    temp.print();
                    break;
                }
            }
        }
    }
}
