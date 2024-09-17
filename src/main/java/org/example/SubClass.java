package org.example;

//Child
public class SubClass extends SuperClass{
    public int mySalary;

    SubClass(){
        //super();
        this.mySalary = 50000;
    }

    public void getSalary(){
        super.getSalary();
        System.out.println("Sub Class "+this.mySalary);
        //return this.mySalary;
    }
}
