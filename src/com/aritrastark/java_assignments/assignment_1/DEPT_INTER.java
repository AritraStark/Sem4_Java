//Design a STUDENT class to store roll, name, course, admission date and marks in 5 subjects taken from user.
//        Create an array of STUDENT objects. Provide methods corresponding to admission date and receiving marks,
//        preparing mark sheet. Support must be there to show the number of students who have taken admission.
//        Inherit Student class and override the input method so as to input the department of each student. Search and
//        display a sorted list of students of one department or students based on scoring criteria. Create an arraylist of
//        students and remove a student based on certain criterion and then call gc() and check for free memory.

package com.aritrastark.java_assignments.assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DEPT_INTER {
    private ArrayList arr = new ArrayList<DEPARTMENT>();
    int cur = 0;

    public void addDept(){
        //Adding department into list
        DEPARTMENT temp = new DEPARTMENT();
        temp.input();
        this.arr.add(temp);
    }

    public String getCurDept(){
        //Getting current department
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        return temp.getDept();
    }

    public void changeDept(){
        //Changing department
        Scanner io = new Scanner(System.in);
        System.out.println("Enter department to change to:");
        String s = io.next();
        for(int i=0;i<this.arr.size();i++){
            DEPARTMENT temp = (DEPARTMENT) this.arr.get(i);
            if(s.equals(temp.getDept())) {
                this.cur = i;
                //Printing success
                System.out.println("Department changed successfully");
                break;
            }
        }
        //If not found
        System.out.println("Department not found");
    }

    public void addStu(){
        //Adding Student
        if(arr.isEmpty()){
            //If there are no departments
            System.out.println("Add a department first");
            return;
        }
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        temp.addStudent();
    }

    public void sortStu(){
        //Sorting the students according to the sum of their marks
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        System.out.println("Before Sort:");
        temp.listAll();
        //Initiating marks sum array
        int n = temp.nofStudents();
        int[] tempM = new int[n];
        //Parsing sum of marks of students into array
        temp.parseMarks(tempM);
        //Calling sort
        temp.sortStudents(tempM);
        System.out.println("After Sort:");
        temp.printSorted(tempM);
    }

    public void disStu(){
        //Listing all students in current department
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        temp.listAll();
    }

    public void genStuMark(){
        //Getting mark-sheet of student by roll number
        Scanner io = new Scanner(System.in);
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        System.out.println("Enter Student Roll:");
        int r = io.nextInt();
        temp.getMarksh(r);
    }

    public boolean isEmpty(){
        //Checking if empty
        return this.arr.isEmpty();
    }

    public void getStuCount(){
        //Getting count of student
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        int c = temp.nofStudents();
        System.out.println("The number of students in this department is : " + c);
    }

    public void remStu(){
        //Removing student by roll number
        System.out.println("Enter roll number to remove");
        Scanner io = new Scanner(System.in);
        int r = io.nextInt();
        DEPARTMENT temp = (DEPARTMENT) this.arr.get(this.cur);
        temp.removeStudent(r);
    }
}
