package org.example;

//Parent
public class SuperClass {
    public int salary = 10;

    SuperClass()
    {
        this.salary = 40000;
    }

    public void getSalary(){
        System.out.println("Super Class "+this.salary);
        //return this.salary;
    }
}
